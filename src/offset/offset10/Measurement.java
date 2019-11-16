package offset.offset10;

import java.util.Collection;

class Measurement {

    private Collection c;
    private long elementCount;
    private String tc;      //переменная для хранения типа коллекции
    private String dc;      //переменная для хранения типа данных коллекции
    private long start;    //для хранения времени начала операции
    private int time;      //время выполнения операции

    Measurement(Collection c, long elementCount) {
        this.c = c;
        this.elementCount = elementCount;
        this.tc = c.getClass().getSimpleName();     // из конструктора получаем тип коллекции
        measureAdd();                              // запускаем все операции из конструктора
        measureContains();
        measureRemove();
    }

    private void measureAdd() {
        start = System.currentTimeMillis();
        for (int i = 0; i < elementCount; i++) {
            c.add(i + "");
        }
        time = (int) (System.currentTimeMillis() - start);
        dc = c.iterator().next().getClass().getSimpleName();       //определяем тип данных в колекции
        Result.getList().add(new Result(tc, dc, elementCount, Operation.ADD, time));
    }

    private void measureContains() {
        start = System.currentTimeMillis();
        for (int i = 0; i < elementCount; i++) {
            c.contains(i + "");
        }
        time = (int) (System.currentTimeMillis() - start);
        Result.getList().add(new Result(tc, dc, elementCount, Operation.Contains, time));
    }

    private void measureRemove() {
        start = System.currentTimeMillis();
        for (int i = 0; i < elementCount; i++) {
            c.remove(i + "");
        }
        time = (int) (System.currentTimeMillis() - start);
        Result.getList().add(new Result(tc, dc, elementCount, Operation.REMOVE, time));
    }
}