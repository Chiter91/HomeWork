package offset.offset9;

public class Hammer extends Appliance {

    int weight;

    public Hammer (int size, int weight) {
        super(size);
        System.out.println("Создали " + toString());
        Logic.getAllAppliances().add(this);
        this.weight = weight;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Молоток{" +
                "Мощность=" + getPower() +
                '}';
    }
}