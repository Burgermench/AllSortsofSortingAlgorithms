package Algorithm;

public class testSort {
	
	//tests three-way-quicksort for ordered, unordered and arrays with always the same elements
	private static void test0() {
		String errorMsg0 = "Test0 - Fail - ordered array";
		String errorMsg1 = "Test0 - Fail - unordered array";
		String errorMsg2 = "Test0 - Fail - array with same elements";
		Comparable[] orderedArray = helperMethods.createSortedArrayGens(50);
		Comparable[] unorderedArray = helperMethods.createUnsortedArrayGens(50);
		Comparable[] sameElmtsArray = helperMethods.createSameElmtsArrayGens(50);
		quickSort3wayGens.sort(orderedArray);
		quickSort3wayGens.sort(unorderedArray);
		quickSort3wayGens.sort(sameElmtsArray);
		assert helperMethods.isSortedGens(orderedArray) : errorMsg0;
		assert helperMethods.isSortedGens(unorderedArray) : errorMsg1;
		assert helperMethods.isSortedGens(sameElmtsArray) : errorMsg2;
		System.out.println("Test0 - Success");
	}
	
	//test three-way-quicksort, for ordered, unordered
	private static void test1() {
		String errorMsg0 = "Test1 - Fail - ordered array";
		String errorMsg1 = "Test1 - Fail - unordered array";
		String errorMsg2 = "Test1 - Fail - array with same elements";
		int[] orderedArray = helperMethods.createSortedArrayInts(50);
		int[] unorderedArray = helperMethods.createUnsortedArrayInts(50);
		int[] sameElmtsArray = helperMethods.createSameElmtsArrayInts(50);
		quickSort3wayInts.sort(orderedArray);
		quickSort3wayInts.sort(unorderedArray);
		quickSort3wayInts.sort(sameElmtsArray);
		assert helperMethods.isSortedInts(orderedArray) : errorMsg0;
		assert helperMethods.isSortedInts(unorderedArray) : errorMsg1;
		assert helperMethods.isSortedInts(sameElmtsArray) : errorMsg2;
		System.out.println("Test1 - Success");
	}
	
	//speed test using doubling reason
	private static void test2() {
		int n = (int) Math.pow(2,29); //max number of elements
		System.out.println("Testing sort times for unsorted arrays of doubling size...");
		double lastTime = 1;
		for(int i = 1; i <= n; i*=2) {
			Comparable[] arr0 = helperMethods.createUnsortedArrayGens(i);
			double time1 = System.nanoTime();
			quickSort3wayGens.sort(arr0);
			double time2 = System.nanoTime();
			double newTime = time2 - time1;
			double doubledReason = newTime/lastTime;
			lastTime = newTime;
			if(i > 1)
				System.out.println(i + "n   " + newTime/1000 + "ms   " + doubledReason + "r");
		}
	}
	
	public static void main(String[] args) {
		System.out.println("TESTING...        (~º^º)~ ");
		test0();
		test1();
		test2();
		System.out.println("ALL TESTS PASSED! /(^-^)/");
	}
	
}
