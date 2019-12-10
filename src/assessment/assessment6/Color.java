package assessment.assessment6;

public enum Color {
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
