// Problem URL : https://practice.geeksforgeeks.org/problems/count-element-occurences/1#

/* Problem Statement : Given an array arr[] of size N and an element k. The task is to find all elements in array that appear more than n/k times.
 */

//Solution : 

import java.util.*;
import java.io.IOException;

class Count_more_than_n_by_k_occ{
    public static void main(String[] args)throws IOException {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
            arr[i]=sc.nextInt();
        int k=sc.nextInt();

        System.out.println(countOccurence(arr, n, k));
    }
    static int countOccurence(int[] arr, int n, int k) 
    {
        HashMap<Integer, Integer> hm=new HashMap<>();
        HashSet<Integer> set=new HashSet<>();
        float x= n/k;
        for(int i=0;i<n;i++)
        {
            if(!hm.containsKey(arr[i]))
                hm.put(arr[i], 1);
            else
                hm.put(arr[i], hm.get(arr[i])+1);
            if(hm.get(arr[i])>x)
                set.add(arr[i]);
        }
        return set.size();
    }
}