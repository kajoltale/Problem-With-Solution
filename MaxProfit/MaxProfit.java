import java.util.*;

class MaxProfit {
	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter length of array");
		int n = sc.nextInt();

		int profit = 0;

		System.out.println("Enter prices in array ");
		int[] price = new int[1000];

		for (int i = 0; i < n; i++) {
			price[i] = sc.nextInt();
		}

		System.out.println("Prices in array are");
		for (int i = 0; i < n; i++) {
			System.out.print(price[i] + " ");
		}

		System.out.println("");
		System.out.println("Enter buying day");
		int buyingDay = sc.nextInt();

		System.out.println("Enter selling day");
		int sellingDay = sc.nextInt();

		for (int i = 0; i < n; i++) {
			if (buyingDay == i) {
				int c = price[i];
				for (int j = 0; j < n; j++) {
					if (sellingDay == j) {
						profit = price[j] - price[i];
					}
				}
			}
		}
		if (profit >= 0) {
			System.out.println("profit is " + profit);
		}
		else
		{
			System.out.println("Enter valid days");
		}
	}
}