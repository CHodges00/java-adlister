import java.util.ArrayList;


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
        quote1.setId(2);
        quote1.setAuthor("Sarah");
        quote2.setContent("Learning is interesting");
        Quote quote3 = new Quote();
        quote1.setId(3);
        quote1.setAuthor("Will");
        quote3.setContent("Learning is cool");
        Quote quote4 = new Quote();
        quote1.setId(4);
        quote1.setAuthor("Dan");
        quote4.setContent("Learning is hard");

        ArrayList<Quote> quotes = new ArrayList<>();
        quotes.add(quote1);
        quotes.add(quote2);
        quotes.add(quote3);
        quotes.add(quote4);

        for (Object quote : quotes){
            System.out.println(quote.toString());
        }






    }

}
