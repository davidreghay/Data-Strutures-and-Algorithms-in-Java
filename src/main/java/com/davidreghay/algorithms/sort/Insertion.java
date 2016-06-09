package com.davidreghay.algorithms.sort;

import java.util.Arrays;

public class Insertion extends Sort {
	public static void sort(Comparable[] list) {
		int N = list.length;
		for(int i = 0; i < N; i++) {
			for(int j = i + 1; j > 0; j--) {
				if(less(list[j], list[i])) {
					exch(list, j, i);
				}
			}
		}
	}
	
	public static void main(String args[]) {
		Integer[] myArray = {3, 2, 4, 7, 10, 3, 22, 4};
		System.out.println(Arrays.toString(myArray));
		Selection.sort(myArray);
		System.out.println(Arrays.toString(myArray));
	}
}
