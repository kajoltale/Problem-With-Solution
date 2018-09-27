//Write a Program to Count the Occurrences of a Word in a Text File.
import java.util.*;
import java.io.*;
class WordOccur {
	public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(new FileReader("Word.txt")); 
		StringBuilder build = new StringBuilder(); 
		String line = br.readLine();

		while (line != null) { 
			build.append(line).append("\n"); 
			line = br.readLine(); 
		} 
		String data = build.toString(); 
		for (int j = 0; j < data.length(); j++) {
			data = data.replaceAll("[.?'':*&%$@!]", "");
			String [] tokens = data.split("\\s+");
        	HashMap<String,Integer> map = new HashMap<String,Integer>();
        	for (int i = 0; i < tokens.length; i++) {
        		if (tokens[i].trim().length () >0 && tokens[i].trim().matches("[A-Z|a-z]+")){
	        		String str = tokens[i].toLowerCase();
	        		if (map.containsKey(str)) {
	        			map.put(str, map.get(str) + 1);
	        		}
	        		else {
	        			map.put(str, 1);
	        		}
	        	}  
	        }  
	        if (j == data.length()-1) {
	        		System.out.println(map);
	        	}    	
		}
	}
}