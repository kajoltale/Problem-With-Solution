//if input is arr1={a0,a1}, arr2={b0,b1} then claculate (a0/b0)+(a1/b1)=(c0/c1) and print output arr3={c0,c1}.

import java.util.*;
class Logic {
	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);

        System.out.println("Enter length of first string");
        int n = sc.nextInt();

        System.out.println("Enter length of second string");
        int m = sc.nextInt();


        int[] arr1 = new int[n];
        int[] arr2 = new int[m];  
        int[] arr3 = new int[2];

        if (n == m) {
        	System.out.println("Enter elements of first array");
        	for (int i = 0; i < n; i++) {
        		arr1[i] = sc.nextInt();
        	}
        	System.out.println("Enter elements of second array");
        	for (int i = 0; i < n; i++) {
        		arr2[i] = sc.nextInt();
        	}

        	int temp = 1, c2 = 1,c1 =0;
        	for (int i = 0; i < n; i++) {
        		temp = 1;
        		for (int j = 0; j < n; j++) {
        			if (j == i) {
        				continue;
        			}
        			else {
        				temp = temp * arr2[j];
        			}
        		}
        		c1 = c1 + temp * arr1[i];
        	}
        	for (int i = 0; i < n; i++) {
        		c2 = c2 * arr2[i];
        	}

        	
        	if (c1 < c2)
        	for (int i = 2; i <= c1; i++) {
        		while(c2 % i == 0 && c1 % i == 0) {
        			c2 /= i;
            		c1 /= i;
            	}
            }
            else {
            	for (int i = 2; i <= c2; i++) {
        		while(c1 % i == 0 && c2 % i == 0) {
        			c1 /= i;
            		c2 /= i;
            	}
            }
            }

            arr3[0] = c1;
        	arr3[1] = c2;
        	for (int i = 0; i < 2; i++) {
        		System.out.print(arr3[i] + " ");
        	}
        }
        else {
        	System.out.println("Enter equal array lengths");
        }

        
	}
}