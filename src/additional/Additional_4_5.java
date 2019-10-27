package additional;

/*
Выполнить слияние 3 упорядоченных массивов
 */

public class Additional_4_5 {
    public static void main(String[] args) {
        int[] array1 = {1, 12, 55, 66};
        int[] array2 = {55, 45, 3};
        int[] array3 = {66, 1, 1, 3, 1};
        int[] newArray = new int[array1.length + array2.length + array3.length];  //создаем массив размером суммой трех предыдущих

        for (int i = 0; i < array1.length; i++) {
            newArray[i] = array1[i];
        }

        for (int i = 0; i < array2.length; i++) {
            newArray[array1.length + i] = array2[i];
        }

        for (int i = 0; i < array3.length; i++) {
            newArray[array1.length + array2.length + i] = array3[i];
        }

        for (int i = 0, temp; i < newArray.length; i++) {    //сортируем получившийся масив
            for (int j = i + 1; j < newArray.length; j++) {
                if (newArray[i] > newArray[j]) {
                    temp = newArray[j];
                    newArray[j] = newArray[i];
                    newArray[i] = temp;
                }
            }
        }

        for(int x:newArray)
            System.out.print(x + " ");
    }
}