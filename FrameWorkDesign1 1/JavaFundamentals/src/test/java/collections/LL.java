package collections;
import java.util.LinkedList;

public class LL {
    Node head;

    private int size;

    LL() {
        size = 0;
    }


    class Node {
        String data;
        Node next;

        Node(String data) {
            this.data = data;
            this.next = null;
        }
    }

    public void addFirst(String data) {
        Node newNode = new Node(data);

        size++;
        if (head == null) {
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    public void addLast(String data) {
        Node newNode = new Node(data);

        size++;
        if (head == null) {
            head = newNode;
            return;
        }
        Node currNode = head;
        while (currNode.next != null) {
            currNode = currNode.next;
        }
        currNode.next = newNode;
    }

    public void printList() {
        Node currNode = head;
        if(head == null) {
            System.out.println("List is empty");
        }
        while(currNode!=null) {
            System.out.print(currNode.data + " -> ");
            currNode = currNode.next;
        }
        System.out.println("Null");
    }

    public void removeFirst() {

        if(head == null) {
            System.out.println("List is empty");
            return;
        }
        size--;
        head = head.next;
    }

    public void removeLast() {
        if(head == null) {
            System.out.println("List is empty");
            return;
        }

        size--;
        if(head.next == null) {
            head = null;
            return;
        }
        Node secondLast = head;
        Node last = head.next;

        while(last.next!=null) {
            secondLast = last;
            last = last.next;
        }
        secondLast.next = null;
    }

    public int getSize() {
        return size;
    }
    public static void main(String[] args) {
        LL list = new LL();
        list.addFirst("is");
        list.addFirst("This");

        list.addLast("a");
        list.addLast("List");

        list.printList();

        list.removeFirst();
        list.removeLast();

        list.printList();

        System.out.println(list.getSize());
    }
}

class LLcollections {
    public static void main(String args[]) {
        LinkedList<String> list = new LinkedList<String>();

        list.addFirst("My");
        list.addLast("name");
        list.add("is");
        list.add("Khan");

//        for(String i : list) {
//            System.out.print(i + " -> ");
//        }
//        System.out.println("Null");
        list.remove(2);
        System.out.println(list);
    }
}
