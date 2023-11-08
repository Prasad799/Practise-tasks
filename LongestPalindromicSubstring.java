package me.com;
import java.util.Scanner;
public class LongestPalindromicSubstring {
	    public static String longestPalindrome(String s) {
	        int n = s.length();
	        boolean[][] dp = new boolean[n][n];
	        int start = 0;
	        int maxLength = 1;

	        // All substrings of length 1 are palindromes
	        for (int i = 0; i < n; i++) {
	            dp[i][i] = true;
	        }

	        // Check for palindromes of length 2
	        for (int i = 0; i < n - 1; i++) {
	            if (s.charAt(i) == s.charAt(i + 1)) {
	                dp[i][i + 1] = true;
	                start = i;
	                maxLength = 2;
	            }
	        }

	        // Check for palindromes of length 3 or more
	        for (int len = 3; len <= n; len++) {
	            for (int i = 0; i <= n - len; i++) {
	                int j = i + len - 1;
	                if (s.charAt(i) == s.charAt(j) && dp[i + 1][j - 1]) {
	                    dp[i][j] = true;
	                    if (len > maxLength) {
	                        start = i;
	                        maxLength = len;
	                    }
	                }
	            }
	        }

	        return s.substring(start, start + maxLength);
	    }

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter a string: ");
	        String input = scanner.nextLine();
	        scanner.close();

	        String result = longestPalindrome(input);
	        System.out.println("Longest Palindromic Substring: " + result);
	    }
	}

