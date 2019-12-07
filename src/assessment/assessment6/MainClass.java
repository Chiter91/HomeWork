package assessment.assessment6;

/*
Реализовать иерархию цветов (розы, гвоздики, тюльпаны, лилии и... что-то на свой вкус).

Создать несколько объектов-цветов.
Собрать букет и определить его стоимость.
Определить все цвета, используемые в букете.
Определить когда весь букет завянет.

В букет может входить несколько цветов одного типа.
 */

public class MainClass {
    public static void main(String[] args) {
        Clove clove1 = new Clove (5, 15, "BLUE");
        Lily l1 = new Lily(6, 5.5, "RED");
        Rose r1 = new Rose(10, 20, "BLUE");
        Orchid o1 = new Orchid(20, 30.5, "GREEN");
        Orchid o2 = new Orchid(20, 33, "RED");
        Tulip t1 = new Tulip(5, 5.11, "VIOLET");

        System.out.println("Букет состоит из:");

        for(Flowers i : Bouquet.bouquetList) {
            System.out.println(i);
        }

        System.out.println();

        System.out.println("Стоимость букета: " + Bouquet.totalCount());

        System.out.println("Все цвета используемые в букете:" + Bouquet.getAllColor());

        System.out.println("Букет полностью завянет через: " + Bouquet.lifeSpan() + " дней");
    }
}