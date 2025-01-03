import java.util.*;

public class Solution {
	
	/**
	 * Author: Tristan J Frey
	 * Date: January 3, 2025
	 * 
	 * This class handles an Insertion Sort algorithm. It will return an array
	 * until N steps through the array
	 */

	/**
	 * Sorts an array using the insertion sort algorithm.
	 * 
	 * The insertion sort algorithm starts at index 1 and loops incrementally through the array.
	 * At each iteration, it compares the current element to the elements on its left (decrementally).
	 * It shifts larger elements to the right and places the current element in the correct sorted position.
	 * This process is repeated for every element in the array until the entire array is sorted.
	 *
	 * @param int list An array of integers to be sorted.
	 * @param int N The "step" we stop the sort at
	 * @return int arr A sorted array of integers (until N steps).
	 */
	public int[] insertionSort(int[] list, int N) { 
		// Iterate through the array starting from index 1
		for (int i = 1; i < list.length; i++) {
			int temp = list[i]; // Current element to place
			int j = i - 1;

			// Move elements larger than temp to the right
			while (j >= 0 && list[j] > temp && N > 0) {
				list[j + 1] = list[j]; // Shift element
				j--; // Move to the next element on the left
				N--; // Decrement step counter
			}

			list[j + 1] = temp; // Insert temp in its correct position
		}

		return list;
	} // End of insertionSort Method
} // End of Class