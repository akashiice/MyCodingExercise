package FindProduct;

import java.util.Arrays;

public class FindProdWithoutDiv {
		
	// Recursive function to replace each element of the array with product
		// of every other element without using division operator
	public static int findProduct(int[] a, int n, int left, int i) {
		
		//base case: no elements left on right side
		if(n==i)
			return 1;
		
		// take back up of current element
		int cur = a[i];
		
		//calculate product of the right sub array
		int right = findProduct(a, n, left*a[i], i+1);
		
		System.out.println("right = "+right+" cur = "+cur+" left = "+left+" i "+i);
		
		//replace current element with the product of left and right sub array
		a[i] = left * right;
		
		//return product of right sub array including current element
		return cur * right;
	}
	
	
	//driver method
	public static void main(String[] args) {
		int[] A = {1,2,3,4};
		findProduct(A, A.length, 1, 0);
		System.out.println(Arrays.toString(A));
	}
}
