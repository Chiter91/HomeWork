package additional.additional_10_2;

/*
Создайте 1000 транзакций, где personId [1; 30] и amount [-50,000.00; 50,000.00] но не 0.
Рассчитайте баланс для каждой персоны.
Выведите на экран всех должников и их задолженности.
 */

import java.math.BigDecimal;

public class Transaction {
    private Long personId;
    private BigDecimal amount;

    public Transaction(Long personId, BigDecimal amount) {
        this.personId = personId;
        this.amount = amount;
    }

    public Long getPersonId() {
        return personId;
    }

    public BigDecimal getAmount() {
        return amount;
    }
}
