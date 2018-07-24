//Print two digits possible numbers from 0 to 5,where number should be like ten's place digit greater than one's palce digit.

import java.util.*;
class Digits {
	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);

		int[] arr = new int[6];
		for (int i = 0; i < 6; i++) {
			arr[i] = i;
		}
		Result obj = new Result();
		obj.twoDigit(arr,6);
	}
}
class Result {
	void twoDigit(int arr[], int n) {
        int count = 0;
        for(int i = 0; i < 6; i++) {
            for(int j = 1+1; j < 6; j++) {
                int num = arr[i] > arr[j] ? (arr[i]*10 + arr[j]) : (arr[j]*10 + arr[i]);
                System.out.println(num);
            }
        }
    }
}