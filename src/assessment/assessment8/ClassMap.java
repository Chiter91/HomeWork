package assessment.assessment8;
/*
Напишите метод, который получает на вход массив элементов типа К (Generic) и возвращает Map<K, Integer>,
где K — значение из массива, а Integer — количество вхождений в массив.
Сигнатура метода: <K> Map<K, Integer> arrayToMap(K[] ks)
 */

import java.util.HashMap;
import java.util.Map;

public class ClassMap {
    public static <K> Map<K, Integer> arrayToMap(K[] ks) {
        Map<K, Integer> map = new HashMap<>();

        for (K i : ks) {
            map.put(i, map.containsKey(i) ? map.get(i) + 1 : 1);
        }
        return map;
    }

//    public static void main(String[] args) {
//        Map<Integer, Integer> map = new HashMap<>();
//        map = arrayToMap(new Integer[]{1, 1, 1, 2, 1, 1, 2, 1, 1, 0, 2});//, 3, 4, 1, 3, 2, 5});
//
//
//
//        for (Map.Entry i : map.entrySet()) {
//            System.out.println(i);
//        }
//    }
}
