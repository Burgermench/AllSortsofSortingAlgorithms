// Made by: João M. Cardoso 15/02/2022
package Algorithm;

import java.util.Random;

public class helperMethods {
	
	//CHECKING ARRAYS
	//checking if a generics array is sorted
	public static boolean isSortedGens(Comparable[] arr) {
		for(int i = 1; i < arr.length; i++) {
			if(arr[i-1].compareTo(arr[i]) > 0)
				return false;
		}
		return true;
	}
	
	//checking if an ints array is sorted
	public static boolean isSortedInts(int[] arr) {
		for(int i = 1; i < arr.length; i++) {
			if(arr[i-1] >  arr[i])
				return false;
		}
		return true;
	}
	
	//OPERATIONS IN ARRAYS
	//exchange generic elements in an array
	public static void swapGens(Comparable[] arr, int a, int b) {
		Comparable temp = arr[a];
		arr[a] = arr[b];
		arr[b] = temp;
	}
	
	//exchange int elements in an array
	public static void swapInts(int[] arr, int a, int b) {
		int temp = arr[a];
		arr[a] = arr[b];
		arr[b] = temp;
	}
	
	//PRINT ARRAYS
	//print array of generic type
	public static void printArray(Comparable[] arr) {
		int n = arr.length;
		System.out.print("Array: ");
		for(int i = 0; i < n; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
	//print array of integer type
	public static void printArray(int[] arr) {
		int n = arr.length;
		System.out.print("Array: ");
		for(int i = 0; i < n; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
	
	//PRODUCE ARRAYS
	//produces a sorted array of generics with size n
	public static Comparable[] createSortedArrayGens(int n) {
		Comparable[] arr = new Comparable[n];
		for(int i = 0; i < n; i++) {
			arr[i] = i;
		}
		return arr;
	}
	
	//produces an sorted array of ints with size n
	public static int[] createSortedArrayInts(int n) {
		int[] arr = new int[n];
		for(int i = 0; i < n; i++) {
			arr[i] = i;
		}
		return arr;
	}
	
	//produces an array of equal elements (gens) with size n
	public static Comparable[] createSameElmtsArrayGens(int n) {
		Comparable[] arr = new Comparable[n];
		for(int i = 0; i < n; i++) {
			arr[i] = 5;
		}
		return arr;
	}
	
	//produces an array of equal elements (ints) with size n
	public static int[] createSameElmtsArrayInts(int n) {
		int[] arr = new int[n];
		for(int i = 0; i < n; i++) {
			arr[i] = 5;
		}
		return arr;
	}
	
	public static Comparable[] createUnsortedArrayGens(int n) {
		Random rnd = new Random();
		Comparable[] arr = new Comparable[n];
		int biggestNumber = 10;
		for(int i = 0; i < n; i++) {
			arr[i] = Math.abs(rnd.nextInt() % biggestNumber);
		}
		return arr;
	}
	
	//produces an unsorted array of ints with size n
	public static int[] createUnsortedArrayInts(int n) {
		Random rnd = new Random();
		int[] arr = new int[n];
		int biggestNumber = 10;
		for(int i = 0; i < n; i++) {
			arr[i] = Math.abs(rnd.nextInt() % biggestNumber);
		}
		return arr;
	}

}
