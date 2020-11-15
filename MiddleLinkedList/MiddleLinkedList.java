package MiddleLinkedList;

public class MiddleLinkedList {
    int val;
    MiddleLinkedList next;
    MiddleLinkedList() {}
    MiddleLinkedList(int val) { this.val = val; }
    MiddleLinkedList(int val, MiddleLinkedList next) { this.val = val; this.next = next; }

    public MiddleLinkedList middleNode(MiddleLinkedList head) {
        MiddleLinkedList slowHead = head;
        MiddleLinkedList fastHead = head;
        
        while(fastHead != null && fastHead.next != null) {
            fastHead = fastHead.next.next;
            slowHead = slowHead.next;
        }
        
        return slowHead;
    }
}
