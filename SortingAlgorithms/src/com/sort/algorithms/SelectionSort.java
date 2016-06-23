package com.sort.algorithms;

import java.util.Arrays;

public class SelectionSort {

	public void sort(int size, Integer[] array) {
		for (int i = 0; i < size; i++) {
			int temp = -1;
			for (int j = i + 1; j < size; j++) {
				if (array[j] < array[i]) {
					//System.out.println(i + ": " + array[j]);
					temp = array[i];
					array[i] = array[j];
					array[j] = temp;
				}
			}
			System.out.println(Arrays.toString(array));
		}
	}
}
