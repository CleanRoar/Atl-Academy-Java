package ManagerOOP;

public class Director extends Manager{
    public double bonus;
    public static final int DIRECTOR_PAYMENT =5000;

    public Director(int no, String name, int year, String department, String departmentManaged, double bonus) {
        super(no, name, year, department, departmentManaged);
        this.bonus = bonus;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    @Override
    public double maas() {
        return super.maas()+bonus+MANAGEMENT_PAYMENT+DIRECTOR_PAYMENT;
    }
}
