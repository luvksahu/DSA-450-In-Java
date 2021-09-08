//Problem URL : https://practice.geeksforgeeks.org/problems/subarray-with-0-sum-1587115621/1#
/*Problem: Given an array of positive and negative numbers. Find if there is a subarray (of size at-least one) 
  with 0 sum.*/

//Solution :

import java.util.*;
import java.io.*;

public class zero_sum_subarray {
    public static void main(String[] args)throws IOException {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
            arr[i]=sc.nextInt();
        System.out.println(zerosum(arr, n));
        sc.close();
    }
    static String zerosum(int arr[], int n){

        HashSet<Integer> set=new HashSet<>();
        int sum=0;
        for(int a:arr)
        {
            sum+=a;
            if(sum==0 || a==0 || set.contains(sum))
                return "Yes";
                
            set.add(sum);
        }
        return "No";
    }
}
