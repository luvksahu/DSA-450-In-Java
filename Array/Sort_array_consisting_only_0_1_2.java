//Question: Given an array which consists of only 0,1 and 2. Sort the array
//Problem Link: https://practice.geeksforgeeks.org/problems/sort-an-array-of-0s-1s-and-2s/0

//Solution:

import java.io.*;
import java.util.*;
public class Sort_array_consisting_only_0_1_2 
{
    public static void main(String[] args) throws IOException
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
            arr[i]=sc.nextInt();
        sort012(arr, n);
        for(int a:arr)
            System.out.print(a+" ");
    }
    public static void sort012(int a[], int n)
    {
        int a0=0,a1=0,a2=0;
        for(int i=0;i<n;i++)
        {
            switch(a[i])
            {
                case 0:a0++; break;
                case 1:a1++; break;
                default: a2++;
            }
        }
        int k=0;
        for(int i=0;i<a0;i++)
        {
            a[k]=0;
            k++;
        }
        for(int i=0;i<a1;i++)
        {
            a[k]=1;
            k++;
        }
         for(int i=0;i<a2;i++)
         {
            a[k]=2;
            k++;
         }
    }
}

/*
Alternate solution:

class Solution
{
    public static void sort012(int a[], int n)
    {
        ArrayList<Integer> l0=new ArrayList<>();
        ArrayList<Integer> l1=new ArrayList<>();
        ArrayList<Integer> l2=new ArrayList<>();
        for(int i=0;i<n;i++)
        {
            if(a[i]==0)
                l0.add(a[i]);
            else if(a[i]==1)
                l1.add(a[i]);
            else
                l2.add(a[i]);
        }
        int k=0;
        for(int i=0;i<l0.size();i++)
        {
            a[k]=l0.get(i);
            k++;
        }
        for(int i=0;i<l1.size();i++)
        {
            a[k]=l1.get(i);
            k++;
        }
        for(int i=0;i<l2.size();i++)
        {
            a[k]=l2.get(i);
            k++;
        }
    }
}
*/

