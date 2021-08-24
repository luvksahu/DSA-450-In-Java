
//Question: Reverse a Array
//Link: https://www.geeksforgeeks.org/write-a-program-to-reverse-an-array-or-string/

import java.util.*;
//import java.lang.*;
import java.io.*;

class Reverse_a_Array
{
    public static void main(String args[])throws IOException
    {
        Scanner sc=new Scanner(System.in);
        //Array size input
        int n=sc.nextInt();
        int arr[]=new int[n];
        //Array input
        for(int i=0;i<n;i++)
            arr[i]=sc.nextInt();
        //Calling reverse function pass by reference
        reverse(arr,n-1);
        for(int a:arr)
            System.out.print(a+" ");
        sc.close();
    } 
    static void reverse(int arr[],int n)
    {
        int i=0,temp=0;
        //Reversing logic
        while(i<=n)
        {
            temp=arr[i];
            arr[i]=arr[n];
            arr[n]=temp;
            i++;n--;
        }
    }
}