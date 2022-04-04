import java.io.Serializable;
import java.util.Date;

public class Album implements Serializable {

    public Album (){};


    private long id;
    private String artist;
    private String name;
    private Date releaseDate;
    private float sales;
    private String genre;


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }



    public float getSales() {
        return sales;
    }

    public void setSales(long sales) {
        this.sales = sales;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public Date getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(int day, int month, int year) {
        this.releaseDate = releaseDate;
    }
}
