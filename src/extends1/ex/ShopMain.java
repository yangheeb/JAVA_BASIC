package extends1.ex;

public class ShopMain {
    public static void main(String[] args) {
        Book book = new Book("JAVA",10000,"han","12345");
        Album album = new Album("앨범1",15000,"seo");
        Movie movie = new Movie("영화1",18000,"kim","lee");

        book.print();
        album.print();
        movie.print();

        int sum = book.getPrice() + album.getPrice() + movie.getPrice();
        System.out.println("합계: " + sum);
    }
}
