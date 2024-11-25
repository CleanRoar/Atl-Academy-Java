package ManagerOOP;

public class Manager extends Empoleyer{
    public String departmentManaged;
    public static final int MANAGEMENT_PAYMENT =5000;

    public Manager(int no, String name, int year, String department, String departmentManaged) {
        super(no, name, year, department);
        this.departmentManaged = departmentManaged;
    }

    public String getDepartmentManaged() {
        return departmentManaged;
    }

    public void setDepartmentManaged(String departmentManaged) {
        this.departmentManaged = departmentManaged;
    }

    @Override
    public double maas() {
        return super.maas()+bonus+MANAGEMENT_PAYMENT;
    }
}
