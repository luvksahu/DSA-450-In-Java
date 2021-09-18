import java.io.IOException;
import java.util.*;

public class Median_of_2sorted_array {
    public static void main(String[] args)throws IOException {
        Scanner sc=new Scanner(System.in);
        int m=sc.nextInt();
        int[] arr1=new int[m];
        for(int i=0;i<m;i++)
            arr1[i]=sc.nextInt();
        int n=sc.nextInt();
        int[] arr2=new int[n];
        for(int i=0;i<n;i++)
            arr2[i]=sc.nextInt();

        System.out.println(findMedianSortedArrays(arr1, m, arr2, n));
        sc.close();
    }
    static double findMedianSortedArrays(int[] arr1, int m, int[] arr2, int n) {
        merge(arr1, m, arr2, n);
        double median=0.00000;

        if((m+n)%2!=0){
            int mid= (m+n)/2;
            if(mid-m>=0)
                median= arr2[mid-m];
            else
                median= arr1[mid];
        }
        else{
            int mid1=(m+n)/2;
            int mid2=(m+n+1)/2;
            if(mid2-m<0)
                median= (((arr1[mid1]+arr1[mid2])*1.0)/2.0);
            else if(mid1-m>=0)
                median= (((arr2[mid1]+arr2[mid2])*1.0)/2.0);
            else
            median= (((arr1[mid1]+arr2[mid2])*1.0)/2.0);
        }
        return median;
    }
    static void merge(int[] arr1, int m, int[] arr2, int n){
        int i=m-1,j=0,temp=0;

        while(i>=0 && j<n && arr1[i]>arr2[j]){
            temp=arr1[i];
            arr1[i]=arr2[j];
            arr2[j]=temp;
            i--;j++;
        }
        Arrays.sort(arr1);
        Arrays.sort(arr2);
    }
}
