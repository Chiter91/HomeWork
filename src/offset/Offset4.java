package offset;

/*
Для введенного целого числа определить является ли это число простым
 */

import java.util.Scanner;

public class Offset4 {
    public static void main (String[] args) {
        boolean result = false;

        Scanner sc = new Scanner(System.in);

        int number = sc.nextInt();

        for (int i = 2; i<=number; i++) {
            if (number % i == 0 && i != number) {   //делится без остатка, но не на себя - Число составное
                result = false;
                break;
            }
            result = true;
        }
        System.out.println(number + (result ? " - простое число" : " - составное число"));
    }
}
