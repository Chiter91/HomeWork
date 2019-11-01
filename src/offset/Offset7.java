package offset;

/*
Создать массив заполнить его случайными элементами, распечать, перевернуть, и снова распечатать

При перевороте элементов не желательно создавать еще один массив
 */

import java.util.Scanner;

public class Offset7 {
    public static void main(String[] args) {
        int[] array;
        int rangeMin, rangeMax, size;
        Scanner sc = new Scanner(System.in);

        System.out.print("Введите размер массива: ");
        size = sc.nextInt();
        System.out.print("Введите минимальное значение элемента массива: ");
        rangeMin = sc.nextInt();
        System.out.print("Введите максимальное значение элемента массива: ");
        rangeMax = sc.nextInt();

        array = createArray(size, rangeMin, rangeMax);         //создаем массив

        printArray(array);                              //печатаем массив

        printArray(rotate(array));                       //печатаем масив после переворота
    }

    private static int[] createArray (int size, int min, int max) {
        int[] array = new int[size];

        for(int i = 0; i < array.length; i++) {
            array[i] = (int) ((Math.random() * (max + 1 - min)) + min);
        }
        return array;
    }

    private static void printArray (int[] array) {
        for(int i : array)
            System.out.print(i + " ");
        System.out.println();
    }

    private static int[] rotate (int[] array) {
        int temp;

        for (int i = 0; i < array.length/2; i++) {
            temp = array[i];
            array[i] = array[array.length - 1 - i];
            array[array.length - 1 - i] = temp;
        }
        return array;
    }
}