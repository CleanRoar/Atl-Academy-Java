package ManagerOOP;

public class Main {
    public static void main(String[] args) {
        Empoleyer empoleyer =new Empoleyer(1123,"Abbas",10,"barista");
        Manager maneger = new Manager(1123,"Cavid",10,"Administrotor",100.0);
        Director direktor =new Director(1123,"Kenas",10,"Founder",200.0);

        empoleyer.maasIleGoreHesablanmasi();
        empoleyer.workerInfo();
        empoleyer.strategicPlan();
        empoleyer.printInfo();

        System.out.println();

        maneger.maasIleGoreHesablanmasi();
        maneger.workerInfo();
        maneger.strategicPlan();
        maneger.printInfo();

        System.out.println();

        direktor.maasIleGoreHesablanmasi();
        direktor.workerInfo();
        direktor.strategicPlan();
        direktor.printInfo();








    }
}
