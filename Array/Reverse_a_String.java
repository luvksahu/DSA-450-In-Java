
//Question: Reverse a String
//Link: https://practice.geeksforgeeks.org/problems/reverse-a-string/1

import java.util.*;
import java.io.*;

class Reverse_a_String
{
    public static void main(String args[])throws IOException
    {
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        System.out.println(reverseWord(str));
        sc.close();
    } 
    static String reverseWord(String str)
    {
        char arr[]=str.toCharArray();
        int i=0,len=str.length()-1;
        char a;
        while(i<=len)
        {
            a=arr[i];
            arr[i]=arr[len];
            arr[len]=a;
            i++;len--;
        }
        str="";
        for(char c:arr)
            str+=c;
        return str;
    }
}