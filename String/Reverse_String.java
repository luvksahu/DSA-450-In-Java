import java.util.*;
import java.io.*;

public class Reverse_String {
    public static void main(String[] args)throws IOException {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        char arr[]=s.toCharArray(); // H e l l o
        reverse(arr);
        for(char c:arr)
            System.out.print(c);
    }
    static void reverse(char arr[])
    {
        int i=0,j=arr.length-1;
        char temp;
        while(i<=j)
        {
            temp=arr[i];
            arr[i]=arr[j];
            arr[j]=arr[i];
            i++;j--;
        }
    }
}
