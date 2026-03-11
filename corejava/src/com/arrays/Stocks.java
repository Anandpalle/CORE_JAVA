package com.arrays;

public class Stocks {
	public static void main(String[] args) {
		int arr[] = { 13, 2, 10, 1, 5, 2, 9, 11 };
		int min = arr[0];
		int max_profit = 0;
		int buy_date = 0;
		int sell_date = 0;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < min) {
				min = arr[i];
				buy_date = i + 1;
			}
			int profit = arr[i] - min;
			if (profit > max_profit) {
				max_profit = profit;
				sell_date = i + 1;

			}
		}
		System.out.println(
				"Maximum  profit occurs when to buy stocks at DAY- " + buy_date + " and sell at DAY-" + sell_date);
		System.out.println("The profit is " + max_profit);

	}
}
