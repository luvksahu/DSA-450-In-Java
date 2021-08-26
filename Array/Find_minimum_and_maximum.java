//Question: Find the minimum and maximum element in an array
//Link: https://www.geeksforgeeks.org/maximum-and-minimum-in-an-array/

//Solution:

class Find_minimum_and_maximum{
	public static void main (String[] args) 
	{
		int arr[]={9,1,4,7,6,2,3,5,8,-5};
		int min=arr[0];
		int max=arr[0];
		for(int i=1;i<arr.length;i++)
		{
		    if(arr[i]>max)
		        max=arr[i];
	        if(arr[i]<min)
	            min=arr[i];
		}
		System.out.println(min+" "+max);
	}
}