package me.com;
import java.util.Scanner;
public class Stringconverter {
	
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        
	        System.out.print("Enter a string: ");
	        String inputString = scanner.nextLine();
	        
	        if (!inputString.isEmpty()) {
	            String firstLetter = inputString.substring(0, 1).toUpperCase();
	            String restOfString = inputString.substring(1);
	            String resultString = firstLetter + restOfString;
	            
	            System.out.println("String with first letter in uppercase: " + resultString);
	        } else {
	            System.out.println("Input string is empty.");
	        }
	        
	        scanner.close();
	    }
	
}
