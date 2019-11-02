package assessment;

/*
Создать двумерный квадратный массив размера n.
Заполнить его случайными числами таким образом:

числа по диагонали равны 0;
вверху и снизу от пересечения диагоналей находятся только положительные числа;
слева и справа от пересечения диагоналей находятся только отрицательные числа;

Вывести массив на экран.

Найти сумму всех элементов
Найти среднее арифметическое всех элементов, которые больше суммы всех элементов


Пример:
 0  4  5  5  3  8  0
-2  0  5  6  3  0 -4
-2 -8  0  6  0 -1 -2
-5 -9 -2  0 -9 -7 -3
-6 -2  0  1  0 -1 -5
-2  0  3  5  2  0 -8
 0  4  2  9  1  3  0

Суммa всех элементов: -3
Cреднее арифметическое всех элементов больше -3: 1.6579
 */

import java.util.Scanner;

public class Assessment4 {
    private static int amount = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        System.out.print("Введите размер квадратной матрицы: ");

        int[][] array = createAndPrintArray(sc.nextInt());

        System.out.printf("Суммa всех элементов: %d\n", amount);
        System.out.printf("Cреднее арифметическое всех элементов больше %d : %.4f", amount, findAverage(array));
    }

    private static int[][] createAndPrintArray (int x) {
        int[][] array = new int[x][x];

        for (int i = 0; i < array.length; i++) {               //создаем матрицу и заполняем ее
            for (int j = 0; j < array[i].length; j++) {
                if (i == j || j == array[i].length - 1 - i)
                    array[i][j] = 0;

                else if (i < j && j < array[i].length - 1 - i)
                    array[i][j] = (int) ((Math.random() * 10) +1);

                else if (i > j && j > array[i].length - 1 - i)
                    array[i][j] = (int) ((Math.random() * 10) +1);

                else
                    array[i][j] = (int) ((Math.random() * -10) - 1);

                amount += array[i][j];                                    //сразу суммируем все элементы

                System.out.printf("%4d ", array[i][j]);                 //и печатаем созданную матрицу
            }
            System.out.println();
        }
        System.out.println();
        return array;
    }

    private static double findAverage (int [][] array) {
        int temp = 0;
        int counter = 0;
        for (int[] ar : array)
            for(int i : ar)
                if(i > amount) {
                    temp += i;         //суммируем значения больше суммы всех элементов
                    counter ++;        //считаем кол-во ячеек содержащих значения больше суммы всех элементов
                }
        if (counter == 0)
            counter = 1;

    return temp / (double) counter;
    }
}