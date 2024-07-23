package assignment;
 // Q7 - Write a program to delete all consonants from the string "Hello, have a good day"
public class consonants {
    public static void main(String[] args) {
        String str = "Hello, have a good day";

        
        String vowelsOnly = str.replaceAll("[^aeiouAEIOU]", "");

        System.out.println("Original string: " + str);
        System.out.println("Vowels only: " + vowelsOnly);
    }
}
