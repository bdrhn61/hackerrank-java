import java.util.Scanner;

public class Solution {



    static boolean isAnagram(String a, String b) {
        // Complete the function
        a=a.toLowerCase();
        b=b.toLowerCase();

        char [] arryA =a.toCharArray();
        char [] arryB =b.toCharArray();

        Arrays.sort(arryA);
        Arrays.sort(arryB);

        return Arrays.equals(arrayA, arrayB);

    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}
