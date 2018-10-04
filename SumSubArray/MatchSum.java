//Program to find pair from sorted array whose sum is equal to given sum.
class MatchSum {
	public static void main(String[] args) {

		int array[] = {1,4,5,6,9,10,20};
		int sum = 15;
		int low = 0;
		int high = array.length - 1;

		while (low < high) {
			int temp = array[low] + array[high];
			if (low == high) {
				break;
			}
			else {
				if (temp == sum) {
					System.out.println("Pair is " + array[low] + "," + array[high]);
					low++;
					high--;
				}
				else if (temp > sum) {
					high--;
				}
				else {
					low++;
				}
			}
		}
	}	
}