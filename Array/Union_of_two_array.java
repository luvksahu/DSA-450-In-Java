//Problem URL: https://practice.geeksforgeeks.org/problems/union-of-two-arrays3538/1#

/*Given two arrays a[] and b[] of size n and m respectively. The task is to find union between these two arrays.
Union of the two arrays can be defined as the set containing distinct elements from both the arrays. If there are repetitions, 
then only one occurrence of element should be printed in the union. */

//Solution : 

import java.util.*;
import java.io.*;

public class Union_of_two_array {
    public static void main(String[] args)throws IOException {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr1[]=new int[n];
        for(int i=0;i<n;i++)
            arr1[i]=sc.nextInt();
        int m=sc.nextInt();
        int arr2[]=new int[m];
        for(int i=0;i<m;i++)
            arr2[i]=sc.nextInt();
        System.out.println(count(arr1, n, arr2, m));
        sc.close();
    }
    static int count(int arr1[],int n,int arr2[], int m)
    {
        HashSet<Integer> hm=new HashSet<Integer>();
        int i=0,j=0;
        while(i<n)
        {
            if(!hm.contains(a[i]))
                hm.add(a[i]);
            i++;
        }
        while(j<m)
        {
            if(!hm.contains(b[j]))
                hm.add(b[j]);
            j++;
        }
        return hm.size();
    }
}
