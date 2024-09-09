import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int m = scanner.nextInt();

        BitSet bitSet1 = new BitSet(n);
        BitSet bitSet2 = new BitSet(n);



        for (int i = 0; i < m; i++) {
            String operation = scanner.next();
            int x = scanner.nextInt();
            int y = scanner.nextInt();


            switch (operation) {
                case "AND":
                    if (x == 1) {
                        bitSet1.and(bitSet2);
                    } else {
                        bitSet2.and(bitSet1);
                    }
                    break;
                case "OR":
                    if (x == 1) {
                        bitSet1.or(bitSet2);
                    } else {
                        bitSet2.or(bitSet1);
                    }
                    break;
                case "XOR":
                    if (x == 1) {
                        bitSet1.xor(bitSet2);
                    } else {
                        bitSet2.xor(bitSet1);
                    }
                    break;
                case "FLIP":
                    if (x == 1) {
                        bitSet1.flip(y);
                    } else {
                        bitSet2.flip(y);
                    }
                    break;
                case "SET":
                    if (x == 1) {
                        bitSet1.set(y);
                    } else {
                        bitSet2.set(y);
                    }
                    break;
            }
            System.out.println(bitSet1.cardinality() + " " + bitSet2.cardinality());

        }



    }
}
