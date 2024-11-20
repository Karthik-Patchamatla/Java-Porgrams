package DSA.LinkedLists;

class PalindromicLinkedList {

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
        if (head == null) {
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

    // Check if the linked list is a palindrome
    public boolean isPalindromicList() {
        if (head == null || head.next == null) {
            return true;
        }

        // Find the middle of the list
        Node turtle = head;
        Node hare = head;
        while (hare != null && hare.next != null) {
            turtle = turtle.next;
            hare = hare.next.next;
        }

        // Reverse the second half of the list
        Node prev = null;
        Node current = turtle;
        while (current != null) {
            Node next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }

        // Compare the two halves
        Node left = head;
        Node right = prev;
        while (right != null) {
            if (left.data != right.data) {
                return false;
            }
            left = left.next;
            right = right.next;
        }

        return true;
    }

    public static void main(String[] args) {
        PalindromicLinkedList obj = new PalindromicLinkedList();
        obj.addFirst(1);
        obj.addFirst(2);
        obj.addFirst(3);
        obj.addFirst(2);
        obj.addFirst(1);
        obj.printList();
        System.out.println(obj.isPalindromicList());
    }
}