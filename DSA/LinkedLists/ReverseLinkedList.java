package DSA.LinkedLists;

public class ReverseLinkedList {
    Node head;

    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // add-First
    public void addFirst(int data) {
        Node newNode = new Node(data);
        if(head == null) {
            head = newNode;
            return;
        }

        newNode.next = head;
        head = newNode;
    }

    // add-Last
    public void addLast(int data) {
        Node newNode = new Node(data);
        if(head == null) {
            head = newNode;
            return;
        }

        Node currentNode = head;
        while(currentNode.next != null) {
            currentNode = currentNode.next;
        }

        currentNode.next = newNode;
    }

    // delete-First
    public void deleteFirst() {
        if(head == null) {
            System.out.println("List is Empty");
        }

        head = head.next;
    }

    // delete-Last
    public void deleteLast() {
        if(head == null) {
            System.out.println("List is Empty");
        }

        if(head.next == null) {
            head = null;
        }

        Node currentNode = head;
        while(currentNode.next.next != null) {
            currentNode = currentNode.next;
        }

        currentNode.next = null;
    }

    // print-Last
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

    // Reverse Linked List using Iterative Method
    public void reverseList() {
        if(head == null || head.next == null) {
            return;
        }
        
        Node prevNode = head;
        Node currentNode = head.next;
        while(currentNode != null) {
            Node nextNode = currentNode.next;
            currentNode.next = prevNode;
            prevNode = currentNode;
            currentNode = nextNode;
        }

        head.next = null;
        head = prevNode;
    }


    public static void main(String[] args) {
        ReverseLinkedList obj = new ReverseLinkedList();
        obj.addFirst(3);
        obj.addFirst(2);
        obj.addLast(4);
        obj.addFirst(1);
        obj.printList();
        obj.reverseList();
        obj.printList();
    }
}
