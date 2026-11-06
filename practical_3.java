
interface Printable {
    void print();
}

interface Scannable {
    void scan();
}

class AllInOnePrinter implements Printable, Scannable {

    public void print() {
        System.out.println("Printing document");
    }

    public void scan() {
        System.out.println("Scanning document");
    }
}

class Machine {
    void powerOn() {
        System.out.println("Machine is ON");
    }
}

class Printer extends Machine implements Printable {
    public void print() {
        System.out.println("Printer is printing");
    }
}

public class practical_3 {
    public static void main(String[] args) {

        AllInOnePrinter a = new AllInOnePrinter();
        a.print();
        a.scan();

        System.out.println("Hybrid Inheritance:");

        Printer p = new Printer();
        p.powerOn();
        p.print();
    }
}
