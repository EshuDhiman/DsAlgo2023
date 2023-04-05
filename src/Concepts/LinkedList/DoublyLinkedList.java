package Concepts.LinkedList;

public class DoublyLinkedList {
    public static void main(String[] args) {
        Doublyll obj = new Doublyll();
        obj.insertFirst(4);
        obj.insertFirst(3);
        obj.insertFirst(1);
        // obj.insertLast(70);
        // obj.insertLast(80);
        // obj.insertLast(90);
        // obj.insertAtIndex(0, 0);
        // obj.insertAtIndex(2, 1);
        // obj.insertAtIndex(3, 1);
        // obj.insertAtIndex(4, 2);
        obj.display();
        obj.displayReverse();
    }

}

class Doublyll {
    class Node {
        int value;
        Node next;
        Node prev;

        public Node(int value) {
            value = value;
            next=null;
            prev=null;
        }

    }

    int size = 0;
    Node head;

    Node tail;

    int deleteNode(int x){
        if(x==1){
            head.next.prev=null;
            head=head.next;
            return head.value;
         }
         Node temp = head;
         for(int i=0;i<x;i++){
             temp=temp.next;
         }
         if(temp.next.next!=null){
         temp.next.next.prev=temp;
         temp.next=temp.next.next;
         return head.value;
         }
         
        else{temp.next=null;
             temp.next.prev=null;
             return head.value;
            }
       
        //  return head.value;

      
    }

    void insertFirst(int vlaue) {
        Node node = new Node(vlaue);
        if (head == null) {
            head = node;
            tail = head;
            size++;
            return;
        }
        node.next = head;
        node.prev = null;
        if (head != null) {
            head.prev = node;

        }
        head = node;
        size++;
    }

    void insertAtIndex(int value, int index) {
        if (head == null) {
            insertFirst(value);
            return;
        }
        
        Node node = new Node(value);
        Node temp = head;
        for (int i = 1; i <index-1 && temp!=null ; i++) {
            temp=temp.next;
        }
        
        
        
        node.prev=temp;
        node.next=temp.next;
        if (node.next!=null) {
            temp.next.prev=node;
            
        }
        size++;

    }

    void insertLast(int value) {
        if (head == null) {
            insertFirst(value);
            return;

        }
        Node node = new Node(value);
        tail.next = node;
        node.prev = tail;
        tail = node;
        size++;

    }

    void display() {
        Node node = head;
        while (node != null) {
            System.out.print(node.value + "->");
            node = node.next;
        }
        System.out.println("end");
    }

    void displayReverse() {
        Node node = tail;
        while (node != null) {
            System.out.print(node.value + "->");
            node = node.prev;
        }
        node = head;
        System.out.println("start");
    }

}
