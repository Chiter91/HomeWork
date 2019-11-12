package offset.offset9;

/*
Определить иерархию домашней техники.
Включить некоторые в розетку.
Посчитать потребляемую мощность.
Провести сортировку приборов в квартире на основе одного из параметров.
Найти кухонный прибор в квартире, соответствующий заданному диапазону параметров.
 */

import java.util.Scanner;

public class MainClass {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int minPower;
        int maxPower;

        Iron i1 = new Iron (10, 450);    //создаем утюг
        i1.setTurnedOn();                          //включаем
        i1.setTemperature(100);                     //устанавливаем параметр
        printSOUt();

        Washer w1 = new Washer(500, 550);
        w1.setTurnedOn();
        w1.modeQuickStart();
        w1.modeSpin();
        w1.setTimer(60);
        printSOUt();

        Washer w2 = new Washer(550, 900);
        w2.setTurnedOn();
        w2.setTimer(120);
        printSOUt();

        Hammer h1 = new Hammer(3, 2);
        h1.setTurnedOn();
        h1.setWeight(3);
        printSOUt();

        ElectricShaver es1 = new ElectricShaver(1,20);
        es1.installBread();
        es1.setTurnedOn();
        printSOUt();

        ElectricShaver es2 = new ElectricShaver(1,20);
        es2.setTurnedOn();
        es2.setTurnedOff();
        printSOUt();

        System.out.println("Потребляемая мощность включенных приборов: " + Logic.totalPower());
        printSOUt();

        System.out.println("Выводим на экран список всех созданных приборов:");
        for(Appliance i : Logic.getAllAppliances())
            System.out.println(i);
        printSOUt();

        Logic.sort();    // сортируем


        System.out.println("Выводим на экран список приборов отсортированых по мощности ");
        for(Appliance i : Logic.getAllAppliances())
            System.out.println(i);
        printSOUt();

        System.out.println("Для поиска прибора введите диапазон значений мощности [MIN MAX]");
        System.out.print("MIN = " );
        minPower = sc.nextInt();
        System.out.print("MAX = ");
        maxPower = sc.nextInt();
        printSOUt();

        System.out.println("Выводим список приборов удовлетворяющих критериям поиска:");
        for (Appliance i : Logic.findAppliance(minPower, maxPower))
            System.out.println(i);
    }

    private static void printSOUt () {
        System.out.println();
    }

}