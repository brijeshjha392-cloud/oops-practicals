class ComplexNumber {

    int real;
    int imaginary;

    ComplexNumber(int real, int imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    ComplexNumber add(ComplexNumber c) {
        int r = this.real + c.real;
        int i = this.imaginary + c.imaginary;

        return new ComplexNumber(r, i);
    }

    void display() {
        System.out.println(real + " + " + imaginary + "i");
    }
}

public class practical_5 {
    public static void main(String[] args) {

        ComplexNumber c1 = new ComplexNumber(5, 3);
        ComplexNumber c2 = new ComplexNumber(2, 4);

        ComplexNumber result = c1.add(c2);

        System.out.print("First Number: ");
        c1.display();

        System.out.print("Second Number: ");
        c2.display();

        System.out.print("Sum: ");
        result.display();
    }
}
