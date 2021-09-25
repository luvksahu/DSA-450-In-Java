// Problem URL: https://www.geeksforgeeks.org/a-program-to-check-if-strings-are-rotations-of-each-other/

// Solution :

import java.io.IOException;
import java.util.Scanner;

class IsRotation {
    public static void main(String[] args)throws IOException {
        Scanner sc=new Scanner(System.in);
        String s1=sc.next();
        String s2=sc.next();
        String conc=s1+s1;
        if(s1.length()==s2.length() && conc.contains(s2)){
            
            System.out.println("Strings are rotations of each other");
        }
        else
            System.out.println("Strings are not rotations of each other");
        
        sc.close();
    }
}
