package ClassPractice;

public class MainData {

    public static void main(String[] args) {

        Author author1 = new Author("윤찬영","1884.01.02");

        Publisher publisher1 = new Publisher("찬찬");

        Book book1 = new Book(0,"피터팬","19980425",12000,
                15456,author1,publisher1);

        Book book2 = new Book(0,"피터팬","19980426",11000,
                18945,author1,publisher1);

        System.out.println(book1.title.equals(book2.title));


    }
}
