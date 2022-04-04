import java.io.Serializable;

public class Ad implements Serializable {
    private String title;
    private String content;
    private double price;
    private String location;

    public Ad() {} // default constructor


    public Ad(String title, String content, double price, String location) {
        this.title = title;
        this.content = content;
        this.price = price;
        this.location = location;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }








}
