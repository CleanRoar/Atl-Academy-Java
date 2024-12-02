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
        System.out.println(name + " is creating a strategic plan for " + department + " department.");
    }

    @Override
    public void workerInfo() {
        super.workerInfo();
        System.out.println("Iscnin adi : "+name+" | Iscinin departamenti : "+department);
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Manager Info: ID=" + id + ", Name=" + name + ", Department=" + department
                + ", Years=" + year + ", Salary=" + maasIleGoreHesablanmasi() + ", Bonus=" + bonus);
    }


}
