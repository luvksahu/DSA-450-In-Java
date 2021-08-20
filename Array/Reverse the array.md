[Problem Link](https://www.geeksforgeeks.org/write-a-program-to-reverse-an-array-or-string/)

**Java code:**
```
class Reverse
{
    public static String reverseWord(String str)
    {
        char arr[]=str.toCharArray();
        int i=0,len=str.length()-1;
        char a;
        while(i<=len)
        {
            a=arr[i];
            arr[i]=arr[len];
            arr[len]=a;
            i++;len--;
        }
        str="";
        for(char c:arr)
            str+=c;
        return str;
    }
    public static void main(String args[])throws IOException
    {
        
    }
}
```
