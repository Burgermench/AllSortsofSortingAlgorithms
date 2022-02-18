// Made by: João M. Cardoso 15/02/2022
package Algorithm;

import java.util.Random;

public class helperMethods {
	
	//CHECKING ARRAYS
	//verifying if an array is sorted
	public static boolean isSorted(int[] arr) {
		for(int i = 1; i < arr.length; i++) {
			if(arr[i-1] > arr[i])
				return false;
		}
		return true;
	}
	
	//OPERATIONS IN ARRAYS
	//exchange elements
	public static void swap(int[] arr, int a, int b) {
		int temp = arr[a];
		arr[a] = arr[b];
		arr[b] = temp;
	}
	
	//PRINT ARRAYS
	public static void printArray(int arr[]) {
		int n = arr.length;
		System.out.print("Array: ");
		for(int i = 0; i < n; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
	
	//PRODUCE ARRAYS
	//produces a sorted array with range[start,end]
	public static int[] createSortedArray(int start, int end) {
		assert(start <= end);
		int[] arr = new int[end-start+1];
		for(int i = 0; start <= end; i++) {
			arr[i] = start++;
		}
		return arr;
	}
	
	//produces a sorted array with size n
	public static int[] createSortedArray(int n) {
		assert(n >= 0);
		int[] arr = new int[n];
		for(int i = 0; i < n; i++) {
			arr[i] = i;
		}
		return arr;
	}
	
	//produces an unsorted array with size n
	public static int[] createUnsortedArray(int n) {
		Random rnd = new Random();
		int[] arr = new int[n];
		int biggestNumber = 10;
		for(int i = 0; i < n; i++) {
			arr[i] = Math.abs(rnd.nextInt() % biggestNumber);
		}
		return arr;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
