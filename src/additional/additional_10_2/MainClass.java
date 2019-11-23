package additional.additional_10_2;

/*
Создайте 1000 транзакций, где personId [1; 30] и amount [-50,000.00; 50,000.00] но не 0.
Рассчитайте баланс для каждой персоны.
Выведите на экран всех должников и их задолженности.
 */

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

public class MainClass {
    public static void main(String[] args) {
        long randomId;
        BigDecimal randomAmount;
        Map<Long, Transaction> map = new HashMap<>();
        for(int i = 1; i <=1000; i++) {              //создаем 1000 транзакций
            randomId = (long) (Math.random() * 30 + 1);         //берем рандомный Id
            randomAmount = new BigDecimal  (Math.random() * 100_001 - 50_000);  //берем рандомный amount

            if (map.containsKey(randomId)) {     //если такой id уже существет то слаживаем amount
                map.put(randomId, new Transaction(randomId, (map.get(randomId).getAmount()).add(randomAmount)) );
            } else {
                map.put(randomId, new Transaction(randomId, randomAmount));
            }
        }

        for (Map.Entry i : map.entrySet()) {   //берем все наборы из map
            Transaction tr = (Transaction) i.getValue();
            if (tr.getAmount().signum() == -1) {   //если amount меньше 0, выводим на экран id : amount
                System.out.println(i.getKey() + " : " +tr.getAmount().setScale(2, BigDecimal.ROUND_DOWN));
            }
        }
    }
}
