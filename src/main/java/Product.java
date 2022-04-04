import java.io.Serializable;

public class Product implements Serializable {
    private String name; // field 1
    private double price; // field 2

    public Product() {} // default constructor


    // custom constructor to take in 2 properties
    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }


    // getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }






}


