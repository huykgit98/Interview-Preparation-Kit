import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the twoStrings function below.
    static String twoStrings(String s1, String s2) {
        //time limit 2 test cases
        // char result;
        // String result1;
        // for (int i=0; i<=s1.length()-1; i++) {  
        //      result = s1.charAt(i);
        //      result1 =  Character.toString(result);
        //     if(s2.contains(result1))
        //     {
        //         return "YES";                               
        //     }
        // }          
        // return "NO";
        char[] charArray1 = s1.toCharArray();
        HashSet<Integer> str1 = new HashSet<Integer>();
        for (char c : charArray1) {
            str1.add((int) c);
		//2
		//hello
		//world
		//hi
		//world
		//====>>
		//104
		//101
		//108
		//108
		//111
		//104
		//105
         System.out.println((int)c);
        }
        for (char c : s2.toCharArray()) {
            if (str1.contains((int) c)) {
                return "YES";
            }

        }
        return "NO";
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int q = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int qItr = 0; qItr < q; qItr++) {
            String s1 = scanner.nextLine();

            String s2 = scanner.nextLine();

            String result = twoStrings(s1, s2);

            bufferedWriter.write(result);
            bufferedWriter.newLine();
        }

        bufferedWriter.close();

        scanner.close();
    }
}
