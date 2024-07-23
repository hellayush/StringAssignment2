package assignment;
import java.util.Scanner;
// Q4 - Check if two strings are equal or not 
public class compare {
    

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
    
            System.out.print("Enter the first string: ");
            String firstString = scanner.nextLine();
    
            System.out.print("Enter the second string: ");
            String secondString = scanner.nextLine();
    
            // Compare strings using equalsIgnoreCase() for case-insensitive comparison
            if (firstString.equalsIgnoreCase(secondString)) {
                System.out.println("The strings are equal.");
            } else {
                System.out.println("The strings are not equal.");
            }
    
            scanner.close();
        }
}
