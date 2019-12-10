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

        Bouquet b1 = new Bouquet();

        b1.add(new Clove (5, 15, "BLUE"));
        b1.add(new Lily(6, 5.5, "RED"));
        b1.add(new Rose(10, 20, "BLUE"));
        b1.add(new Orchid(20, 30.5, "GREEN"));
        b1.add(new Orchid(20, 33, "RED"));
        b1.add(new Tulip(5, 5.11, "VIOLET"));

        System.out.println("Букет состоит из:");

        for(Flowers i : b1.getListBouquet()) {
            System.out.println(i);
        }

        System.out.println();

        System.out.println("Стоимость букета: " + b1.totalCount());

        System.out.println("Все цвета используемые в букете:" + b1.getAllColor());

        System.out.println("Букет полностью завянет через: " + b1.lifeSpan() + " дней");
    }
}