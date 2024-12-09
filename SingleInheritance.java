// Base class
class Employee {
    void work() {
        System.out.println("Employee is working.");
    }
}

// Derived class
class Manager extends Employee {
    void manage() {
        System.out.println("Manager is managing the team.");
    }
}

public class SingleInheritance {
    public static void main(String[] args) {
        Manager manager = new Manager();

        // Manager inherits the work() method from Employee
        manager.work();
        manager.manage();
    }
}
