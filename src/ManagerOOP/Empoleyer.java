package ManagerOOP;

public class Empoleyer {
    public int id;
    public String name;
    public int year;
    public String department;
    public static final int BASE_SALARY = 500;


    public Empoleyer(int no, String name, int year, String department) {
        this.id = no;
        this.name = name;
        this.year = year;
        this.department = department;

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



    public double maasIleGoreHesablanmasi(){
        return year*BASE_SALARY;
    }
    public void strategicPlan() {
        System.out.println(name + " is creating a strategic plan for " + department + " department.");
    }
    public void printInfo() {
        System.out.println("Employee Info: ID=" + id + ", Name=" + name + ", Department=" + department
                + ", Years=" + year + ", Salary=" + maasIleGoreHesablanmasi());
    }
    public void workerInfo(){
        System.out.println("Iscnin adi : "+name+" | Iscinin departamenti : "+department);
    }





}
