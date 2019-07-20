package _00_Sorting_Algorithms;

import java.util.Random;

public class BogoSorter extends Sorter {
	public BogoSorter() {
		type = "Bogo";
	}
	
	// Bogo sort is a joke sorting algorithm. It is considered the most 
	// inefficient sorting algorithm while still maintaining the possibility
	// of eventually sorting data.
	
	// It works by following these steps:
	// STEP 1. Is the array in order?
	//	if yes, finished; if no, go to step 2.
	// STEP 2. Take two random elements in the array and swap them.
	// STEP 3. Go back to step 1.
	
	//1. Complete the sort method using the Bogo sort algorithm. 
	@Override
	void sort(int[] array, SortingVisualizer display) {
		
		
		boolean ordered = true;
		boolean finished = true;
		
		for(int i = 1; i < array.length; i++) {
			if(array[i-1]>array[i]) {
				ordered = false;
			}
		}
		while(!ordered) {
			display.updateDisplay();
			int rand1 = (int) (Math.random()*array.length);
			int rand2 = (int) (Math.random()*array.length);
			int x = array[rand1];
			array[rand1] = rand2;
			array[rand2] = x;
			
			for(int i = 1; i < array.length; i++) {
				if(array[i-1]>array[i]) {
					finished = false;
				}
			}
			if(finished) {
				break;
			}
		}

	}
}
