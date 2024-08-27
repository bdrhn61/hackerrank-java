import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int []dizi= new int[a];
        int sayac=0;
        for(int i=0;i<a;i++){
            dizi[i]=scan.nextInt();

        }
        for (int i = 0; i < dizi.length; i++) {
            for (int j = i; j < dizi.length; j++) {
                int subToplam=0;
                for (int k = i; k <= j; k++) {
                    subToplam=dizi[k]+subToplam;
                }

                if(subToplam<0){
                    sayac++;
                }
            }
        }

        System.out.println(sayac);



    }
}
