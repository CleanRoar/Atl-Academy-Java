package BankAppFullOOP;

public class BankCustomer extends BankOperation implements PaymentService{
    private Customer customer;
    public BankCustomer(Customer customer) {
        this.customer = customer;
    }

    @Override
    public double checkBalance() {
        return customer.getBalance();
    }

    @Override
    public void addBalance(double amount) throws InvalidAmountException {
        if (amount <= 0) {
            throw new InvalidAmountException("Məbləğ sıfır və ya mənfi ola bilməz!");
        }
        customer.setBalance(customer.getBalance() + amount);
    }

    @Override
    public void pay(double amount) throws InsufficientFundsException, InvalidAmountException {
        if (amount <= 0) {
            throw new InvalidAmountException("Ödəniş məbləği sıfır və ya mənfi ola bilməz!");
        }
        if (amount > customer.getBalance()) {
            throw new InsufficientFundsException("Balans kifayət etmir!");
        }
        customer.setBalance(customer.getBalance() - amount);
    }

    @Override
    public void refund(double amount) throws InvalidAmountException {
        if (amount <= 0) {
            throw new InvalidAmountException("Geri qaytarma məbləği sıfır və ya mənfi ola bilməz!");
        }
        customer.setBalance(customer.getBalance() + amount);
    }
}
