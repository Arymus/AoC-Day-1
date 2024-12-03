import java.io.File;  // Import the File class
import java.io.FileNotFoundException;  // Import this class to handle errors
import java.util.Stack;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        File input = new File("input.txt");
        Scanner scanner = new Scanner(input); // Create a scanner object

        System.out.println("AoC Day 1: List Separator");

        String file = scanner.nextLine(); // Get file input
        String[] result = file.split("\\+s"); // Split the input at every whitespace

        for (String w : result) {
            int itemInt = Integer.parseInt(w); // Turn each array item into an integer
        }
    }
}
