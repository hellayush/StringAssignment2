package assignment;
//  Q1 - Write a simple string program using input from the user //
import java.util.Scanner;
public class input {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String userInput = scanner.nextLine();

        System.out.println("You entered: " + userInput);

        scanner.close(); 
}
}
