package me.com;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class CountPunctuationIn {
	
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Enter a string: ");
	        String input = scanner.nextLine();

	        int punctuationCount = countPunctuation(input);

	        System.out.println("Total number of punctuation characters: " + punctuationCount);

	        scanner.close();
	    }

	    public static int countPunctuation(String input) {
	        // Define a regular expression to match punctuation characters
	        String regex = "[\\p{Punct}]";

	        // Create a pattern object
	        Pattern pattern = Pattern.compile(regex);

	        // Create a matcher object for the input string
	        Matcher matcher = pattern.matcher(input);

	        int count = 0;
	        while (matcher.find()) {
	            count++;
	        }

	        return count;
	    }
	}

