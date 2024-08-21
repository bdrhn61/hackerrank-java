import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        scan.close();
        s= s.replaceAll("\\s+", " ").trim();
        String[] parts = s.split("[^a-zA-Z]+");

        if (s.isEmpty()) {
            System.out.println(0);
        }else
            System.out.println(parts.length);


        for (String part :parts){

            System.out.println(part);
        }
    }
}

