class Product {

    String name;
    double price;
    int quantity;

    Product() {
        name = "Unknown";
        price = 0;
        quantity = 0;
    }

    Product(String name) {
        this.name = name;
        price = 0;
        quantity = 0;
    }

    Product(String name, double price) {
        this.name = name;
        this.price = price;
        quantity = 1;
    }

    Product(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    double totalCost() {
        return price * quantity;
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Price: " + price);
        System.out.println("Quantity: " + quantity);
        System.out.println("Total Cost: " + totalCost());
        System.out.println("----------------");
    }
}

public class practical_8 {
    public static void main(String[] args) {

        Product p1 = new Product();
        Product p2 = new Product("Laptop");
        Product p3 = new Product("Mouse", 500);
        Product p4 = new Product("Keyboard", 1000, 2);

        p1.display();
        p2.display();
        p3.display();
        p4.display();
    }
}
