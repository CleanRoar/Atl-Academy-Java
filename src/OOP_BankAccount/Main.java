package OOP_BankAccount;

public class Main {
    public static void main(String[] args) {
        BankAccount account= new BankAccount("Az1234",500.0);
        account.accountInfo();
        account.Deposit(200);
        account.WithDraw(125);
        account.lastAmount();


    }
}
