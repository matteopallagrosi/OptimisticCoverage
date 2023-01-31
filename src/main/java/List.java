public class List {
    public Node head = null;

    public Node insertNode(Node pos, int value) {  //inserimento dopo pos
        Node newNode = new Node();
        newNode.value = value;
        if (head == null) { //inserimento in testa con lista vuota
            head = newNode;
        }
        if (pos!=null) {
            newNode.next = pos.next;
            pos.next = newNode;
        }
        return newNode;
    }

    public Node next(Node pos) {  //ritorna il successivo del nodo pos, non gestisce null in input
        return pos.next;
    }
}




