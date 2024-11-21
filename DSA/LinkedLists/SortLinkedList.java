package DSA.LinkedLists;

import java.util.ArrayList;
import java.util.Collections;

public class SortLinkedList {
    Node head;
    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
        
        @Override
        public String toString() {
            return String.valueOf(data);
        }
    }

    public void addFirst(int data) {
        Node newNode = new Node(data);
        if(head == null) {
            head = newNode;
            return;
        }

        newNode.next = head;
        head = newNode;
    }

    public void printList() {
        if(head == null) {
            System.out.println("List is Empty");
        }

        Node currentNode = head;
        while(currentNode != null) {
            System.out.print(currentNode.data + " -> ");
            currentNode = currentNode.next;
        }
        System.out.println("Null");
    }

    public Node sortList() {
        if(head == null) {
            return null;
        }
        ArrayList<Integer> values = new ArrayList<>();
        Node temp = head;
        while(temp!=null) {
            values.add(temp.data);
            temp = temp.next;
        }

        Collections.sort(values);

        temp = head;
        int index = 0;
        while(temp!=null) {
            temp.data = values.get(index++);
            temp = temp.next;
        }
        return head;
    }
    

    public static void main(String[] args) {
        SortLinkedList obj = new SortLinkedList();
        obj.addFirst(5);
        obj.addFirst(14);
        obj.addFirst(17);
        obj.addFirst(2);
        obj.addFirst(11);
        obj.printList();
        obj.sortList();
        obj.printList();
    }
}
