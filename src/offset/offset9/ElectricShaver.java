package offset.offset9;

public class ElectricShaver extends Appliance {

    private Head head;

    public ElectricShaver (int size, int power) {
        super(size, power);
        System.out.println("Создали " + toString());
        Logic.getAllAppliances().add(this);
    }

    public void installMustache() {
        this.head = Head.MUSTACHE;
        System.out.println("Установлена насадка для усов");
    }

    public void installBread() {
        this.head = Head.BEARD;
        System.out.println("Установлена насадка для бороды");
    }

    public void installWhiskers() {
        this.head = Head.WHISKERS;
        System.out.println("Установлена насадка для бакенбардов");
    }

    @Override
    public String toString() {
        return "Электробритва{" +
                "Мощность=" + getPower() +
                '}';
    }
}

enum Head {
    MUSTACHE,   //усы
    BEARD,       //борода
    WHISKERS      //бакенбарды
}