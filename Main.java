package Sorts;

import java.util.Random;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x;
		Random var = new Random();

		int randArr = var.nextInt(1000);

		int[] arr = new int[1000];

		for (int n = 0; n < arr.length - 1; n++) {
			int rand = var.nextInt(100);
			arr[n] = rand;
		}
		System.out.println("Unsorted:");

		print(arr);

		System.out.print("\nInsertion Sorted: __________________________________________________\n");
		InsertionSort.insertionSort(arr);
		print(arr);

		System.out.print("\nBubble Sorted: __________________________________________________\n");
		Bubble.bubbleSort(arr);
		print(arr);

		System.out.print("\nImporoved Bubble Sorted: __________________________________________________\n");
		Bubble.improvedBubbleSort(arr);
		print(arr);

		System.out.print("\nQuick Sorted: __________________________________________________\n");
		QuickSort.quickSort(arr);
		print(arr);

	}

	// prints out Array
	public static void print(int[] arr) {
		for (int n = 0; n < arr.length; n++) {
			if (n % 20 == 0 && n != 0) {
				System.out.println(arr[n]);
			} else {
				System.out.print(arr[n] + " ");
			}
		}
	}
}
