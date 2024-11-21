package DSA.LinkedLists;

public class MaxNodeList {
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

    public Node maxNode() {
        if(head == null) {
            return null;
        }

        Node isMax = head;
        Node temp = head;
        while(temp!=null) {
            if(temp.data > isMax.data) {
                isMax = temp;
            }
            temp = temp.next;
        }
        return isMax;
    }

    public static void main(String[] args) {
        MaxNodeList obj = new MaxNodeList();
        obj.addFirst(5);
        obj.addFirst(4);
        obj.addFirst(3);
        obj.addFirst(2);
        obj.addFirst(1);
        obj.printList();
        System.out.println(obj.maxNode());
    }
}
