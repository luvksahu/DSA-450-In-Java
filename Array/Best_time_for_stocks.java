// It is recommended first to try solving the problem on the url given below
//Problem Url: https://leetcode.com/problems/best-time-to-buy-and-sell-stock/

/* Question: You are given an array prices where prices[i] is the price of a given stock on the ith day.
You want to maximize your profit by choosing a single day to buy one stock and choosing a different day in the future to sell that stock.
Return the maximum profit you can achieve from this transaction. If you cannot achieve any profit, return 0. */

//Solution:

import java.util.*;
import java.io.*;

public class Best_time_for_stocks {
    public static void main(String[] args)throws IOException {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
            arr[i]=sc.nextInt();
        System.out.println(find_max_profit(arr, n));
    }
    static int find_max_profit(int arr[], int n)
    {
        int min_price=Integer.MAX_VALUE,max_profit=0;
        for(int a:arr)
        {
            if(a<min_price)
                min_price=a;
            else if(a-min_price>max_profit)
                max_profit=a-min_price;
        }
        return max_profit;
    }
}
