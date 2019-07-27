package _01_Searching_Algorithms;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class _04_SearchTest {

	// A MINIMUM OF 3 TESTS ARE REQUIRED FOR EACH METHOD
	
	@Test
	public void testLinearSearch() {
		//1. use the assertEquals method to test your linear search method.
		String[] words = {"word", "something", "tree", "door", "car", "whopper"};
		int y = _00_LinearSearch.linearSearch(words, "tree");
		assertEquals(y, 2);
	}

	@Test
	public void testBinarySearch() {
		//2. use the assertEquals method to test your binary search method.
		//   remember that the array must be sorted
		int[] array = {3, 4, 5, 6, 8, 9, 12, 23, 56, 108};
		int y = _01_BinarySearch.binarySearch(array, 0, array.length-1, 23);
		assertEquals(y, 7);
	}
	
	@Test
	public void testInterpolationSearch() {
		//3. use the assertEquals method to test your interpolation search method.
		//   remember that the array must be sorted and evenly distributed
		int[] array = {3, 4, 5, 6, 8, 9, 12, 23, 56, 108};
		int y = _02_InterpolationSearch.interpolationSearch(array, 8);
		assertEquals(y, 4);
	}
	
	@Test
	public void testExponentialSearch() {
		//4. use the assertEquals method to test your exponential search method.
		//   remember that the array must be sorted
		int[] array = {3, 4, 5, 6, 8, 9, 12, 23, 56, 108};
		int y = _03_ExponentialSearch.exponentialSearch(array, 5);
		assertEquals(y, 2);
	}
}
