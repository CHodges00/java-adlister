import java.util.ArrayList;
import java.util.List;


public class BeanTest {


    public static void main(String[] args) {

        Album album1 = new Album();
        album1.setArtist("Doug");
        album1.setGenre("Rock");
        album1.setId(1);
        album1.setName("Darkened");
        album1.setReleaseDate(01, 02, 2020);



        Author author1 = new Author();
        author1.setFirstName("Tim");
        author1.setLastName("Toolman");


        Quote quote1 = new Quote();
        quote1.setId(1);
        quote1.setAuthor("Andy");
        quote1.setContent("Learning is fun");
        Quote quote2 = new Quote();
        quote2.setId(2);
        quote2.setAuthor("Sarah");
        quote2.setContent("Learning is interesting");
        Quote quote3 = new Quote();
        quote3.setId(3);
        quote3.setAuthor("Will");
        quote3.setContent("Learning is cool");
        Quote quote4 = new Quote();
        quote4.setId(4);
        quote4.setAuthor("Dan");
        quote4.setContent("Learning is hard");




        List<Quote> quoteList = new ArrayList<>();
        quoteList.add(quote1);
        quoteList.add(quote2);
        quoteList.add(quote3);
        quoteList.add(quote4);

        for (Quote i:quoteList){
            System.out.println(i.getId());
            System.out.println(i.getAuthor());
            System.out.println(i.getContent());
        }







    }

}
