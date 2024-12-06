import BankAccount1206.BankAccount;
import moneyTest.Money;

public class ctPractice {


    public static void main(String[] args) {
        BankAccount one = new BankAccount("111-1111-1111", new Money(0), "이효리");

        Money money = new Money(1000);
        one.deposit(money);
        one.deposit(money);
        one.deposit(money);
        one.getBalance();

    }
}
