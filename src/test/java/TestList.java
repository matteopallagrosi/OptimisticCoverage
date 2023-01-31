import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertSame;

public class TestList {

    @Test
    public void testInsertNode() {
        List list = new List();
        Node firstNode = list.insertNode(null, 1);
        assertSame(list.head, firstNode);  //verifica se inserimento in testa è avvenuto
    }

    @Test
    public void testNext() {
        List list = new List();
        Node firstNode = list.insertNode(null, 1);
        Node secondNode = list.insertNode(firstNode, 2);
        Node result = list.next(firstNode); //se a next passo null ho un bug non individuato dai test
        assertSame(secondNode, result);  //verifica se è stato restituito il successivo del primo nodo
    }

}
