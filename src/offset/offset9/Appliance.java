package offset.offset9;

public class Appliance {
    private int size;
    private int power;
    private boolean isTurnedOn = false;

    public Appliance(int size, int power) {
        this.size = size;
        this.power = power;
    }

    public Appliance(int size) {
        this.size = size;
    }

    public void setTurnedOn() {
        if (power > 0) {
            isTurnedOn = true;
            Logic.getAllAppliancesTurnedOn().add(this);
        } else
            System.out.println("Этот прибор неозможно включить");
    }

    public void setTurnedOff() {
        isTurnedOn = false;
        Logic.getAllAppliancesTurnedOn().remove(this);
    }

    public boolean isTurnedOn() {
        return isTurnedOn;
    }

    public int getSize() {
        return size;
    }

    public int getPower() {
        return power;
    }
}