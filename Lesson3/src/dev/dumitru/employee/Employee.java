package dev.dumitru.employee;

import java.time.LocalDate;

public class Employee {
    private static final int CURRENT_YEAR = 2024;
    private String name;
    private String middleName;
    private String surName;
    private String position;
    private String phone;
    private int salary;
    private int birth;
    private int bMonth;
    private int bDay;

    public Employee(String name, String middleName, String surName,
                    String phone, String position, int salary, int birth) {
        this.name = name;
        this.middleName = middleName;
        this.surName = surName;
        this.position = position;
        this.phone = phone;
        this.salary = salary;
        this.birth = birth;
    }

    public String getName() {
        return name;
    }

    public String getMiddleName() {
        return middleName;
    }

    public String getSurName() {
        return surName;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }


    public int getAge() {
        LocalDate today = LocalDate.now();
        int age = CURRENT_YEAR - birth;
        if (today.getMonthValue() < bMonth || (today.getMonthValue() == bMonth && today.getDayOfMonth() < bDay)) {
            age--;
        }

        return age;
    }

//    public void printInfo() {
//        System.out.println("Name: " + name);
//        System.out.println("Middle Name: " + middleName);
//        System.out.println("Surname: " + surName);
//        System.out.println("Position: " + position);
//        System.out.println("Phone: " + phone);
//        System.out.println("Salary: " + salary + " USD");
//        System.out.println("Age: " + getAge() + " years old");
//    }

//    @Override
//    public String toString() {
//        return "Employee{" +
//                "name='" + name + '\'' +
//                ", middleName='" + middleName + '\'' +
//                ", surName='" + surName + '\'' +
//                ", position='" + position + '\'' +
//                ", phone='" + phone + '\'' +
//                ", salary=" + salary +
//                ", birth=" + birth +
//                '}';
//    }

    @Override
    public String toString() {
        return String.format(
                "Name: %s\n" +
                        "Middle Name: %s\n" +
                        "Surname: %s\n" +
                        "Position: %s\n" +
                        "Phone: %s\n" +
                        "Salary: %d USD\n" +
                        "Age: %d years old",
                name,
                middleName,
                surName,
                position,
                phone,
                salary,
                getAge()
        );
    }

    public void increaseSalary(int amount) {
        this.salary += amount;
    }
    public static void increaser(Employee[] emp, int age, int increment) {
        for (int i = 0; i < emp.length; i++) {
            if(emp[i].getAge() > age) {
                emp[i].increaseSalary(increment);
            }
        }
    }

    public int compare(int dd, int mm, int yyyy) {
        int empl = bDay + (bMonth << 6) + (birth << 11);
        int income = dd + (mm << 6) + (yyyy << 11);
        return empl - income;
    }
}
