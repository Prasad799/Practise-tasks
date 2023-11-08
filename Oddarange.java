package me.com;


import java.util.Scanner;
public class Oddarange {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        
	        System.out.print("Enter the number of elements in the array: ");
	        int n = scanner.nextInt();
	        
	        int[] arr = new int[n];
	        
	        System.out.println("Enter the elements of the array:");
	        for (int i = 0; i < n; i++) {
	            arr[i] = scanner.nextInt();
	        }
	        
	        scanner.close();
	        
	        printElementsAtOddPositions(arr);
	    }

	    public static void printElementsAtOddPositions(int[] arr) {
	        System.out.println("Elements at odd positions in the array:");
	        for (int i = 0; i < arr.length; i++) {
	            if (i % 2 != 0) {
	                System.out.println(arr[i]);
	            }
	        }
	    }
	}

