package me.com;
import java.util.Scanner;
import java.util.HashMap;
public class CharacterCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        scanner.close();

        countCharacterOccurrences(input);
    }

    public static void countCharacterOccurrences(String str) {
        // Create a HashMap to store characters and their counts
        HashMap<Character, Integer> charCountMap = new HashMap<>();

        // Convert the input string to lowercase to make the comparison case-insensitive
        str = str.toLowerCase();

        // Iterate through the string and count the occurrences of each character
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (Character.isLetter(c)) {
                if (charCountMap.containsKey(c)) {
                    charCountMap.put(c, charCountMap.get(c) + 1);
                } else {
                    charCountMap.put(c, 1);
                }
            }
        }

        // Print characters and their counts
        System.out.println("Character occurrences in the string:");
        for (char c : charCountMap.keySet()) {
            System.out.println(c + " - " + charCountMap.get(c) + " times");
        }
    }
}

