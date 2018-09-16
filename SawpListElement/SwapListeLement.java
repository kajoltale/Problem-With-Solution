//Write a Program to Swap the First and Last Value of a List.
import java.util.*;
class SwapListELement {
	public static void main(String[] args) {

		List<Integer> list = new ArrayList<Integer>();
		list.add(10);
		list.add(2);
		list.add(4);
		list.add(1);
		list.add(9);
		int n = list.size();

		System.out.println("Elements before swapping");
		System.out.println(list);

		System.out.println("Elements after swapping");
		int temp = list.get(0);
		list.set(0, list.get(n-1));
		list.set(n-1, temp);
		System.out.println(list);
	}
}