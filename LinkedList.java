
import java.util.*;

class LinkedList 
{   
    
    class Node 
    {
        int data;
        Node next;
        Node(int d)
        {
            data = d;
            next = null;
        }
    }
    
    Node head;
    
    void printNode(int N)	//to print the nth node from last
    {
    	Node temp = head;
        int len = 0;
  
        
        while (temp != null)	//calculate length of linked list 
        {
            temp = temp.next;
            len++;
        }
  
        
        if (len < N)	//check if N > length of linkedlist
        {
            return;
        }
        
        temp = head;
  
        // get the (len-N+1)th node from the beginning (=Nth node from the last)
        for (int i = 1; i < len - N + 1; i++)
            temp = temp.next;
  
        System.out.println(temp.data);
    }
  
    
    public void push(int new_data) //Insert new node at the beginning of list
    {
        Node nnode = new Node(new_data);
        nnode.next = head;
        head = nnode;
    }
  
    public static void main(String[] args)
    {
        LinkedList list = new LinkedList();
        
        list.push(123);
        list.push(873);
        list.push(920);
        list.push(773);
        list.push(87);
        list.push(3290);
        
        
        list.printNode(4);
    }
} 
