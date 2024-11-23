package dev.dumitru.employee;

public class Manager extends Employee {
    public Manager(String name, String middleName, String surName, String phone, String position, int salary, int birth) {
        super(name, middleName, surName, phone, position, salary, birth);
    }

    public static void increaser(Employee[] employees, int age, int increment) {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getAge() > age) {
                if (!(employees[i] instanceof Manager)) {
                    employees[i].increaseSalary(increment);
                }
            }
        }
    }
}
