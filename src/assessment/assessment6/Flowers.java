package assessment.assessment6;

public class Flowers {

    private int lifeDay;
    private double cost;
    private Color color;
    private Name name;

    public Flowers(int lifeDay, double cost, String color, String name) {
        this.lifeDay = lifeDay;
        this.cost = cost;
        this.color = Color.valueOf(color);
        this.name = Name.valueOf(name);
    }

    public double getCost() {
        return cost;
    }

    public int getLifeDay() {
        return lifeDay;
    }

    public Color getColor() {
        return color;
    }

    @Override
    public String toString() {
        return "Цветок " + name.getName() +
                " {срок жизни: " + lifeDay + " дней" +
                ", стоимость: " + cost + " рублей" +
                ", цвет: " + color.getColor() +
                '}';
    }
}

enum Name {
    CLOVE ("Гвоздика"),
    LILY ("Лилия"),
    ORCHID ("Орхидея"),
    ROSE ("Роза"),
    TULIP ("Тюльпан");

    private String name;

    Name (String name) {
        this.name = name;
    }

    public String getName () {
        return name;
    }
}
