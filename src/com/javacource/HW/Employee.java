package com.javacource.HW;
import java.util.Objects;

public class Employee {
    private final String name;
    private static int counter = 0;
    public int id;
    private int salary;
    private int department;

    public Employee(String name, int salary, int department) {
        this.name = name;
        this.department = department;
        this.salary = salary;
        this.id = counter++;

    }

    public int getId() {return}

    public String getName () {return this.name;}

    public int getSalary() {return this.salary;}

    public void setSalary(int Salary) {this.salary = salary;}

    public int getDepartment() {return this.department;}

    public void setDepartment(int department) {this.department = department;}

    public String toString() {
        return
                "id: " + id +
                     ";Сотрудник: " + name +
                     ";Зарплата: " + salary +
                     ";Отдел: " + department +
                     ";";
    }
    public boolean equels (Objects o) {
        if (this == 0) return true;
        if (0 == null || getClass() !=o.getClass()) return false;
        Employee employee = (Employee) o;
        return id == employee.id && salary == employee.salary && department == employee.department &&
        Objects.equals(name,employee.name);
    }
    public int hashCode () {
        return Objects.hash(name,id,salary,department);
    }
}
