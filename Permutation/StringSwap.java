import java.util.*;
class StringSwap {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a string");
		String str = sc.nextLine();
		int n = str.length();
		stringCharSwap(str, 0, n-1);
	}

	public static void stringCharSwap(String str, int start, int end) {
		if (start == end) {
		    System.out.println(str);
		}
		else {
			for (int i = start; i <= end; i++) { 
				str = swap(str, start, i); 
			    stringCharSwap(str, start+1, end); 
			    str = swap(str, start, i); 
		    }
		}   
		
	}	
		 
	public static String swap(String str, int i, int j) {
		 	char ch[] = str.toCharArray();
		      char temp = ch[i];
		      ch[i] = ch[j];
		      ch[j] = temp;
	    
		      return String.valueOf(ch);
		}   

}