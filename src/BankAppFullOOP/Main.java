package BankAppFullOOP;

public class Main {
    public static void main(String[] args) {
        try {

            Customer customer = new Customer("Kenas","12311",500.0);
            BankCustomer bankCustomer = new BankCustomer(customer);
            System.out.println("Cari balans: " + bankCustomer.checkBalance());

            bankCustomer.addBalance(150.0);
            System.out.println("Balans artırıldıqdan sonra: " + bankCustomer.checkBalance());

            bankCustomer.pay(100.0);
            System.out.println("Ödənişdən sonra balans: " + bankCustomer.checkBalance());


            bankCustomer.refund(50.0);
            System.out.println("Geri qaytarmadan sonra balans: " + bankCustomer.checkBalance());

        } catch (InvalidAmountException | InsufficientFundsException e) {
            System.out.println("Xəta: " + e.getMessage());
        }
    }
}
