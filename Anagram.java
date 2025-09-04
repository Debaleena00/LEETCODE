import java.util.*;

public class Anagram {
    public static void main(String[] args) {
        String a="anagram";
        String b="nagaram";
        char x[] =a.toCharArray();
        char y[]=b.toCharArray();
        if(x.length != y.length){
            System.out.println("no");
        }
        Arrays.sort(x);
        Arrays.sort(y);
        for(int i=0;i<x.length;i++){
            if(x[i]!=y[i]){
                System.out.println("no");

            }
        }
        System.out.println("Yes");
    }
    
}
