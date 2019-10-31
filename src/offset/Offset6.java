package offset;

/*
Найти максимальный и минимальные элементы массива и вывести их индексы на экран
 */

import java.util.Scanner;

public class Offset6 {
    public static void main (String[] args) {
        int[] array;
        int rangeMin, rangeMax, size;
        Scanner sc = new Scanner(System.in);

        System.out.print("Введите размер массива: ");
        size = sc.nextInt();
        System.out.print("Введите минимальное значение элемента массива: ");
        rangeMin = sc.nextInt();
        System.out.print("Введите максимальное значение элемента массива: ");
        rangeMax = sc.nextInt();

        array = createArray (size, rangeMin, rangeMax);  //создаем необходимый масив

        printArray(array, "Выводим полученный масив: ");   //печатаем созданный масив

        logic(array);
    }

    private static int[] createArray (int size, int rangeMin, int rangeMax) {
        int[] array = new int[size];
        for (int i = 0; i < array.length; i++)
            array[i] = (int) ((Math.random() * (rangeMax + 1 - rangeMin)) + rangeMin);
        return array;
    }
    
    private static void printArray (int[] array, String s) {
        System.out.println(s);
        for (int i : array)
            System.out.print(i + " ");
        System.out.println();
    }

    private static void logic (int[] array) {
                                                    //Как лучше объявлять переменные ???
        int min = array[0], max = min;                                          //Вариант 1
        int countMin = 0, countMax = 0, indexMin = 0, indexMax = 0;

//        int min = array[0];                                                      //Вариант 2
//        int max = min;
//        int countMin = 0;
//        int countMax = 0;
//        int indexMin = 0;
//        int indexMax = 0;

        for(int i : array) {              //ищем мин. и макс. элементы и подсчитываем их кол-во
            if(min > i) {
                min = i;
                countMin = 1;
            }
            else if (min == i)
                countMin ++;

            if (max < i) {
                max = i;
                countMax = 1;
            }
            else if (max == i)
                countMax++;
        }

        int[] minElementArray = new int[countMin];  //создаем масив содержащий индексы с мин. значениями
        int[] maxElementArray = new int[countMax];  //создаем масив содержащий индексы с макс. значениями

        for (int i = 0; i < array.length; i++) {    //заполняем новые масивы
            if (array[i] == min)
                minElementArray[indexMin++] = i;
            if (array[i] == max)
                maxElementArray[indexMax++] = i;
        }
        printArray(minElementArray, "\nНомер(а) индекса(ов) с минимальным значением: ");     //выводим новые масивы
        printArray(maxElementArray, "\nНомер(а) индекса(оа) с максимальными значениями: ");
    }
}