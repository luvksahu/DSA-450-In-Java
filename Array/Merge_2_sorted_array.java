//Question: Merge two sorted array without using extra space
//Problem Link: https://practice.geeksforgeeks.org/problems/merge-two-sorted-arrays5135/1

//Solution:

import java.util.*;
import java.io.*;

public class Merge_2_sorted_array 
{
    public static void main(String[] args) throws IOException
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr1[]=new int[n];
        for(int i=0;i<n;i++)
            arr1[i]=sc.nextInt();
        int m=sc.nextInt();
        int arr2[]=new int[m];
        for(int i=0;i<n;i++)
            arr2[i]=sc.nextInt();
        merge(arr1, n, arr2, m);
        for(int a:arr1)
            System.out.print(a+" ");
        for(int a:arr2)
            System.out.print(a+" ");
        sc.close();
    }
    static void merge(int arr1[],int n,int arr2[],int m)
    {
        int i=n-1,j=0;
        int temp=0;
        while(i>=0 && j<m)
        {
            if(arr1[i]>arr2[j])
            {
                temp=arr1[i];
                arr1[i]=arr2[j];
                arr2[j]=temp;
                i--;j++;
            }
        }
        Arrays.sort(arr1);
        Arrays.sort(arr2);
    }
}
