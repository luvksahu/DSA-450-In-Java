//Problem Url : https://practice.geeksforgeeks.org/problems/common-elements1132/1#

/*Problem statement : Given three arrays sorted in increasing order. Find the elements that are common in all three arrays.Note: can you take care of the duplicates without using any additional Data Structure? */

//Solution :

import java.util.*;
import java.io.*;

class intersection_of_3sorted_array{
    public static void main(String[] args)throws IOException {
        Scanner sc=new Scanner(System.in);
        int n1=sc.nextInt();
        int n2=sc.nextInt();
        int n3=sc.nextInt();
        int A[]=new int[n1];
        for(int i=0;i<n1;i++)
            A[i]=sc.nextInt(); 

        int B[]=new int[n2];            
        for(int i=0;i<n2;i++)
            B[i]=sc.nextInt();

        int C[]=new int[n3];
        for(int i=0;i<n3;i++)
            C[i]=sc.nextInt();

        ArrayList<Integer> res=intersect(A, n1, B, n2, C, n3);
        if( res.size()==0)
            System.out.print(-1);
        else    
            for(Integer a : res)
                System.out.print(a+" ");
        System.out.println("");
        sc.close();
    }
    static ArrayList<Integer> intersect(int A[],int n1, int B[], int n2, int C[], int n3){
        ArrayList<Integer> li=new ArrayList<>();
        int i=0,j=0,k=0,f=0;
        while(i<n1 && j<n2 && k<n3)
        {
            if(A[i]==B[j] && B[j]==C[k] && f!=A[i])
            {
                f=A[i];
                li.add(A[i]);
                i++;j++;k++;
            }
            else if(A[i]<B[j])
                i++;
            else if(B[j]<C[k])
                j++;
            else
                k++;
        }
        return li;
    }
}