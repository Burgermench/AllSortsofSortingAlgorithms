//origin
// By: Jo�o M. Cardoso 16/02/2022
// Just a simple Bubble Sort implementation

package Algorithm;

public class Bsort {
	
	static void sort(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n-1; i++)
            for (int j = 0; j < n-i-1; j++)
                if (arr[j] > arr[j+1])
                	helperMethods.swapInts(arr, j, j+1);
    }
	
}
