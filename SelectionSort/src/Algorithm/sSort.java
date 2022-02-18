//origin
// By: João M. Cardoso 16/02/2022
// Just a simple Selection Sort implementation

package Algorithm;

public class sSort {
	
	static void sort(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n-1; i++) { // Move bound right once per iteration
            int min = i; //start by assuming current element is the smallest
            for (int j = i+1; j < n; j++) //search ahead for the smallest element
                if (arr[j] < arr[min])
                    min = j;
            helperMethods.swapInts(arr, i, min); //Swap current item with the smallest element found rightwards
        }
    }
	
}
