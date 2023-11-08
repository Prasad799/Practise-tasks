package me.com;
import java.util.Scanner;
public class Jcharacter {
	
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.println("Enter a string: ");
	        String inputString = scanner.nextLine();
	        scanner.close();

	        // Split the input string at 'j' and store the substrings in an array
	        String[] substrings = inputString.split("j");

	        // Initialize a StringBuilder to build the reversed string
	        StringBuilder reversedString = new StringBuilder();

	        // Iterate through the substrings, reversing and appending them to the result
	        for (int i = 0; i < substrings.length; i++) {
	            reversedString.append(new StringBuilder(substrings[i]).reverse());
	            // Add 'j' if it's not the last substring
	            if (i < substrings.length - 1) {
	                reversedString.append("j");
	            }
	        }

	        System.out.println("Reversed string: " + reversedString.toString());
	    }
}


