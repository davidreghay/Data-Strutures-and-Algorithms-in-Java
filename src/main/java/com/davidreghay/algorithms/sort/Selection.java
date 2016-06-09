package com.davidreghay.algorithms.sort;

import java.util.Arrays;

public class Selection extends Sort {

	public static void sort(Comparable[] list) {
		int N = list.length;
		for(int i = 0; i < N; i++) {
			int min = i;
			for(int j = i + 1; j < N; j++) {
				if(less(list[j], list[min])) {
					min = j;
				}
			}
			exch(list, i, min);
		}
	}
	
	public static void main(String args[]) {
		Integer[] myArray = {3, 2, 4, 7, 10, 3, 22, 4};
		System.out.println(Arrays.toString(myArray));
		Selection.sort(myArray);
		System.out.println(Arrays.toString(myArray));
	}

}
