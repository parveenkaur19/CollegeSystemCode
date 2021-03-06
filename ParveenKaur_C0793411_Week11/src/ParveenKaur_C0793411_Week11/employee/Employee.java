package ParveenKaur_C0793411_Week11.employee;

import ParveenKaur_C0793411_Week11.Gender;
import ParveenKaur_C0793411_Week11.Person;
import ParveenKaur_C0793411_Week11.vehicle.Vehicle;

public class Employee extends Person {
    double totalSalary;

    public Employee(int id, String first_name, String last_name, Gender gender, Vehicle vehicle, double totalSalary) {
        super(id, first_name, last_name, gender, vehicle);
        this.totalSalary = totalSalary;
    }

    public double getTotalSalary() {
        return totalSalary;
    }

    public void setTotalSalary(double totalSalary) {
        this.totalSalary = totalSalary;
    }
}



