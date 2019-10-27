package additional;

/*
Выведите на экран первые 10 членов последовательности Фибоначчи
 */

public class Additional_3_4 {
    public static void main(String[] args) {
        int a = 1;
        int b = 0;
        int temp;

        for (int i = 0; i<10; i++) {
            temp = a + b;
            a = b;
            b = temp;
            System.out.print(temp+ " ");
        }
    }
}
