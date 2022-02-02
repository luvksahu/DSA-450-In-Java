import java.util.*;
import java.io.*;

public class Kadanes_algo {
    public static void main(String[] args) throws IOException 
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
            arr[i]=sc.nextInt();
        System.out.println(maxsum(arr,n));
        sc.close();
    }
    static int maxsum(int arr[],int n)
    {
        int max=arr[0],cmax=0;

        for(int a:arr)
        {
            cmax+=a;
            if(cmax>max)
                max=cmax;
            if(cmax<0)
                cmax=0;
        }
        return max;
    }
}
