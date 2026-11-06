class Student {
    int rollNo;
    String name;
    int marks1, marks2, marks3;

    Student(int rollNo, String name,
            int marks1, int marks2, int marks3) {
        this.rollNo = rollNo;
        this.name = name;
        this.marks1 = marks1;
        this.marks2 = marks2;
        this.marks3 = marks3;
    }

    int calculateTotal() {
        return marks1 + marks2 + marks3;
    }

    double calculatePercentage() {
        return calculateTotal() / 3.0;
    }

    void display() {
        System.out.println("Roll No: " + rollNo);
        System.out.println("Name: " + name);
        System.out.println("Total Marks: " + calculateTotal());
        System.out.println("Percentage: " + calculatePercentage() + "%");
        System.out.println("--------------------");
    }
}

public class practical_1 {
    public static void main(String[] args) {
        Student s1 = new Student(1, "Aman", 80, 85, 90);
        Student s2 = new Student(2, "Rahul", 75, 80, 85);
        Student s3 = new Student(3, "Priya", 90, 95, 88);

        s1.display();
        s2.display();
        s3.display();
    }
}
