//origin
// By: João M. Cardoso 16/02/2022

//notes:
// This is a take on the three-way version of quicksort for an array of ints.
// The three-way quicksort algorithm is one of many possible improvements over your usual quicksort.
// The improvement: In case there are many repeated values, it still compares them, but doesn't shift them around.
// "It is far more efficient than the standard quicksort implementation for arrays with large numbers of duplicate keys"
// In normal applications the generic version of this is more used, but in this version using Integers we can 
// more easily visualize the process.

package Algorithm;

public class quickSort3wayInts {
	
	//three-way quicksort algorithm
	public static void sort(int[] a) {
		//StdRandom.shuffle(a); // (optional) Eliminate dependence on input (remove bias worst case / best case).
		sort(a, 0, a.length - 1);
	}

	//this version is for primitive type only
	private static void sort(int[] a, int lo, int hi) {
		if (hi <= lo) return;
		int lt = lo, i = lo+1, gt = hi, v = a[lo];
		while (i <= gt) {
			if (v > a[i]) helperMethods.swapInts(a, lt++, i++);
			else if (v < a[i]) helperMethods.swapInts(a, i, gt--);
			else i++;
		}
		sort(a, lo, lt - 1);
		sort(a, gt + 1, hi);
	}
	
}
