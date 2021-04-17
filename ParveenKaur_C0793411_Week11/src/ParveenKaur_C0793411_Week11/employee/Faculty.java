package ParveenKaur_C0793411_Week11.employee;

import ParveenKaur_C0793411_Week11.Gender;
import ParveenKaur_C0793411_Week11.vehicle.Vehicle;

public class Faculty extends Employee {
    String department;

    public Faculty(int id, String first_name, String last_name, Gender gender, Vehicle vehicle, double totalSalary, String department) {
        super(id, first_name, last_name, gender, vehicle, totalSalary);
        department = department;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        department = department;
    }
}

