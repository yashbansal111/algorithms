package com.sort.algorithms;

import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;

public class Run {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int size = 5;
		Integer[] array = new Integer[size];
		
		SelectionSort selectionSort = new SelectionSort();
		for (int i = 0; i < size; i++) {
			array[i] = ThreadLocalRandom.current().nextInt(0, 100);
		}
		
		System.out.println("Unsorted Array:" + Arrays.toString(array));
		selectionSort.sort(size, array);
		System.out.println("Sorted Array:" + Arrays.toString(array));
		
	}

}
