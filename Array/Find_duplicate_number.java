/* Given an array of integers nums containing n + 1 integers where each integer is in the range [1, n] inclusive.
There is only one repeated number in nums, return this repeated number.
You must solve the problem without modifying the array nums and uses only constant extra space*/

//Prerequisite : Knowledge of HashMap (you can also try hashing using array)

// It is recommended first to try solving the problem on the url given below

//Problem Url : https://leetcode.com/problems/find-the-duplicate-number/

//Solution :

import java.util.*;
import java.io.*;

public class Find_duplicate_number {
    public static void main(String[] args)throws IOException {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n+1];
        for(int i=0;i<=n;i++)
            arr[i]=sc.nextInt();
        System.out.println(find(arr, n));
        sc.close();
    }
    static int find(int arr[], int n)
    {
        HashSet<Integer> hm=new HashSet<>();
        for(int a:arr)
        {
            if(hm.contains(a))
                return a;
            if(!hm.contains(a))
                hm.add(a);
            
        }
        return 0;
    }
}
