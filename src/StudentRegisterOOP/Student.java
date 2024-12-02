package StudentRegisterOOP;

import java.time.Duration;
import java.time.LocalDate;
import java.time.Period;

public class Student {

    private String name;
    private LocalDate bornTime;

    public Student(String name, LocalDate bornTime) {
        this.name = name;
        this.bornTime = bornTime;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getBornTime() {
        return bornTime;
    }

    public void setBornTime(LocalDate bornTime) {
        this.bornTime = bornTime;
    }

    public int yasHesabla() {

        return Period.between(bornTime, LocalDate.now()).getYears();
    }

    @Override
    public String toString() {
        return "Ad: " + name + ", Doğum tarixi: " + bornTime;
    }
}
