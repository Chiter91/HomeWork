package offset;
/*
Напишите программу расчета даты следующего дня введя 3 числа - день месяц и год
Примеры работы программы:

15
3
2000
16 3 2000

31
12
1999
1 1 2000
 */

import java.util.Scanner;

public class Offset2 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int day = sc.nextInt();
        int month = sc.nextInt();
        int year = sc.nextInt();
        boolean lofty = true;
        int quantityDay;

        if (year % 4 != 0 || (year % 100 == 0 && year % 400 != 0))  //проверяем на высокосный год
            lofty = false;

        if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) //определяем количество дней в месяце
            quantityDay = 31;
        else if (month == 4 || month == 6 || month == 9 || month == 11)
            quantityDay = 30;
        else if (month == 2 && lofty)
            quantityDay = 29;
        else
            quantityDay = 28;

        day++;
        if (day > quantityDay) {  //добавляем 1 день и при необходимости меняем остальные значения
            day = 1;
            month++;
            if (month > 12) {
                month = 1;
                year++;
            }
        }
        System.out.println(day + " " + month + " " + year);
    }
}