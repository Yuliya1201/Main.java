package com.javacource.HW.com;

import com.javacource.HW.Employee;

public class Main {
    
      public static void main(String[] args) {
        employees = new Employee[]{
                new Employee("Гаримов Андрей Юрьевич", 12000, 1),
                null,
                new Employee("Сидоренко Виталий Максимович", 50000, 2),
                new Employee("Козлова Татьяна Ивановна", 7500, 2),
                new Employee("Коч Елена Игоревна", 22000, 2),
                new Employee("Мелик Игорь Игоревич", 18000, 3),
                new Employee("Ромина Галина Юрьевна", 19000, 1),
                new Employee("Гурин Андрей Владиславович", 300_000, 3),
                new Employee("Сыч Даниил Артемович", 200_000, 3),
                new Employee("Кузин Евгений Олегович", 150_000, 2)
        };
        employees[0] = new Employee("Гаримов Андрей Юрьевич", 12000, 1);
        ppintFullName();
        printEmployees();
        System.out.println("avg =" + calculateAverageSalary());
        System.out.println("  high  ");
    private static Employee[] employees = new Employee[10];

    public static void printEmployees() {
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }

    public static int calculateTotalSalary() {
        int sum = 0;
        for (Employee employee : employees) {
            sum += employee.getSalary();
        }
        return sum;
    }

    public static Employee findEmployeeWithMinSalary() {
        Employee result = employees[0];
        int minSalary = employees[0].getSalary();
        for (Employee employee : employees) {
            if (employee.getSalary() < minSalary) {
                minSalary = employee.getSalary();
                result = employee;
            }
        }
        return result;
    }

    public static float calculateAverageSalary() {
        return calculateTotalSalary() / (float) employees.length;
    }

    public static void pintFullName() {
        for (Employee employee : employees) {
        }
    }

