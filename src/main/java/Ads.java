import java.util.List;

public interface Ads {
    List<Ad> all(); // get all the product records

    void insert(Ads Ad); // persist new product to the database
}