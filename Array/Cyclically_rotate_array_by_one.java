// Question : Cyclically rotate array by one
// Problem Link: https://practice.geeksforgeeks.org/problems/cyclically-rotate-an-array-by-one/0

// How to reverse array: https://github.com/luvksahu/DSA-450-In-Java/blob/cdc7d11749c5937fddb79599c39faae87646abec/Reverse%20the%20array.md

// Solution:

import java.util.Scanner;
import java.io.*;
class Cyclically_rotate_array_by_one
{
    public static void main(String[] args) throws IOException
    {
        //Luv_k_sahu
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
            arr[i]=sc.nextInt();
        //Break Array in two parts and reverse both parts and further reeverse complete array
        //But here as second part has only single element so no need to reverse second part
        reverse(arr,0,n-2);
        reverse(arr,0,n-1);
        for(int a:arr)
            System.out.print(a+" ");
    }
    static void reverse(int arr[],int i,int j)
    {
        int temp=0;
        //Algo for reversing
        while(i<=j)
        {
            temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;j--;
        }
    }
}

