package me.com;
import java.util.Scanner;

public class Binary {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter a number: ");
	        String input = scanner.nextLine();

	        if (isBinary(input)) {
	            System.out.println("The entered number is a binary number.");
	        } else {
	            System.out.println("The entered number is not a binary number.");
	        }

	        scanner.close();
	    }

	    public static boolean isBinary(String input) {
	        // A binary number can only contain '0' and '1' characters.
	        for (char digit : input.toCharArray()) {
	            if (digit != '0' && digit != '1') {
	                return false;
	            }
	        }
	        return true;
	    }
	}
