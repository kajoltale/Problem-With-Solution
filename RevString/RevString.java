import java.util.*;

class RevString{
public static void main(String args[]){

Scanner sc = new Scanner(System.in);
System.out.println("Enter a string");
String str = sc.nextLine();
System.out.println("String is "+ str);

String[] splitString = str.split(" ");
String[] revString = new String[splitString.length];

for (int i = 0; i < splitString.length; i++)
{
	revString[i] = splitString[splitString.length - i - 1];
}
System.out.print("Reverse string is ");
for (int i = 0; i < splitString.length; i++)
{
	System.out.print(revString[i] + " ");
}
}
}