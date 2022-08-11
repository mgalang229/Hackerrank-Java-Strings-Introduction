import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        String B = sc.next();
        
        //sum of lengths of A and B
        int n = A.length();
        int m = B.length();
        System.out.println(n + m);
        
        //check if A is lexicographically greater than B
        //note: uppercase letters < lowercase letters (in ASCII)
        boolean checker = true;
        if (A.compareTo(B) <= 0) {
            checker = false;
        }
        System.out.println((checker ? "Yes" : "No"));
        
        //capitalize first letters of A and B
        char[] a = A.toCharArray();
        char[] b = B.toCharArray();
        a[0] = Character.toUpperCase(a[0]);
        b[0] = Character.toUpperCase(b[0]);
        System.out.println(String.valueOf(a) + " " + String.valueOf(b));
        
        sc.close();
    }
}



