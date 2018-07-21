//Java program to print bosses in an array.
//Bosses are those elements which is greater than all its right hand side element.

import java.util.*;

public class Bosses {
	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter number of elements in an array");
		int n = sc.nextInt();

		System.out.println("Enter elements of array");
		int[] array = new int[n];
		for (int i = 0; i < n; i++) {
			array[i] = sc.nextInt();
		}

		System.out.println("Bosses in an array are");
		int max = array[n-1];
		System.out.print(max + " ");
    	for(int i = n-2; i >= 0; i--) {
    		if(max < array[i]) { 
    			System.out.print(array[i] + " ");
           		max = array[i];
           	}
        }   
	}
}