package DSA.LinkedLists;

class SingularLinkedList {

    Node head;
    int size = 0; // Initialize size to 0

    class Node {
        String data;
        Node next;

        Node(String data) {
            this.data = data;
            this.next = null;
        }
    }

    // Add-First
    public void addFirst(String data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
        size++;
    }

    // Add-Last
    public void addLast(String data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node currentNode = head;
            while (currentNode.next != null) {
                currentNode = currentNode.next;
            }
            currentNode.next = newNode;
        }
        size++;
    }

    // Delete-First
    public void deleteFirst() {
        if (head == null) {
            System.out.println("The Linked List is Empty");
            return;
        }
        head = head.next;
        size--;
    }

    // Delete-Last
    public void deleteLast() {
        if (head == null) {
            System.out.println("The Linked List is Empty");
            return;
        }
        if (head.next == null) { // Only one node
            head = null;
        } else {
            Node secondLast = head;
            while (secondLast.next.next != null) { // Stop at the second last node
                secondLast = secondLast.next;
            }
            secondLast.next = null;
        }
        size--;
    }

    // Print the List
    public void printList() {
        if (head == null) {
            System.out.println("List is Empty");
            return;
        }

        Node currentNode = head;
        while (currentNode != null) {
            System.out.print(currentNode.data + " -> ");
            currentNode = currentNode.next; // Move to the next node
        }
        System.out.println("null");
    }

    public int getSize() {
        return size;
    }

    public static void main(String[] args) {
        SingularLinkedList obj = new SingularLinkedList();
        obj.addFirst("a");
        obj.addFirst("is");
        obj.printList(); // Output: is -> a -> null
        obj.addLast("list");
        obj.printList(); // Output: is -> a -> list -> null
        obj.addFirst("This");
        obj.printList(); // Output: This -> is -> a -> list -> null
        System.out.println("Size: " + obj.getSize()); // Output: Size: 4
        obj.deleteFirst();
        obj.printList(); // Output: is -> a -> list -> null
        obj.deleteLast();
        obj.printList(); // Output: is -> a -> null
        System.out.println("Size: " + obj.getSize()); // Output: Size: 2
    }
}
