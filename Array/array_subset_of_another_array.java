import java.util.*;
import java.io.*;

class array_subset_of_another_array {
    static String isSubset( long a1[], long a2[], long n, long m) {
        
        HashSet<Long> set=new HashSet<>();
        int n1=a1.length;
        int n2=a2.length;
        for(int i=0;i<n1;i++)
            set.add(a1[i]);
        for(int i=0;i<n2;i++)
            if(!set.contains(a2[i]))
                return "No";
        return "Yes";
    }
	public static void main(String[] args) throws IOException
	{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        while(t-->0)
        {
            StringTokenizer stt = new StringTokenizer(br.readLine());
            
            long n = Long.parseLong(stt.nextToken());
            long m = Long.parseLong(stt.nextToken());
            long a1[] = new long[(int)(n)];
            long a2[] = new long[(int)(m)];
            
            
            String inputLine[] = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                a1[i] = Long.parseLong(inputLine[i]);
            }
            String inputLine1[] = br.readLine().trim().split(" ");
            for (int i = 0; i < m; i++) {
                a2[i] = Long.parseLong(inputLine1[i]);
            }
            System.out.println(isSubset( a1, a2, n, m));
            
        }
	}
}
