import java.util.Scanner;

public class Customer {
    private  String firstName;
    private String lastName;
    private String email;
    private String phoneNumber;
    private String customerId;
    private static int id = 10000;


    //Constructer: prompts customer to enter their personal information
    public Customer() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter your first name:");
        this.firstName = in.nextLine();
        System.out.println("Enter your last name:");
        this.lastName = in.nextLine();
        System.out.println("Enter your email:");
        this.email = in.nextLine();
        System.out.println("Enter your phone number :");
        this.phoneNumber = in.nextLine();
        System.out.println(firstName + " " + lastName + " " + email + " " + phoneNumber);

        setCustomerId();

        System.out.println(firstName + " " + lastName + " " + customerId);

    }
    private void setCustomerId() {
        id++;
        this.customerId = String.valueOf(id);
    }

    public static void main(String[] args) {

    }
}
