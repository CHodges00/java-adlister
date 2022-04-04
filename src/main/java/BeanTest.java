public class BeanTest {


    public static void main(String[] args) {

        Album album1 = new Album();
        album1.setArtist("Doug");
        album1.setGenre("Rock");
        album1.setId(1);
        album1.setName("Darkened");
        album1.setReleaseDate("2020/02/02");




        Quote quote1 = new Quote();





        Author author1 = new Author();

        System.out.println("album1.getReleaseDate() = " + album1.getReleaseDate());
        System.out.println("album1.getArtist() = " + album1.getArtist());
        System.out.println("album1.getGenre() = " + album1.getGenre());
        System.out.println("album1.getId() = " + album1.getId());
        System.out.println("album1.getName() = " + album1.getName());


    }

}
