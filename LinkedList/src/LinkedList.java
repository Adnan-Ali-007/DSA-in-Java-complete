import java.util.*;
public class LinkedList {
    public class Node{
        String data;
        Node next;
        Node(String data){
   this.data=data;
   this.next=null;
        }
    }
    public void addfrst(String data){
        Node newNodeode=new Node(data);
        if(head==null){
            head=newNode;
            return;
        }
        newnode.next=head;
        head=newnode;
    }
    public static void main(String[] args)
    {
   Node ll=new Node();


    }
}