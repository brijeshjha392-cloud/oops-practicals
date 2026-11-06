class Demo {

    Demo() {
        System.out.println("Object Created");
    }

    void display() {
        System.out.println("Object is being used");
    }
}

public class practical_7 {
    public static void main(String[] args) {

        Demo d = new Demo();

        d.display();

        d = null;

        System.out.println("Reference removed");

        System.gc();

        System.out.println("Garbage collection requested");
    }
}
