package moneyTest;

import java.util.Objects;

public class Money {

    int money;

    public Money(int money) {
        if (money < 0) {
            //에러 발생
            throw new IllegalArgumentException("[ERROR] 0이상의 돈이 아닙니다."); // 일부로 에러발생
        }
        this.money = money;

    }
    public int plus(int value) {
        return money += value;
    }

    public Money plus(Money value) {
        return new Money(value.plus(money));
    }

    public int minus(int value) {
        if (value >= money) {
            return money -= value;
        }
        throw new IllegalArgumentException("[ERROR] 잔액이 부족합니다.");
    }
    public Money minus(Money value) {
            return new Money(value.minus(money));
//       throw new IllegalArgumentException("[ERROR] 잔액이 부족합니다.");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Money money1 = (Money) o;
        return money == money1.money;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(money);
    }
}
