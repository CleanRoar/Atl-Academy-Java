package ManagerOOP;

public class Manager extends Empoleyer{
    double bonus;
    public static final int MANAGEMENT_PAYMENT =5000;



    public Manager(int no, String name, int year, String department, double bonus) {
        super(no, name, year, department );
        this.bonus = bonus;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    @Override
    public double maasIleGoreHesablanmasi() {
        return super.maasIleGoreHesablanmasi()+MANAGEMENT_PAYMENT+bonus;
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
