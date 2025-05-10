import java.util.Scanner;

public class SampleTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Welcome message
        System.out.println("Welcome to the Java Sample Test Program!");

        // Taking input
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        // Conditional statement
        if (age >= 18) {
            System.out.println("Hello " + name + ", you are eligible to vote.");
        } else {
            System.out.println("Hello " + name + ", you are not eligible to vote yet.");
        }

        // Looping example: print numbers from 1 to 5
        System.out.println("Now printing numbers from 1 to 5:");
        for (int i = 1; i <= 5; i++) {
            System.out.println(i);
        }

        scanner.close(); // Close the scanner
    }
}
