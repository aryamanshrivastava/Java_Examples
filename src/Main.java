import java.util.Scanner;
import java.util.*;

// Main class
public class Main {
    public static void main(String[] args) {
        // Create a Scanner object to take input from the user
        Scanner sc = new Scanner(System.in);

        // Sample paragraph string
        String paragraph = "My name is Aryan, My hometown is MP";

        //enter a string
        System.out.println("Enter a string:");
        String search = sc.nextLine();

        // Try block to handle exceptions
        try {
            //counter for occurrenc
            int count = 0;

            // Find the first occurrence of the search string in the paragraph
            int index = paragraph.indexOf(search);

            // Loop to find subsequent occurrences
            while (index != -1) {
                // Increment the occurrence counter
                count++;

                // next occurrence starting from the next index
                index = paragraph.indexOf(search, index + 1);
            }

            //no occurrences found, throw a CustomException
            if (count == 0) {
                throw new CustomException("String not found in the paragraph");
            }

            // number of occurrences
            System.out.println("Number of occurrences: " + count);

        } catch (CustomException e) {
            // Catch and handle the CustomException
            System.out.println(e.getMessage());
        }
    }
}
