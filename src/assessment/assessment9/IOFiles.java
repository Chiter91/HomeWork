package assessment.assessment9;

/*
Даны 2 файла - in1.txt и in2.txt в каждом файле по 1000 чисел от 1 до 100000.
Создайте файл out.txt, который будет содержать все отсортированные числа из файлов in1.txt и in2.txt.
Файлы in1.txt и in2.txt можно создать с помощью кода.
 */

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class IOFiles {
    public static void main(String[] args) {
        //Создаем два файла
        for (int i = 1; i <= 2; i++) {
            try (BufferedWriter bw = new BufferedWriter(
                    new FileWriter(
                            "src/assessment/assessment9/in" + i + ".txt"))) {
                for (int j = 1; j<= 1000; j++) {

                    int number = (int) (Math.random() * 100000) + 1;
                    bw.write(String.valueOf(number));
                    bw.write(System.lineSeparator());
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        //Создаем коллекцию для хранения считанных данных
        List<Integer> list = new ArrayList<>();
        //Считываем числа из файлов и записываем в коллекцию
        for (int i = 1; i <= 2; i++) {
            try (BufferedReader br1 = new BufferedReader(
                    new FileReader(
                            "src/assessment/assessment9/in" + i + ".txt"))) {
                String s;
                while ((s = br1.readLine()) != null) {
                    Integer number = Integer.parseInt(s);
                    list.add(number);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        //Сортируем коллекцию
        Collections.sort(list);
        //Записываем отсортированные данные в файл
        try (BufferedWriter bw = new BufferedWriter(
                new FileWriter(
                        "src/assessment/assessment9/out.txt"))) {
            for(int i : list) {
                bw.write(String.valueOf(i));
                bw.write(System.lineSeparator());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
