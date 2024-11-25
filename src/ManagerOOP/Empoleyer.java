package ManagerOOP;

public class Empoleyer {
    public int id;
    public String name;
    public int year;
    public String department;
    public static final int BASE_SALARY = 500;
    public double bonus;

    public Empoleyer(int no, String name, int year, String department) {
        this.id = no;
        this.name = name;
        this.year = year;
        this.department = department;
        this.bonus=bonus;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getDepartment() {
        return department;
    }


    public void setDepartment(String department) {
        this.department = department;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    public double maas(){
        return BASE_SALARY+bonus;
    }
}
