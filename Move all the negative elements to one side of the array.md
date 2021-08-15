[Problem Link](https://www.geeksforgeeks.org/move-negative-numbers-beginning-positive-end-constant-extra-space/)

**Java sol:**
```
import java.util.Scanner;
import java.io.*;
class gfg
{
    public static void main(String[] args) throws IOException
    {//Luv_k_sahu
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
            arr[i]=sc.nextInt();
        int l=0,r=n-1;
        int temp;
        while(l<=r)
        {
            if(arr[l]<0 &&arr[r]<0)
                l++;
            else if(arr[r]<0 && arr[l]>0)
            {
                temp=arr[r];
                arr[r]=arr[l];
                arr[l]=temp;
            }
            else if(arr[l]>0 && arr[r]>0)
                r--;
            else
            {
                l++;
                r--;
            }
        }
        for(int a:arr)
            System.out.print(a+" ");
    }
}
```