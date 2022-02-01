// Problem URL: https://practice.geeksforgeeks.org/problems/reverse-a-linked-list/1/
/*Problem: Given a linked list of N nodes. The task is to reverse this list. */

import java.util.*;
import java.io.*;

class Node{
    int data;
    Node next;
    
    Node(int x){
        data = x;
        next = null;
    }
    
}
class Reverse_a_LL{
	static void printList(Node node) 
	{ 
		while (node != null) 
		{ 
			System.out.print(node.data + " "); 
			node = node.next; 
		} 
		System.out.println(); 
	}
    public static void main(String args[]) throws IOException { 
        
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t > 0){
        
        	int n = sc.nextInt();
        
            Node head = new Node(sc.nextInt());
            Node tail = head;
        
            for(int i=0; i<n-1; i++)
            {
                tail.next = new Node(sc.nextInt());
                tail = tail.next;
            }
        
            head = reverseList(head);
            printList(head); 
            t--;
        }
        sc.close();
    } 

    static Node reverseList(Node head)
    {
        Node prev=null,temp=head;
        while(prev!=head)
        {
            if(head.next!=null)
                head=head.next;
            temp.next=prev;
            prev=temp;
            temp=head;
        }
        return head;
    }
} 
 


