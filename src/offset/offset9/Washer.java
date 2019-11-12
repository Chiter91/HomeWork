package offset.offset9;

public class Washer extends Appliance {

    private Mode mode;
    private int timer;

    public Washer (int size, int power) {
        super(size, power);
        System.out.println("Создали " + toString());
        Logic.getAllAppliances().add(this);
    }

    public void modeQuickStart () {
        this.mode = Mode.QUICKSTART;
        System.out.println("Установлен режим быстрой стирки");
    }

    public void modeRinse () {
        this.mode = Mode.RINSE;
        System.out.println("Установлен режим ополаскивания");
    }

    public void modeSpin () {
        this.mode = Mode.SPIN;
        System.out.println("Установлен режим отжима");
    }

    public void setTimer (int timer) {
        this.timer = timer;
        System.out.println("Таймер установлен на " + timer + " секунд.");
    }

    public int getTimer () {
        return timer;
    }

    @Override
    public String toString() {
        return "Стиралка{" +
                "Мощность=" + getPower() +
                '}';
    }
}

enum Mode {
    QUICKSTART,  //быстрая стирка
    RINSE,      //ополаскивание
    SPIN       //отжим
}
