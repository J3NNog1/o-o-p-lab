import java.util.Scanner;

public class BookStore {
    String nameOfBook;
    String authorFirstName;
    String authorLastName;
    String genre;
    String ISBN;
    String publishDate;
    String price;
    public BookStore() {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter name of book: ");
        this.nameOfBook = in.nextLine();
        System.out.print("Enter name of author's first name: ");
        this.authorFirstName = in.nextLine();
        System.out.print("Enter name of author's last name: ");
        this.authorLastName = in.nextLine();
        System.out.print("Enter what genre this book is: ");
        this.genre = in.nextLine();
        System.out.print("Enter the book's ISBN #: ");
        this.ISBN = in.nextLine();
        System.out.print("Enter when the book was published: ");
        this.publishDate = in.nextLine();
        System.out.print("Enter how much the book costs: ");
        this.price = in.nextLine();
        System.out.println(nameOfBook + " " + authorFirstName + " " + authorLastName + " " + genre + " " + ISBN
                + " " + publishDate + " " + price + " ");


    }
    public static void main(String[] args) {


    }
}
