package perform;
class Employee {
    protected double basicSalary;
    protected double transportAllowance;

    public Employee(double basicSalary) {
        this.basicSalary = basicSalary;
        this.transportAllowance = 10 / 100.0 * basicSalary; // 10% of basicSalary
    }

    public void calculateTransportAllowance() {
        System.out.println("Employee Salary before  transport allowance: " + basicSalary);
        System.out.println("Transport Allowance: " + transportAllowance);
        double salaryAfterTransportAllowance = basicSalary + transportAllowance;
        System.out.println("Employee Salary after  transport allowance: " + salaryAfterTransportAllowance);
    }
}

class Manager extends Employee {
    public Manager(double basicSalary) {
        super(basicSalary);
    }

    @Override
    public void calculateTransportAllowance() {
        transportAllowance = 15 / 100.0 * basicSalary; // 15% of basicSalary
        System.out.println("Manager Salary before  transport allowance: " + basicSalary);
        System.out.println("Transport Allowance: " + transportAllowance);
        double salaryAfterTransportAllowance = basicSalary + transportAllowance;
        System.out.println("Manager Salary after  transport allowance: " + salaryAfterTransportAllowance);
    }
}

class Trainee extends Employee {
    public Trainee(double basicSalary) {
        super(basicSalary);
    }
}

public class Employeee {
    public static void main(String[] args) {
        // Creating objects of Employee, Manager, and Trainee classes
        Employee emp = new Employee(50000);
        Manager mgr = new Manager(70000);
        Trainee trainee = new Trainee(40000);

        // Invoking calculateTransportAllowance method for Employee, Manager, and Trainee objects
        emp.calculateTransportAllowance();
        mgr.calculateTransportAllowance();
        trainee.calculateTransportAllowance();
    }
}