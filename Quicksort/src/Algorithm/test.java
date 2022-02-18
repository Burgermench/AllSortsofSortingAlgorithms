// Made by: João M. Cardoso 15/02/2022
package Algorithm;

public class test {

	//tests sorted array creation
	private static void test0() {
		String errorMsg = "Test0 - Fail";
		int[] arr0 = helperMethods.createSortedArray(5);
		int[] arr1 = {0,1,2,3,4};
		assert arr0.length == arr1.length;
		for(int i = 0; i < 5; i++) {
			assert arr0[i] == arr1[i] : errorMsg;
		}
		int[] arr2 = helperMethods.createSortedArray(2,7);
		int[] arr3 = {2,3,4,5,6,7};
		assert arr2.length == 6 : errorMsg;
		for(int i = 0; i < arr2.length; i++) {
			assert arr2[i] == arr3[i] : errorMsg;
		}
		System.out.println("Test0 - Success");
	}
	
	//tests unsorted array creation
	private static void test1() {
		String errorMsg = "Test1 - Fail";
		int[] arr0 = helperMethods.createUnsortedArray(5);
		assert arr0.length == 5 : errorMsg;
		System.out.println("Test1 - Success ");
	}
		
	//tests quicksort
	private static void test2() {
		String errorMsg = "Test2 - Fail";
		int[] unorderedArray = helperMethods.createUnsortedArray(50);
		quickSort.sort(unorderedArray);
		assert helperMethods.isSorted(unorderedArray) : errorMsg;
		System.out.println("Test2 - Success");
	}
	
	//speed test using doubling reason
	private static void test3() {
		int n = (int) Math.pow(2,18); //max number of elements
		System.out.println("Testing sort times for unsorted arrays of doubling size...");
		double lastTime = 1;
		for(int i = 1; i <= n; i*=2) {
			int[] arr0 = helperMethods.createUnsortedArray(i);
			double time1 = System.nanoTime();
			quickSort.sort(arr0);
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
		test3();
		System.out.println("ALL TESTS PASSED! /(^-^)/");
	}

}
