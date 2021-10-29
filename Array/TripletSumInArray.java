import java.util.*;
import java.io.*;


public class TripletSumInArray 
{
    public static boolean find3Numbers(int A[], int n, int X) 
    { 
    
        Arrays.sort(A);
        int j,k;
        for(int i=0;i<n;i++)
        {
           j=i+1;
           k=n-1;
           while(j<k)
           {
               int sum=A[i]+A[j]+A[k];
               if(sum==X)
                 return true;
               else if(sum<X)
                 j++;
               else if(sum>X)
                 k--;
               
           }
        }
        return false;
     }
     public static void main (String[] args) throws IOException 
     {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine().trim()); //Inputting the testcases
		while(t-->0){
		    String inputLine[] = br.readLine().trim().split(" ");
		    int n = Integer.parseInt(inputLine[0]);
		    int X = Integer.parseInt(inputLine[1]);
		    int A[] = new int[n];
		    inputLine = br.readLine().trim().split(" ");
		    for(int i=0; i<n; i++)
            {
		        A[i] = Integer.parseInt(inputLine[i]);
		    }
		    boolean ans = find3Numbers(A, n, X);
		    System.out.println(ans?1:0);
		}
	}
}





