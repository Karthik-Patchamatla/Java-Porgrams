package DSA.LinkedLists;

public class ReverseHalfLinkedList {
    Node head;
    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
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

    public void reverseHalfLinkedList() {
        if (head == null || head.next == null) {
            return;
        }
    
        // Step 1: Find the middle of the linked list (Tortoise and Hare Algorithm)
        Node hare = head;
        Node turtle = head;
        Node prevTurtle = null; // To track the node before the turtle
    
        while (hare != null && hare.next != null) {
            hare = hare.next.next;
            prevTurtle = turtle;
            turtle = turtle.next;
        }
    
        // Step 2: Reverse the second half of the list starting from `turtle`
        Node prev = null;
        Node currentNode = turtle;
    
        while (currentNode != null) {
            Node nextNode = currentNode.next;
            currentNode.next = prev;
            prev = currentNode;
            currentNode = nextNode;
        }
    
        // Step 3: Connect the first half to the reversed second half
        prevTurtle.next = prev;
    }
    

    public static void main(String[] args) {
        ReverseHalfLinkedList obj = new ReverseHalfLinkedList();
        obj.addFirst(6);
        obj.addFirst(5);
        obj.addFirst(4);
        obj.addFirst(3);
        obj.addFirst(2);
        obj.addFirst(1);
        obj.printList();
        obj.reverseHalfLinkedList();
        obj.printList();
    }
}
