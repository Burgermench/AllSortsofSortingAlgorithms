//origin
// By: João M. Cardoso 17/02/2022
// Just a simple Merge Sort implemenetation
// Time complexity:  O(nlog(n))
// Space complexity: O(n)

package Algorithm;

public class MergeSort {
	
	public static void sort(int arr[]) {
		sort(arr,0,arr.length-1);
    }

    private static void sort(int arr[], int l, int r) {
        if (l<r) {
            int m = l + (r-l)/2; //find the middle element in the array / subarray
            // sort both halves recursively
            sort(arr, l, m);
            sort(arr, m + 1, r);
            merge(arr, l, m, r); // merge both halves
            //unfold the recursion
        }
    }
    
    //merging algorithm, args: l-left index, m-middle index, r-right index
    private static void merge(int arr[], int l, int m, int r) {
        // Find sizes of two subarrays to be merged
        int n1 = m - l + 1;
        int n2 = r - m;
  
        /* Create temp arrays */
        int L[] = new int[n1];
        int R[] = new int[n2];
  
        /* Copy elements to temp arrays */
        for (int i = 0; i < n1; ++i)
            L[i] = arr[l + i];
        for (int i = 0; i < n2; ++i)
            R[i] = arr[m + 1 + i];
  
        /* Merge temp arrays next */
  
        int i = 0, j = 0, k = l;
        while (i < n1 && j < n2) {
            if (L[i] <= R[j])
                arr[k++] = L[i++];
            else
                arr[k++] = R[j++];
        }
  
        /* Copy remaining elements of L[] if any */
        while (i < n1) {
            arr[k++] = L[i++];
        }
  
        /* Copy remaining elements of R[] if any */
        while (j < n2) {
            arr[k++] = R[j++];
        }
    }
	
}
