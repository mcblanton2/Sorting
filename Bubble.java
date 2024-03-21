package Sorts;

public class Bubble {
	protected static boolean needNextPass = true;

	public static void bubbleSort(int[] list) {
		for (int k = 1; k < list.length; k++) {
			for (int i = 0; i < list.length - k; i++) {
				if (list[i] > list[i + 1]) {
					int temp = list[i];
					list[i] = list[i + 1];
					list[i + 1] = temp;
				}
			}
		}
	}

	public static void improvedBubbleSort(int[] list) {
		for (int k = 1; k < list.length && needNextPass; k++) {
			needNextPass = false;

			for (int i = 0; i < list.length - k; i++) {
				if (list[i] > list[i + 1]) {
					int temp = list[i];
					list[i] = list[i + 1];
					list[i + 1] = temp;

					needNextPass = true;
				}
			}
		}
	}
}
