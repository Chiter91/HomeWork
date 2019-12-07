package assessment.assessment6;

public class Flowers {

    private int lifeDay;
    private double cost;
    private Color color;

    public Flowers(int lifeDay, double cost, String color) {
        this.lifeDay = lifeDay;
        this.cost = cost;
        this.color = Color.valueOf(color);

        Bouquet.bouquetList.add(this);
        Bouquet.allColor.add(this.color);
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
                ", цвет: " + color.getColor() +
                '}';
    }
}

enum Color {

    RED ("Красный"),
    ORANGE ("Оранжевый"),
    YELLOW ("Желтый"),
    GREEN ("Зеленый"),
    BLUE ("Синий"),
    VIOLET ("Фиолетовый");

    private String color;

    Color(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }
}
