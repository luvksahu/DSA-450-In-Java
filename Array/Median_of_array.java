//package Array;
import java.util.*;
import java.lang.*;
import java.io.*;
public class Median_of_array 
{
    public static void main(String[] args)throws IOException 
	{
		Scanner sc=new Scanner(System.in);
		//Array size input
		int n=sc.nextInt();
		int arr[]=new int[n];
		//Array input
		for(int i=0;i<n;i++)
		    arr[i]=sc.nextInt();
	    System.out.println(median(arr,n));
	}
	static int median(int arr[],int n)
	{
        int Med=0;
        Arrays.sort(arr);
        if(n%2==0)
        {
            /*
            formula of median if n is even= [(n/2)+(n/2)+1]/2
            Array index start from 0
            so [(n/2)-1+(n/2)+1-1]/2=[(n/2)+(n/2)-1]/2
            */
            Med=(arr[n/2]+arr[(n/2)-1])/2;
        }
        else
        {
            /*
            formula of median if n is odd= (n+1)/2
            Array index start from 0
            so ((n+1)/2)-1
            */
            Med=arr[((n+1)/2)-1];
        }
        return Med;
	}
}
