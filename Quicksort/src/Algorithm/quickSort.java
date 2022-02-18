// Made by: João M. Cardoso 15/02/2022
package Algorithm;
/*
Descript: QUICKSORT (time complexity)
	IN-PLACE     STABLE      BEST      AVG      WORST      REMARKS:
	  yes         yes         n      2nlog(n) (1/2)n^2     nlog(n) probabilistic guarantee;fastest in practice
*/
public class quickSort {

	//sort »»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»
	static void sort() {
		int[] arr = helperMethods.createUnsortedArray(50);
		sort(arr);
	}
	
	static void sort(int[] arr) {
		sort(arr, arr.length-1);
	}
	
	static void sort(int[] arr, int n) {
		sort(arr,0,n);
	}
	
	static void sort(int[] arr, int low, int high){
	    if(low < high){
	        int p = partition(arr, low, high);
	        sort(arr, low, p-1);
	        sort(arr, p+1, high);
	    }
	}
	
	static int partition(int[] arr, int low, int high){
	    int p = low, j;
	    for(j=low+1; j <= high; j++)
	        if(arr[j] < arr[low])
	            helperMethods.swap(arr, ++p, j);

	    helperMethods.swap(arr, low, p);
	    return p;
	}

}
