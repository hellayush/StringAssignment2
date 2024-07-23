package assignment;
  // Q6 - Write a program to check whether the letter "e" is present in the string "Umbrella"
public class letter {
    public static void main(String[] args) {
        String str = "Umbrella";
        char letter = 'e';

        if (str.indexOf(letter) != -1) {
            System.out.println("The letter '" + letter + "' is present in the string.");
        } else {
            System.out.println("The letter '" + letter + "' is not present in the string.");
        }
    }
}
