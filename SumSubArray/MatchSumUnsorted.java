//Program to find pair from unsorted array whose sum is equal to given sum.
import java.util.*;
class MatchSumUnsorted {
	public static void main(String[] args) {
		 
		 int array[] = {2,5,1,7,19,10,25,8};
		 int sum = 15;

		 HashSet<Integer> hset = new HashSet<Integer>();

		 for (int i = 0; i < array.length; i++) {
		 	int temp = array[i];
		 	if (hset.contains(temp)) {
		 		System.out.println("Pair is " + array[i] + "," + (sum - temp));
		 	}
		 	else {
		 		hset.add(sum - temp);
		 	}
		 }
	}
}