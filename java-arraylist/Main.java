import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        ArrayList<ArrayList<Integer>> lines = new ArrayList<>();


        for (int i = 0; i < n; i++) {
            int icSayilar=scanner.nextInt();
            ArrayList<Integer> icSatir = new ArrayList<>();
            for(int j=0;j<icSayilar;j++){
                icSatir.add(scanner.nextInt());
            }
            lines.add(icSatir);
        }
        int sorguSayisi=scanner.nextInt();
        for(int i=0;i<sorguSayisi;i++){
            int x=scanner.nextInt();
            int y=scanner.nextInt();
            try{
                System.out.println(lines.get(x-1).get(y-1));
            } catch(IndexOutOfBoundsException e){
                System.out.println("ERROR!");
            }
        }



    }
}
