//Question: Check whether String is palindrome or not
//Problem url: https://practice.geeksforgeeks.org/problems/palindrome-string0817/1

//solution: 

import java.util.*;
import java.io.*;
public class Check_palindrome 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        System.out.println(check(s,s.length()-1));
    }
    static int check(String s,int j)
    {
        int i=0;
        while(i<=j)
        {
            if(s.charAt(i)!=s.charAt(j))
                return 0;
            i++;j--;
        }
        return 1;
    }
}
