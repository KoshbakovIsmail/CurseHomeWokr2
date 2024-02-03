public class Employee {
    static int idCount = 1;
    int id;
    String fullName;
    int department;
    double salary;

    public Employee(String fullName, int department, double salary) {
        this.id = idCount;
        idCount++;
        this.fullName = fullName;
        this.department = department;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public String getFullName() {
        return fullName;
    }

    public int getDepartment() {
        return department;
    }

    public double getSalary() {
        return salary;
    }

    public void setFullName() {
        this.fullName = fullName;
    }

    public void setDepartment() {
        this.department = department;
    }

    public void setSalary(double updatedSalaryDepartment) {
        this.salary = salary;
    }

    public String toString() {
        return "Employees: Full name - " + fullName + " Department - " + department + " Salary - " + salary;
    }
}

