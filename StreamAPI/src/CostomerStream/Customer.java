package CostomerStream;

public class Customer {
    private String customerName ;
    private double customerDebit;

    public Customer(String customerName, double customerDebit) {
        this.customerName = customerName;
        this.customerDebit = customerDebit;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public double getCustomerDebit() {
        return customerDebit;
    }

    public void setCustomerDebit(double customerDebit) {
        this.customerDebit = customerDebit;
    }

    @Override
    public String toString() {
        return "CostomerStream.Customer{" +
                "customerName='" + customerName + '\'' +
                ", customerDebit=" + customerDebit +
                '}';
    }
}
