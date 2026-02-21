package collections;

public class RemoveNthNodeLL {
    ListOfNodes head;
    public ListOfNodes removeNthNode(ListOfNodes head, int n) {
        if(head == null || head.next == null) {
            return null;
        }
        int size = 0;
        ListOfNodes currNode = head;
        while(currNode != null) {
            currNode = currNode.next;
            size++;
        }

        int indxToSearch = size-n;
        ListOfNodes prevNode = head;
        int i=1;
        while (i < indxToSearch) {
            prevNode = prevNode.next;
            i++;
        }
        prevNode.next = prevNode.next.next;

        return head;
    }
}

class ListOfNodes {
    String data;
    ListOfNodes next;

    ListOfNodes(){}

    ListOfNodes(String data, ListOfNodes next) {
        this.data = data;
        this.next = next;
    }

    ListOfNodes(String data) {
        this.data = data;
        this.next = null;
    }
}