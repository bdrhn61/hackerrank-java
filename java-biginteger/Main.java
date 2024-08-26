import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        String n = scan.nextLine();
        String t = scan.nextLine();
        BigInteger bign =new BigInteger(n);
        BigInteger bigt =new BigInteger(t);
        System.out.println(bign.add(bigt));
        System.out.println(bign.multiply(bigt));


    }
}
