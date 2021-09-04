/* Given an array Arr[] that contains N integers (may be positive, negative or zero). Find the product of the maximum product subarray. */
//Problem Url : https://practice.geeksforgeeks.org/problems/maximum-product-subarray3604/1

//Solution :

import java.util.*;
import java.io.*;

public class maximum_product_subarray {
    public static void main(String[] args)throws IOException {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
            arr[i]=sc.nextInt();
        System.out.println(prod(arr, n));
        sc.close();
    }
    static long prod(int arr[], int n)
    {
        long maxprod=arr[0];
        long minval=arr[0],maxval=arr[0],temp=0;
        for(int i=1;i<n;i++)
        {
            temp=maxval;
            maxval=Math.max(arr[i], Math.max(maxval*arr[i], minval*arr[i]));
            minval=Math.min(arr[i], Math.min(temp*arr[i], minval*arr[i]));

            maxprod=Math.max(maxval, maxprod);
            /* Alternate way :
            
            if(arr[i]<0)
            {
                //This is the logic for swapping b/w minval and maxval
                minval=maxval^minval;
                maxval=maxval^minval;
                minval=maxval^minval;
            }
            minval=Math.min(arr[i],minval*arr[i]);
            maxval=Math.max(arr[i],maxval*arr[i]);

            maxprod=Math.max(maxval,maxprod);
             */
        }
        return maxprod;
    }
}
