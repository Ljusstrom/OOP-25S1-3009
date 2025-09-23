package application;

import entity.*;
import dao.*;

import java.util.List;

public class CompanyApp {
    public static void main(String[] args) {

        EmployeeDao empdao = new EmployeeDao();

        empdao.persist(new Employee("Viivi", "Puro", "viivip@mymail.fi", 7300.00));
        empdao.persist(new Employee("Tero", "Koski", "tero.koski@mymail.fi", 3750.00));

        Employee emp = empdao.find(1);
        if (emp != null) {
            emp.setLastName("Koski");
            empdao.update(emp);
            System.out.println(emp.getFirstName() + " " + emp.getLastName());
        }
        else {
            System.out.println("Ei löytynyt riviä id:llä 1");
        }

        List<Employee> list = empdao.findAll();
        for (Employee e : list) {
            System.out.println(e.getFirstName() + ", " + e.getLastName() + ": " + e.getSalary());
        }
        System.out.println("Haetaan id 5:");
        Employee e = empdao.find(5);
        if (e != null) {
            System.out.println(e.getFirstName() + ", " + e.getLastName() + ": " + e.getSalary());
        }
        else {
            System.out.println("Ei löytynyt riviä id:llä 5");
        }
    }
}
