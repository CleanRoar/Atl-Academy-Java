package ManagerOOP;

public class Director extends Manager{
    public double bonus;
    public static final int DIRECTOR_PAYMENT =5000;


    public Director(int no, String name, int year, String department, double bonus) {
        super(no, name, year, department, bonus);
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    @Override
    public double maasIleGoreHesablanmasi() {
        return super.maasIleGoreHesablanmasi()+bonus+MANAGEMENT_PAYMENT+DIRECTOR_PAYMENT;
    }

    @Override
    public void strategicPlan() {
        super.strategicPlan();

    }

    @Override
    public void workerInfo() {
        super.workerInfo();

    }

    @Override
    public void printInfo() {
        super.printInfo();

    }
}

