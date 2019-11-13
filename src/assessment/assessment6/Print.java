package assessment.assessment6;

public class Print {
    public static void printToConsole() {

        System.out.println("Букет состоит из:");
        for(Flowers i : Logic.bouquet)
            System.out.println(i);

        System.out.println();

        System.out.println("Стоимость букета: " + Logic.totalCount());

        System.out.println("Все цвета используемые в букете:" + Logic.getAllColor());

        System.out.println("Букет полностью завянет через: " + Logic.lifeSpan() + " дней");
    }
}