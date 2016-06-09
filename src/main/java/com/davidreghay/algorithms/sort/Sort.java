package com.davidreghay.algorithms.sort;

public class Sort {
	
	public static void sort(Comparable[] list) {
		/**
		 * Can't declare a static abstract method, so this will have to do
		 */
	};

	public static boolean less(Comparable v, Comparable w) {
		return v.compareTo(w) < 0;
	}
	
	public static void exch(Comparable[] a, int i, int j) {
		Comparable temp = a[i];
		a[i] = a[j];
		a[j] = temp;
	}
	
	public static boolean isSorted(Comparable[] a) {
		for(int i = 1; i < a.length; i++) {
			if(less(a[i], a[i-1])) {
				return false;
			}
		}
		return true;
	}
	
}