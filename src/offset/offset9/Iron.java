package offset.offset9;

public class Iron extends Appliance {

    private int temperature;

    public Iron (int size, int power) {
        super(size, power);
        System.out.println("Создали " + toString());
        Logic.getAllAppliances().add(this);
    }

    public void setTemperature (int temperature) {
        this.temperature = temperature;
        System.out.println("Темература нагрева увеличили до " + temperature);
    }

    public int getTemperature () {
        return temperature;
    }

    @Override
    public String toString() {
        return "Утюг{" +
                "Мощность=" + getPower() +
                '}';
    }
}