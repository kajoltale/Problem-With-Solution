//Java program to merge string array.

import java.util.*;
class MergeStringArray {
	public static void main(String args[]) {

		String a[] = {"A","E","I"};
		String b[] = {"O","U"};

		List list = new ArrayList(Arrays.asList(a));
		list.addAll(Arrays.asList(b))
		Object[] c = list.toArray();
		System.out.println(Arrays.toString(c));
    }
}