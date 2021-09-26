import java.io.IOException;
import java.util.HashSet;
import java.util.Scanner;

class Sub_array_with_zero_sum{
    public static void main(String[] args)throws IOException {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
            arr[i]=sc.nextInt();
        System.out.println(findsum(arr, n)==true ? "YES" :"NO");
        sc.close();
    }
    static boolean findsum(int arr[],int n)
    {
        HashSet<Integer> set =new HashSet<>();
        int sum=0;
        for(int i=0;i<n;i++){
            sum+=arr[i];
            if(arr[i]==0 || sum==0 || set.contains(sum))
                return true;
            set.add(sum);
        }
        return false;
    }
}