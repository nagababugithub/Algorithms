package algorithms;

import java.util.Scanner;

class SubArrayWithGivenSum {
	private static Scanner in;

	public static void main(String[] args) {
		System.out.println("please enter valuse...");
		in = new Scanner(System.in);
		int t = in.nextInt();

		for (int j = 0; j < t; j++) {
			
			int n = in.nextInt();
			int s = in.nextInt();
			int arr[] = new int[n];
			for (int i = 0; i < n; i++) {
				arr[i] = in.nextInt();
			}
			
			int start = 0;
			int end = -1;
			int sum = 0;
			for (int i = 0; i < n; i++) {

				sum = sum + arr[i];
				if (sum > s) {
					while (sum > s) {
						sum = sum - arr[start];
						start = start + 1;
					}
				}
				if (sum == s) {
					end = i;
					break;
				}
			}
			
			if (end == -1) {
				System.out.println(end);
			} else
				System.out.println((start + 1) + " " + (end + 1));
		}
	}
}