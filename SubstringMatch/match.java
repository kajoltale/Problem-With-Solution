import java.util.*;

public class HelloWorld{

     public static void main(String []args){
       
        String str = "abcabc";
        
        String temp = "";
        for (int i = 1; i < str.length(); i = i + 2) {
            temp = temp + str.charAt(i-1) + str.charAt(i);
            String result = checkSum(temp);
            if (result.equals("No Match")) {
                continue;
            }
            else {
                System.out.println("Result is " + result);
            }
        }
    }
    
    public static String checkSum(String temp) {
        int len = temp.length()-1;
        String r = "" + temp.charAt((len/2)+1);
        String l = "" + temp.charAt(len/2);

        for(int i = 2; i < len; i++) {
            r = r + temp.charAt((len/2)+i);
            l = temp.charAt((len/2)-i+1) + l;
            
            if (l.equals(r)) {
                return temp;
            }
        }
        
      if (l.equals(r)) {
            return temp;
        }
    
    return "No Match";
    }
}
