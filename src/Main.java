import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Employee[] employeesArr = new Employee[10];
        employeesArr[0] = new Employee("Roy Jons Sapper", 1, 15600.56);
        employeesArr[1] = new Employee("Janni Cappi Sappi", 5, 11500.02);
        employeesArr[2] = new Employee("Chai Ti Li", 4, 13400.02);
        employeesArr[3] = new Employee("Alla Anya Semenova", 3, 12700.45);
        employeesArr[4] = new Employee("Sara Kalli Liss", 1, 17600.89);
        employeesArr[5] = new Employee("Kya Sin Jei", 2, 15600.78);
        employeesArr[6] = new Employee("Fedor Benni Bil", 4, 18260.45);
        employeesArr[7] = new Employee("lilla Lai Sunndi", 2, 14350.36);
        employeesArr[8] = new Employee("Dedy Dos Tolli", 5, 18280.42);
        employeesArr[9] = new Employee("Donni Li Fu", 3, 18405.01);

        findMinSalaryDepartament(employeesArr);
        findMaxSalaryOfDepartment(employeesArr);
        findAvarageOfDepartment(employeesArr);
        departmentSalaryIndexation(employeesArr);
        printEmoliyeeDepartment(employeesArr);
        findBySpecifiedAmountMinMAxSalary(employeesArr);
    }

    public static void findMinSalaryDepartament(Employee[] employees) {
        System.out.println("--------------------------------------------------------------------------------------------------------");
        Scanner sc = new Scanner(System.in);
        System.out.println("Do you want to know the minimum salary for the department?");
        System.out.println("Enter department number from 1 to 5: ");
        int departmentSc = sc.nextInt();
        if (departmentSc <= 5) {
            Employee minSalaty = employees[0];

            for (Employee employee : employees) {
                if (departmentSc == employee.getDepartment() && employee.getSalary() < minSalaty.getSalary()) {
                    minSalaty = employee;
                    System.out.println("Department - № " + employee.getDepartment() +
                            ", Minimum Salary of department - " + employee.getSalary());
                }
            }
        } else {
            throw new RuntimeException("Error!!! Enter the department correctly from 1 to 5:");
        }
    }

    public static void findMaxSalaryOfDepartment(Employee[] employees) {
        Scanner sc = new Scanner(System.in);
        System.out.println("--------------------------------------------------------------------------------------------------------");
        System.out.println("Do you want to know the maximum salary for the department?");
        System.out.println("Enter department number from 1 to 5: ");
        int departmentSc = sc.nextInt();
        if (departmentSc <= 5) {
            Employee maxSalary = employees[0];
            for (Employee employee : employees) {
                if (departmentSc == employee.getDepartment() && employee.getSalary() > maxSalary.getSalary()) {
                    maxSalary = employee;
                    System.out.println("Department - № " + employee.getDepartment() +
                            ", Maxsimum Salary of department - " + employee.getSalary());
                }
            }
        } else {
            throw new RuntimeException("Error!!! Enter the department correctly from 1 to 5:");
        }
    }

    public static void findAvarageOfDepartment(Employee[] employees) {
        Scanner sc = new Scanner(System.in);
        double avaraveSalaryDepartment;
        double totalSalaryDepartment = 0;
        int departmentLength = 0;
        int departmentName = 0;
        System.out.println("--------------------------------------------------------------------------------------------------------");
        System.out.println("Do you want to know the avarage salary for the department?");
        System.out.println("Enter department number from 1 to 5: ");
        int departmentSc = sc.nextInt();
        if (departmentSc <= 5) {
            for (Employee employee : employees) {
                if (departmentSc == employee.getDepartment()) {
                    totalSalaryDepartment += employee.getSalary();
                    departmentName = employee.getDepartment();
                    departmentLength++;
                }
            }
            avaraveSalaryDepartment = totalSalaryDepartment / departmentLength;
            System.out.println("Department - № " + departmentName +
                    ", Avarage Salary of department - " + avaraveSalaryDepartment);
        } else {
            throw new RuntimeException("Error!!! Enter the department correctly from 1 to 5:");
        }
    }

    public static void departmentSalaryIndexation(Employee[] employees) {
        Scanner sc = new Scanner(System.in);
        double currentSalaryDepartment = 0;
        double updatedSalaryDepartment = 0;
        double indexPercentage = 0;
        System.out.println("--------------------------------------------------------------------------------------------------------");
        System.out.println("Want indexation of department salaries?");
        System.out.println("Enter department number from 1 to 5: ");
        int departmentSc = sc.nextInt();
        System.out.println("Enter the percentage to index - using 5 or 10 as an example: ");
        int percentSc = sc.nextInt();
        if (departmentSc <= 5) {
            indexPercentage = percentSc / 100.0;
            for (Employee employee : employees) {
                if (departmentSc == employee.getDepartment()) {
                    currentSalaryDepartment = employee.getSalary();
                    updatedSalaryDepartment = employee.getSalary() + (currentSalaryDepartment * indexPercentage);
                    employee.setSalary(updatedSalaryDepartment);
                    System.out.println("Department - № " + employee.getDepartment() + ", updated Salary Department " + updatedSalaryDepartment);
                }
            }

        } else {
            throw new RuntimeException("Error!!! Enter the department correctly from 1 to 5:");
        }
    }

    public static void printEmoliyeeDepartment(Employee[] employees) {
        Scanner sc = new Scanner(System.in);
        System.out.println("--------------------------------------------------------------------------------------------------------");
        System.out.println("Want to print employee data by department?");
        System.out.println("Select department from 1 to 5:");
        int departmentName = sc.nextInt();
        if (departmentName <= 5) {
            for (Employee employee : employees) {
                if (departmentName == employee.getDepartment()) {
                    System.out.println("Employee: ID - " + employee.getId() +
                            ", Full name - " + employee.getFullName() +
                            ", Salary - " + employee.getSalary());
                }
            }
        } else {
            throw new RuntimeException("Error!!! Enter the department correctly from 1 to 5:");
        }
    }

    public static void findBySpecifiedAmountMinMAxSalary(Employee[] employees) {
        Scanner sc = new Scanner(System.in);
        System.out.println("--------------------------------------------------------------------------------------------------------");
        System.out.println("Do you want to know who’s salary is more or less than the specified amount?");
        System.out.println("Enter (the average salary for department 15569 can be based on this amount):");
        double salarySc = sc.nextDouble();
        if (salarySc <= 20000) {
            for (Employee employee : employees) {
                if (salarySc >= employee.getSalary()) {
                    System.out.println("List of employees with lower salaries: " + salarySc + ", ID - " + employee.getId() +
                            ", Full name - " + employee.getFullName() +
                            ", Salary - " + employee.getSalary());
                }
            }
            System.out.println("--------------------------------------------------------------------------------------------------------");
            for (Employee employee : employees) {
                if (salarySc <= employee.getSalary()) {
                    System.out.println("List of employees more salary: " + salarySc + ", ID - " + employee.getId() +
                            ", Full name - " + employee.getFullName() +
                            ", Salary - " + employee.getSalary());
                }
            }
        } else {
            throw new RuntimeException("Error!!! Above 20,000 there is no salary in the company:");
        }
    }
}
































