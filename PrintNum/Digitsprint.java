//Print two digits possible numbers from 0 to 5,where number should be like ten's place digit increasng and one's palce digit decreasing.
5
import java.util.*;
class DigitsPrint {
	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);

		for(int i = 1; i < 6; i++) {
			for (int j = 5; j >= 0; j--) {
				System.out.println((i*10)+j);
			}
		}
	}
}