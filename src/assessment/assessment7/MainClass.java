package assessment.assessment7;

public class MainClass {
    public static void main(String[] args) {
//        PairOld<Integer, String> p1 = new PairOld<>(11, "Hello World");
//        System.out.println(p1.first() + " _ " + p1.last());
//        p1.swap();
//        System.out.println(p1.first() + " _ " + p1.last());
//        p1.replaceFirst(99);
//        p1.replaceLast("QWERTY");
//        System.out.println(p1.first() + " _ " + p1.last());
//        p1.swap();
//        System.out.println(p1.first() + " _ " + p1.last());

        Pair<Integer, String> p2 = new Pair<>(11, "Hello World");

        System.out.println("Первый элемент: " + p2.first());
        System.out.println("------------------------");
        System.out.println("Второй элемент: " + p2.last());
        System.out.println("------------------------");
        System.out.println("Первый элемент: " + p2.swap().first());
        System.out.println("------------------------");
        System.out.println("Первый элемент: " + p2.first());

    }
}
