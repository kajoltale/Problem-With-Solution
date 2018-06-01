import java.util.*;

class MaxProfit {
	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter length of array");
		int n = sc.nextInt();

		System.out.println("Enter prices in array ");
		int[] price = new int[1000];

		for (int i = 0; i < n; i++) {
			price[i] = sc.nextInt();
		}

		System.out.println("Prices in array are");
		for (int i = 0; i < n; i++) {
			System.out.print(price[i] + " ");
		}

		int maxProfit = 0, profit = 0;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (price[j] > price[i]) {
					profit = price[j] - price[i];
					if (profit > maxProfit) {
						maxProfit = profit;
					}
				}
			}
		}

		System.out.println("Maximum profit is " + maxProfit);
	}
}