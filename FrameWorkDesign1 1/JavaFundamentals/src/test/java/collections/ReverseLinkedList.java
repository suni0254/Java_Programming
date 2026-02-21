package collections;

import java.util.LinkedList;

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
    public static void main(String[] args) {
        ReverseLinkedList linkedList = new ReverseLinkedList();

        linkedList.addFirst(1);
        linkedList.addLast(2);
        linkedList.addLast(3);
        linkedList.addLast(4);

        linkedList.reverseIteration();

        linkedList.printList();

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

    public void addLast(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            return;
        }
        ReverseLinkedList.Node currNode = head;
        while (currNode.next != null) {
            currNode = currNode.next;
        }
        currNode.next = newNode;
    }
    public void printList() {
        ReverseLinkedList.Node currNode = head;
        if(head == null) {
            System.out.println("List is empty");
        }
        while(currNode!=null) {
            System.out.print(currNode.data + " -> ");
            currNode = currNode.next;
        }
        System.out.println("Null");
    }

    public void reverseIteration() {
        if(head == null || head.next == null) {
            return;
        }
        Node previousNode = head;
        Node currNode = head.next;
        while(currNode != null) {
            Node nextNode = currNode.next;
            currNode.next = previousNode;
            previousNode = currNode;
            currNode = nextNode;
        }
        head.next = null;
        head = previousNode;
    }
}
