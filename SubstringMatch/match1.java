//Longest Even Length Substring such that Sum of First and Second Half is same. Time Complexity - o(n3).
import java.util.*;

public class HelloWorld{

    public static void main(String []args){
       
       String str = "1538023";
       int maxLength = 0;
       int n = str.length();
       for (int i = 0; i < n; i++) {
           for (int j = i + 1; j < n; j = j + 2) {
               
               int len = j - i + 1;
               int sumLeft = 0;
               int sumRight = 0;
               for (int k = 0; k < len / 2; k++) {
                   sumLeft = sumLeft + (str.charAt(i + k) - '0');
                   sumRight = sumRight + (str.charAt(i + k + len / 2) - '0');
               }
               if (sumLeft == sumRight & maxLength < len) {
                   maxLength = len;
               }
           }
       }
        System.out.println("Max Length = " + maxLength);
    }
}
