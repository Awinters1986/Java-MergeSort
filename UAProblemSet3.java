/*  Date:           06/22/2020
 *  Filename:       UAProblemSet3.java
 */

public class UAProblemSet3 {
	
	public static void main(String[] args) {
		UAProblemSet3 ps3 = new UAProblemSet3();
		int[] A = {5, 9, 12, 3, 10};
		int x = 15;
		
		ps3.print(A);
		ps3.sumExists(A, x);
		
	}
	
	public boolean sumExists(int[] A, int x) {
		int l = 0;
		int r = A.length - 1;
		mergeSort(A, l, r);
		
		int i = 0;
		int j = A.length - 1;
		
		while(i < j) {
			if(A[i] + A[j] == x) {
				System.out.println(A[i] + " & " + A[j]);
				return true;
			} else if(A[i] + A[j] > x) {
				j--;
			} else {
				i++;
			}
		}
		
		return false;
	}
	
	public void mergeSort(int[] A, int l, int r) {
		if(l < r) {
			int m = (l + r) / 2;
			mergeSort(A, l, m);
			mergeSort(A, m + 1, r);
			merge(A, l, m, r);
		}
	}
	
	public void merge(int[] A, int l, int m, int r) {
		int n1 = m - l + 1;
		int n2 = r - m;

		int[] left = new int[n1 + 1];
		int[] right = new int[n2 + 1];
		
		for(int i = 0; i < n1; ++i) {
			left[i] = A[l + i];
		}
		
		for(int j = 0; j < n2; ++j) {
			right[j] = A[m + 1 + j];
		}
		
		int i = 0;
		int j = 0;
		int k = l;
		
		for(k = l; k < r; k++) {
			if(left[i] <= right[j]) {
				A[k] = left[i];
				i = i + 1;
			} else {
				A[k] = right[j];
				j = j + 1;
			}
		}
		
		while(i < n1) {
			A[k] = left[i];
			i++;
			k++;
		}
		
		while(j < n2) {
			A[k] = right[j];
			j++;
			k++;
		}
	}
	
	public void print(int[] A) {
		for(int i = 0; i < A.length; i++) {
			System.out.println(A[i]);
		}
	}

}
