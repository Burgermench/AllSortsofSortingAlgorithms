//origin
// By: João M. Cardoso 16/02/2022
// Just a simple Insertion Sort implemenetation

package Algorithm;

public class Isort {
	
	public static void sort(int arr[]) {
		int n = arr.length;
		for(int i = 1; i < n ; i++) {
			for(int j = i; j > 0 && arr[j-1] > arr[j]; j--) {
				helperMethods.swapInts(arr, j, j-1);
			}
		}
    }

}
