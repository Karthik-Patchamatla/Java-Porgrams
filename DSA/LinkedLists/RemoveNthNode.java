package DSA.LinkedLists;

// Remove Nth Node from the end
public class RemoveNthNode {
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
        } else {
            newNode.next = head;
            head = newNode;
        }
    }

    public void printList() {
        if (head == null) {
            System.out.println("List is Empty");
            return;
        }

        Node currentNode = head;
        while (currentNode != null) {
            System.out.print(currentNode.data + " -> ");
            currentNode = currentNode.next;
        }
        System.out.println("null");
    }

    // Remove the nth Node from the end of the list
    public void removeNthNode(int n) {
        if(head == null) {
            return;
        }

        int size = 0;
        Node temp = head;
        while(temp != null) {
            size++;
            temp = temp.next;
        }

        int targetIndex = size-n;
        Node prevNode = head;
        int i = 1;
        while(i < targetIndex) {
            prevNode = prevNode.next;
            i++;
        }

        prevNode.next = prevNode.next.next;
    }

    public static void main(String[] args) {
        RemoveNthNode obj = new RemoveNthNode();
        obj.addFirst(5);
        obj.addFirst(4);
        obj.addFirst(3);
        obj.addFirst(2);
        obj.addFirst(1);
        obj.printList();
        obj.removeNthNode(3);
        obj.printList();
    }  
}
