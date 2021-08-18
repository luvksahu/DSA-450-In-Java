[Problem Link](https://practice.geeksforgeeks.org/problems/cyclically-rotate-an-array-by-one2614/1)

**Java Solution**
```
import java.util.Scanner;
import java.lang.*;
import java.io.*;
class Main
{
    public static void main(String[] args) throws IOException
    {
        //Luv_k_sahu
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
            arr[i]=sc.nextInt();
        reverse(arr,0,n-2);
        reverse(arr,0,n-1);
        for(int a:arr)
            System.out.print(a+" ");
    }
    static void reverse(int arr[],int i,int j)
    {
        int temp=0;
        while(i<=j)
        {
            temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;j--;
        }
    }
}
```