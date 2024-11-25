package BankAppFullOOP;

abstract class BankOperation {
    public abstract double checkBalance();
    public abstract void addBalance(double amount) throws InvalidAmountException;
}
