package me.com;
import java.util.Scanner;
public class Swapvowels {
	
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter a string: ");
	        String input = scanner.nextLine();
	        scanner.close();

	        String swapped = swapVowels(input);
	        System.out.println("Original String: " + input);
	        System.out.println("Swapped String: " + swapped);
	    }

	    public static String swapVowels(String input) {
	        char[] vowels = {'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'};
	        char[] charArray = input.toCharArray();

	        for (int i = 0; i < charArray.length; i++) {
	            char c = charArray[i];
	            if (isVowel(c)) {
	                char nextVowel = findNextVowel(charArray, i);
	                charArray[i] = nextVowel;
	            }
	        }

	        return new String(charArray);
	    }

	    public static boolean isVowel(char c) {
	        return "AEIOUaeiou".indexOf(c) != -1;
	    }

	    public static char findNextVowel(char[] charArray, int start) {
	        for (int i = start + 1; i < charArray.length; i++) {
	            if (isVowel(charArray[i])) {
	                return charArray[i];
	            }
	        }
	        for (int i = 0; i < start; i++) {
	            if (isVowel(charArray[i])) {
	                return charArray[i];
	            }
	        }
	        return charArray[start]; // No more vowels found, return the same vowel
	    }
	}

