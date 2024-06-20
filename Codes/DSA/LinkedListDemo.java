package Codes.DSA;
public class LinkedListDemo{
    public static void main(String args[]){
        LL obj = new LL();
        obj.insert(5);
        obj.insert(12);
        obj.insert(8);
        obj.insert(3);
        obj.insert(1);
        obj.insertAtStart(25);
        obj.insertAt(2,100);
        obj.insertAt(0,77);
        obj.deleteAt(2);
        obj.show();
    }
}

class Node{
    public int data;
    Node next;
}

class LL{
    Node head;
    public void deleteAt(int index)
    {
        if(index==0)
        {
            head = head.next;
        }
        else
        {
            Node n = head;
            for(int i = 0; i<index-1; i++)
            {
                n = n.next;
            }
            Node temp = n.next;
            n.next = temp.next;
            temp = null;
        }
    }
    public void insertAt(int index, int data)
    {
        Node node = new Node();
        node.data = data;
        node.next = null;

        if(index==0)
        {
            insertAtStart(data);
        }
        else
        {
            Node n = head;
            for(int i = 0; i<index-1; i++)
            {
                n = n.next;
            }
            node.next = n.next;
            n.next = node;
        }
    }
    public void insertAtStart(int data)
    {
        Node node = new Node();
        node.data = data;
        node.next = head;
        head = node;
    }
    public void insert(int data)
    {
        Node node = new Node();
        node.data = data;
        node.next = null;
        if(head==null)
        {
            head = node;
        }
        else
        {
            Node n = head;
            while(n.next!=null)
            {
                n = n.next;
            }
            n.next = node;
        }
    }
    public void show()
    {
        Node node = head;
        while(node.next!=null)
        {
            System.out.print(node.data + "->");
            node = node.next;
        }
        System.out.print(node.data);//this is last node
    }
}