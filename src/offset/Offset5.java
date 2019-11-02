package offset;
/*
Электронные часы показывают время в формате от 00:00 до 23:59.
Подсчитать сколько раз за сутки случается так, что слева от двоеточия показывается симметричная комбинация для той,
что справа от двоеточия (например, 02:20, 11:11 или 15:51)
 */

public class Offset5 {
    public static void main(String[] args) {
        byte count = 0;
        int hour[][] = new int[24][2];
        int minute[][] = new int[60][2];

        for (int i = 0; i < 24; i++) {     //заполняем масив "часы"
            int j = 0;
            hour[i][j] = i / 10;
            hour[i][j+1] = i % 10;
        }

        for (int i = 0; i < 60; i++) {        //заполняем масив "минуты"
            int j = 0;
            minute[i][j] = i / 10;
            minute[i][j+1] = i % 10;
        }

        for (int i = 0; i<hour.length; i++) {       //выводим симметричные числа на часах
            for (int j = 0; j<minute.length; j++) {
                int x = 0;
                if (hour [i][x] == minute[j][x+1] && hour[i][x+1] == minute[j][x]) {
                    count +=1;
                    break;      //если нашли симметрию то выходим из вложенного цикла для экономии времени
                }
            }
        }
        System.out.print(count);
    }
}