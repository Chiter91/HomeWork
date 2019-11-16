package offset.offset10;

import java.util.ArrayList;

public class Result {

    private static ArrayList<Result> list = new ArrayList<>();  //лист для хранения результатов

    private String typeCollection;
    private String dateCollection;
    private long elementCount;
    private Operation type;
    private int time;

    Result (String typeCollection, String dateCollection,  long elementCount, Operation type, int time) {

        this.typeCollection = typeCollection;
        this.dateCollection = dateCollection;
        this.elementCount = elementCount;
        this.type = type;
        this.time = time;
    }

    static ArrayList<Result> getList() {
        return list;
    }

    Operation getType() {
        return type;
    }

    @Override
    public String toString() {
        return  "Тип коллекции: " + typeCollection +
                ", тип данных: " + dateCollection +
                ", количество элементов: " + elementCount +
                ", операция: " + type.getDisplayName() +
                ", время: " + time +
                "ms";
    }
}

enum Operation {
    ADD ("добавления элементов"),
    REMOVE ("удаления элементов"),
    Contains ("поиск элементов");

    private String displayName;

    Operation (String displayName) {
        this.displayName = displayName;
    }

    public String getDisplayName() {
        return displayName;
    }
}
