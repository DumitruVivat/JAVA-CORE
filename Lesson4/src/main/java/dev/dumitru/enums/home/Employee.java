package dev.dumitru.enums.home;

public class Employee {

    public enum Genders {
        MALE, FEMALE;
    }
    public enum Parties {
        NONE, NEW_YEAR, MARCH_8, FEB_23
    }

    private String name;
    private String midName;
    private String surName;
    private String phone;
    private String position;
    private int salary;
    private int birth;
    private Genders genders;

    public Employee(String name, String midName, String surName, String phone, String position, int salary, int birth, Genders genders) {
        this.name = name;
        this.midName = midName;
        this.surName = surName;
        this.phone = phone;
        this.position = position;
        this.salary = salary;
        this.birth = birth;
        this.genders = genders;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMidName() {
        return midName;
    }

    public void setMidName(String midName) {
        this.midName = midName;
    }

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getBirth() {
        return birth;
    }

    public void setBirth(int birth) {
        this.birth = birth;
    }

    public Genders getGenders() {
        return genders;
    }

    public void setGenders(Genders genders) {
        this.genders = genders;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", midName='" + midName + '\'' +
                ", surName='" + surName + '\'' +
                ", phone='" + phone + '\'' +
                ", position='" + position + '\'' +
                ", salary=" + salary +
                ", birth=" + birth +
                ", genders=" + genders +
                '}';
    }

    private static final Parties today = Parties.NONE;

    private static void celebrate(Employee[] emp) {
        for (int i = 0; i < emp.length; i++) {
            switch (today) {
                case NEW_YEAR:
                    System.out.println(emp[i].name + ", happy New Year!");
                    break;
                case FEB_23:
                    if (emp[i].genders == Employee.Genders.MALE)
                        System.out.println(emp[i].name + ", happy February 23rd!");
                    break;
                case MARCH_8:
                    if (emp[i].genders == Employee.Genders.FEMALE)
                        System.out.println(emp[i].name + ", happy march 8th!");
                    break;
                default:
                    System.out.println(emp[i].name + ", celebrate this morning!");
            }
        }
    }

    public static void main(String[] args) {
        Employee[] emp = {
                new Employee("John", "Michael", "Doe", "123-456-7890", "Software Engineer", 85000, 1985, Genders.MALE),
                new Employee("Jane", "Alice", "Smith", "098-765-4321", "Project Manager", 95000, 1990, Genders.FEMALE),
                new Employee("Michael", "David", "Brown", "555-555-5555", "UX Designer", 78000, 1992, Genders.MALE),
                new Employee("Emily", "Sophia", "Johnson", "111-222-3333", "HR Specialist", 67000, 1988, Genders.FEMALE),
                new Employee("Robert", "Lee", "Williams", "444-555-6666", "Marketing Director", 105000, 1980, Genders.MALE)
        };

        celebrate(emp);
    }
}
