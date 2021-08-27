// Question: Print duplicate character in input string
//Link: https://www.geeksforgeeks.org/print-all-the-duplicates-in-the-input-string/

//Solution:

import java.util.*;
import java.io.*;
public class Print_duplicate_in_string
{
	public static void main(String[] args)throws IOException 
	{
		Scanner sc=new Scanner(System.in);
        //Take input in a string variable
		String s=sc.next();
		if(sc.hasNextLine())
		    s+=sc.nextLine();
        //Declare a HashMap for hashing occurence of characters
		HashMap<Character, Integer> hm=new HashMap<>();
		int n=s.length();
		for(int i=0;i<n;i++)
		{
            // if the map does not has the current character then add it and initialize its occurence as 1
		    if(!hm.containsKey(s.charAt(i)))
		        hm.put(s.charAt(i),1);
            // if the character has already occured then increase its occurence count by 1
	        else 
	            hm.put(s.charAt(i),hm.get(s.charAt(i))+1);
		}
		int val=0;
        //Printing the character against its occurence
		for(Character key : hm.keySet())
		{
		    val=hm.get(key);
		    if(val>1)
		        System.out.println(key+",count= "+val);
		}
	    
	}
}
