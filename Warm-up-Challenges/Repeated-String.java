import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;
import java.util.LinkedList;
import java.util.ArrayList;


public class Solution {

    // Complete the repeatedString function below.
    static long repeatedString(String s, long n) {
        long count = 0;
        long length = s.length();
        long s1 = n/length;
        long s2 = n%length;
        //dem so lan xuat hien chu a trong s (chua tinh phan du)
		for(int i=0;i<length;i++)
        {
            if(s.charAt(i)=='a')
            {
                count++;
            }
        }
		//tinh so lan xuat hien chu a voi do dai n (chua tinh phan du)
        count = count*s1;
		//(tinh them phan du)
        for(int i=0;i<s2;i++)
        {
            if(s.charAt(i)=='a')
            {
                count++;
            }
        }
        return count;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = scanner.nextLine();

        long n = scanner.nextLong();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        long result = repeatedString(s, n);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
