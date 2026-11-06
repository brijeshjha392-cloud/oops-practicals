class Employee {

    String name;
    double salary;

    static int count = 0;

    Employee() {
        this("Unknown", 0);
    }

    Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
        count++;
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);
    }

    static void showCount() {
        System.out.println("Total Employees: " + count);
    }
}

public class practical_9 {
    public static void main(String[] args) {

        Employee e1 = new Employee();
        Employee e2 = new Employee("Aman", 25000);
        Employee e3 = new Employee("Rahul", 30000);

        e1.display();
        e2.display();
        e3.display();

        Employee.showCount();
    }
}
