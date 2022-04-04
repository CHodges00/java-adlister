import java.io.Serializable;
import java.util.Date;

public class Album implements Serializable {

    public Album (){};


    private long id;
    private String artist;
    private String name;
    private Date releaseDate;
    private long sales;
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
}
