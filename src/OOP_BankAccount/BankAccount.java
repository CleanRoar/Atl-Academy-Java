package OOP_BankAccount;

public class BankAccount {
    private String accountNumber;
    private double amount;

    public BankAccount(String accountNumber, double amount) {
        this.accountNumber = accountNumber;
        this.amount = amount;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        if (amount<0){
            System.out.println("sizin balans menfi ola bilmez !");
            this.amount=amount;
        }
    }
    public void accountInfo(){
        System.out.println("Sizin hesabiniz nomresi : "+accountNumber);
        System.out.println("Sizin hal-hazirdaki balansiniz : "+amount);
    }

    //************************************************************************
    public void Deposit(int deposit){
        if (deposit>0){
            amount+=deposit;
            System.out.println("Siniz artirilmis balansiniz : "+amount);
        }
    }
    public void WithDraw(int withDraw){
        if(amount<=0 && withDraw>amount){
            System.out.println("Yetersiz bakiyeee");
        }
        else {
            amount-=withDraw;
            System.out.println("Sizin cixilmis balansiniz : "+amount);
        }

    }
    public void lastAmount(){
        System.out.println("Sizin yenilenmis balansiniz : "+amount);
    }
}



