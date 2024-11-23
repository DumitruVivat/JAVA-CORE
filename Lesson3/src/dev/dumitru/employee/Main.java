package dev.dumitru.employee;

import static dev.dumitru.employee.Employee.increaser;

public class Main {
    public static void main(String[] args) {
//        Employee emp = new Employee("John", "Alexander", "Doe",
//                "123-456-7890", "Manager", 60000, 1990);
//
//        System.out.println(emp);

//        Employee John = new Employee("John", "Alexander", "Doe", "123-456-7890", "Manager", 60000, 1990);
//        Employee Jane = new Employee("Jane", "Elizabeth", "Smith", "234-567-8901", "Developer", 75000, 1992);
//        Employee Robert = new Employee("Robert", "James", "Johnson", "345-678-9012", "Designer", 50000, 1985);
//        Employee Emily = new Employee("Emily", "Grace", "Brown", "456-789-0123", "HR", 55000, 1995);
//        Employee Michael = new Employee("Michael", "David", "Williams", "567-890-1234", "Sales", 70000, 1988);
//
//        Employee[] company = {John, Jane, Robert, Emily, Michael};

        Employee[] employees = {
                new Manager("John", "Alexander", "Doe", "123-456-7890", "Manager", 60000, 1980),
                new Employee("Jane", "Elizabeth", "Smith", "234-567-8901", "Developer", 75000, 1972),
                new Employee("Robert", "James", "Johnson", "345-678-9012", "Designer", 50000, 1985),
                new Employee("Emily", "Grace", "Brown", "456-789-0123", "HR", 55000, 1995),
                new Employee("Michael", "David", "Williams", "567-890-1234", "Sales", 70000, 1988),
                new Manager("Nataly", "Portman", "Williams", "567-890-1234", "Manager", 60000, 1975)
        };

//        for (int i = 0; i < employees.length; i++) {
//            increaser(employees);
//        }

//        for (Employee employee : employees) {
//            System.out.println(employee);
//        }
//        System.out.println("Before: ");
//        for (Employee employee : employees) {
//            System.out.println(employee);
//        }
//
//        System.out.println("After: ");
//        for (Employee employee : employees) {
//            increaser(employees, 45, 5000);
//            System.out.println(employee);
//        }
//        System.out.println("Average age: " + averageAge(employees));
//        System.out.println("Average salary: " + averageSalary(employees));

//        for (int i = 0; i < employees.length; i++) {
//            Manager.increaser(employees, 45, 5000);
//        }
//        for (int i = 0; i < employees.length; i++) {
//            System.out.println(employees[i].getSalary());
//        }
    }

    private static float averageSalary(Employee[] employees) {
        float sum = 0;
        for (Employee employee : employees) {
            sum += employee.getSalary();
        }
        return sum / employees.length;
    }
    private static float averageAge(Employee[] employees) {
        float sum = 0;
        for (Employee employee : employees) {
            sum += employee.getAge();
        }
        return sum / employees.length;
    }

//    private static void increaser(Employee[] emp) {
//        for (int i = 0; i < emp.length; i++) {
//            if(emp[i].getAge() > 45) {
//                emp[i].increaseSalary(5000);
//            }
//        }
//    }
}
