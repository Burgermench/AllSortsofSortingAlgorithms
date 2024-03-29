//origin
// By: Jo�o M. Cardoso 15/02/2022
// Based on: Robert Sedgewick, Kevin Wayne - Algorithms, 4th Edition_ Essential Information about Algorithms and Data Structures-Addison-Wesley (2011)

//notes:
// This is just a demo on the three-way version of quicksort for an array comparable elements.
// A three-way quicksort algorithm is just an improved quicksort.
// The improvement: In case there are many repeated values, it still compares them, 
// but doesn't shift them around.
// "It is far more efficient than the standard quicksort implementation for arrays with large numbers of duplicate keys"

package Algorithm;

public class quickSort3wayGens {

	//three-way quicksort algorithm
	public static void sort(Comparable[] a) {
		//StdRandom.shuffle(a); // (optional) Eliminate dependence on input (remove bias worst case / best case).
		sort(a, 0, a.length - 1);
	}

	//this version is for generic types
	private static void sort(Comparable[] a, int lo, int hi) {
		if (hi <= lo) return;
		int lt = lo, i = lo+1, gt = hi;
		Comparable v = a[lo];
		while (i <= gt) {
			int cmp = a[i].compareTo(v);
			if (cmp < 0) helperMethods.swapGens(a, lt++, i++);
			else if (cmp > 0) helperMethods.swapGens(a, i, gt--);
			else i++;
		}
		sort(a, lo, lt - 1);
		sort(a, gt + 1, hi);
	}
	
}
