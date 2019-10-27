package additional;

/*
Для введённого пользователем с клавиатуры натурального числа посчитайте сумму всех его цифр
(заранее не известно сколько цифр будет в числе)
 */

import java.util.Scanner;

public class Additional_3_5 {
    public static void main (String[] args) {
        int count = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите натеральное число: ");
        int x = sc.nextInt();

        while (x > 0) {
            count += x % 10;
            x/=10;
        }

        System.out.println("Сумма всех чисел: " + count);
    }
}