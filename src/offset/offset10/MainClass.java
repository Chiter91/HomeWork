package offset.offset10;

/*
Напишите 2 класса Measurement and Result, где класс Measurement содержит:

Measurement(Collection c, long elementsCount) конструктор класса
Result measureAdd() измеряет время добавления элементов
Result measureRemove() измеряет время удаления элементов
Result measureContains() измеряет время поиска элементов

а класс Result обладает свойствами:
Тип коллекции - String
Тип данных - String
Количество элементов - long
Тип операции - enum
время - int
перегруженный toString() который выводит результат, например:
Тип коллекции: ArrayList, тип данных: String, количество элементов: 100000, операция: удаление элемента, время: 5642ms

Добавить main() метод, который проверяет LinkedList, ArrayList, HashSet, TreeSet со 100, 10000, 1000000 элементами все операции.
Соберите результаты в коллецию и выведите на экран

добавьте в enum свойство String displayName, в котором будет хранится значение для вывода экран
 */

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.TreeSet;

public class MainClass {

    private static final int HUNDRED = 100;
    private static final int TEN_THOUSAND = 10_000;
    private static final int MILLION = 1_000_000;

    public static void main(String[] args) {

        Measurement l1 = new Measurement(new LinkedList(), HUNDRED);

        Measurement a1 = new Measurement(new ArrayList(), HUNDRED);

        Measurement h1 = new Measurement(new HashSet(), HUNDRED);

        Measurement t1 = new Measurement(new TreeSet(), HUNDRED);

        Measurement l2 = new Measurement(new LinkedList(), TEN_THOUSAND);

        Measurement a2 = new Measurement(new ArrayList(), TEN_THOUSAND);

        Measurement h2 = new Measurement(new HashSet(), TEN_THOUSAND);

        Measurement t2 = new Measurement(new TreeSet(), TEN_THOUSAND);

        Measurement l3 = new Measurement(new LinkedList(), MILLION);

        Measurement a3 = new Measurement(new ArrayList(), MILLION);

        Measurement h3 = new Measurement(new HashSet(), MILLION);

        Measurement t3= new Measurement(new TreeSet(), MILLION);

        for (Result i : Result.getList()) {
            System.out.println(i);
            if (i.getType() == Operation.REMOVE)    //выводим пустую стоку после прохода всех операций для объекта
                System.out.println();
        }
    }
}
