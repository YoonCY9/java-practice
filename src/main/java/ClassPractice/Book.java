package ClassPractice;


public class Book {

    static long lastIssuedId = 0;
    long id;

    String title;
    String publishedAt;
    int price;
    int isbn;

    Author author;
    Publisher publisher;



    public Book(int id,String title, String publishedAt,
                int price, int isbn, Author author, Publisher publisher) {

        this.title = title;
        this.publishedAt = publishedAt;
        this.price = price;
        this.isbn = isbn;
        this.author = author;
        this.publisher = publisher;
        lastIssuedId += 1;
        this.id = lastIssuedId;
        // ex 2마리n  3시간t
        // 2


    }


}
