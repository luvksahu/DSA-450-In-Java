//Question: Count pair with given sum
//Link: https://practice.geeksforgeeks.org/problems/count-pairs-with-given-sum5022/1

import java.util.*;
//import java.lang.*;
import java.io.*;

class Count_pair_with_given_sum 
{
    public static void main(String args[])throws IOException
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
            arr[i]=sc.nextInt();
        System.out.println(solution(arr,n,k));
        sc.close();
    }
    static int solution(int arr[],int n,int k)
    {
        HashMap<Integer, Integer> hm=new HashMap<>();
        for(int i=0;i<n;i++)
        {
            if(!hm.containsKey(arr[i]))
                hm.put(arr[i],0);
            hm.put(arr[i],hm.get(arr[i])+1);
        }
        int count=0;
        for(int i=0;i<n;i++)
        {
            if(hm.get(k-arr[i])!=null)           
                count+=hm.get(k-arr[i]);
            if(k-arr[i]==arr[i])
                count--;
        }
        return count/2;
    }
}