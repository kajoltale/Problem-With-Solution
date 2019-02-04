//Minimum operations required to make all the elements distinct in an array.

import java.util.*;

public class HelloWorld{

     public static void main(String []args){
        
        int[] arr = {1,2,3};
        int len = arr.length;
        
        HashSet<Integer> hset = new HashSet<Integer>();
        for (int i = 0; i < len; i++) {
            hset.add(arr[i]);
        }
        System.out.println(hset);
        
        int size = hset.size();
    
     System.out.println("Result = " + (len - size));
    }
}
