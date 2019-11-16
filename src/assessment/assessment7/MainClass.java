package assessment.assessment7;

public class MainClass {
    public static void main(String[] args) {
        Pair<Integer, String> p1 = new Pair<>(11, "Hello World");

        System.out.println(p1.first() + " _ " + p1.last());

        p1.swap();

        System.out.println(p1.first() + " _ " + p1.last());

        p1.replaceFirst(99);

        p1.replaceLast("QWERTY");

        System.out.println(p1.first() + " _ " + p1.last());

        p1.swap();

        System.out.println(p1.first() + " _ " + p1.last());

    }
}
