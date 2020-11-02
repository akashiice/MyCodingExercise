/*
find all distinct combinations of given length - 1

Given an array of integers, find all distincy combinations of given length.

For example,
Input:  {1, 2, 3}, k = 2
Output: {1, 2}, {1, 3}, {2, 3}
Input: {1, 2, 1}, k = 2
Output: {1, 1}, {1, 2}
*/
package findAllDistinctComb;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class DistComb1 {
	public static void recur(int[] A, String sol, int i, int k)
	{
		//invalid input
		if(k>A.length) {
			return;
		}
		
		//base condition: combination size is k
		if(k == 0) {
			System.out.println(sol);
			return;
		}
		
		//start from next index till the last index
		for (int j = i; j < A.length; j++) {
			
			//add current element A[j] to solution & recur for next index
			// (j+1) with one less element (k-1)
			recur(A, sol +" "+ A[j], j+1, k-1);
			
			//to handle duplicates
			
			  while(j<A.length-1 && A[j] == A[j+1]) { j++; }
			 
		}
		
	}
	
	public static void main(String[] args) {
		int[] A = {1,2,1,1,2,3};
		//sort the array
		Arrays.sort(A);
		recur(A, "", 0, 2);
	}
}
