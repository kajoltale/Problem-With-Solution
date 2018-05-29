import java.io.*;
import java.math.*;
import java.util.*;


public class SparseArray{
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter number of strings");
        int stringsCount = scanner.nextInt();

        String[] strings = new String[stringsCount];

        System.out.println("Enter strings");
        for (int i = 0; i < stringsCount; i++) {
            strings[i] = scanner.next();
        }

        System.out.println("Enter number of queries");
        int queriesCount = scanner.nextInt();

        String[] queries = new String[queriesCount];

        System.out.println("Enter queries");
        for (int i = 0; i < queriesCount; i++) {
            queries[i] = scanner.next();
        }

        int[] result = new int[queries.length];
        String c;
        int count = 0;
        for (int i = 0; i < queries.length; i++)
        {
            count = 0;
            for (int j = 0; j < strings.length; j++)
            {
                if ((strings[j].equals(queries[i])))
                {
                    count ++;
                }
            }
            System.out.println("Count of string " + queries[i] + "is" + " " + count);
        }
    }
}