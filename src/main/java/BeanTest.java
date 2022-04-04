import java.util.ArrayList;


public class BeanTest {


    public static void main(String[] args) {

        Album album1 = new Album();
        album1.setArtist("Doug");
        album1.setGenre("Rock");
        album1.setId(1);
        album1.setName("Darkened");
        album1.setReleaseDate("2020/02/02");



        Author author1 = new Author();
        author1.setId(1);
        author1.setFirstName("Tim");
        author1.setLastName("Toolman");


        Quote quote1 = new Quote();
        quote1.setContent("Learning is fun");
        Quote quote2 = new Quote();
        quote2.setContent("Learning is interesting");
        Quote quote3 = new Quote();
        quote3.setContent("Learning is cool");
        Quote quote4 = new Quote();
        quote4.setContent("Learning is hard");

//        ArrayList<String> quotes = new ArrayList<>();
//        quotes.add(quote1);
//        quotes.add(quote2);
//        quotes.add(quote3);
//        quotes.add(quote4);
//
//        for (String i : quotes){
//            System.out.println(i);
//        }






    }

}
