package assessment.assessment6;

public class Flowers {

    private int lifeDay;
    private double cost;
    private Color color;

    public Flowers(int lifeDay, double cost, String color) {
        this.lifeDay = lifeDay;
        this.cost = cost;
        this.color = Color.valueOf(color);

        Logic.bouquet.add(this);
        Logic.allColor.add(this.color);
    }

    public double getCost() {
        return cost;
    }

    public int getLifeDay() {
        return lifeDay;
    }

    @Override
    public String toString() {
        return "Цветок " + this.getClass().getSimpleName() +
                " {срок жизни: " + lifeDay + " дней" +
                ", стоимость: " + cost + " рублей" +
                ", цвет: " + color +
                '}';
    }
}

enum Color {

    RED,
    ORANGE,
    YELLOW,
    GREEN,
    BLUE,
    VIOLET,
}
