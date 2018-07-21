//Java program to merge array alternatively.

import java.util.*;
class MergeAlter {
	public static void main(String args[]) {

		int arr1[] = {1, 3, 5, 7, 9, 11};
        int n1 = arr1.length;
     
        int arr2[] = {2, 4, 6, 8};
        int n2 = arr2.length;
     
        int arr3[] = new int[n1+n2];

        int i = 0, j = 0, k = 0;
     
        while (i < n1 && j < n2)
        {
            arr3[k++] = arr1[i++];
            arr3[k++] = arr2[j++];
        }
  
        while (i < n1)
            arr3[k++] = arr1[i++];
     
        while (j < n2)
            arr3[k++] = arr2[j++];
     
        System.out.println("Array after merging");
        for (i = 0; i < n1 + n2; i++)
            System.out.print( arr3[i] + " ");
    }
}