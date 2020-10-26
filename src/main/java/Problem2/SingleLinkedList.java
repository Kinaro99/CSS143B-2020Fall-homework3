package Problem2;

// all functions assume using dummy node
public class SingleLinkedList {
    // do not add member variables
    private ListNode head;
    private int size;

    public SingleLinkedList() {
        head = new ListNode();  // dummy node
    }

    // copy constructor
    public SingleLinkedList(SingleLinkedList list) {
        if(list == null) {
            System.out.println("null");
        }

        ListNode nodeFront = new ListNode();
        ListNode nodeNext = new ListNode();

        if(nodeNext == null) {
            size = list.size;
        } else {
            nodeFront = nodeFront.next;
            nodeNext = nodeNext.next;
        }
    }
//change data from test --stackoverflow get link
    public int removeAll(int valueToRemove) {
        ListNode nodBack = null;
        ListNode nodeNext = null;
        ListNode nodeFront = head;

    /*    int data = 0;

        if(nodeFront.data == valueToRemove) {
            nodeFront = nodeNext.next;
            nodeNext = nodeFront;
            return data;
        } else {
     */       return 0;
        }

    //}
    //https://www.geeksforgeeks.org/reverse-a-linked-list/
    // reverse the linked list nodes iteratively (no recursion)
    public ListNode reverse() {
        ListNode nodeCurrent = head.next;
        ListNode nodBack = null;
        ListNode nodeNext = null;

        if(nodeCurrent == null) {
            return nodeCurrent;
        } else {
            nodeNext = nodeNext.next;
            nodeNext.next = nodBack;
            nodBack = nodeCurrent;
            nodeCurrent = nodeNext;
            return nodeCurrent;
        }

    }

    // do not change any function below

    public SingleLinkedList(int[] data) {
        this();
        if (data == null) {
            return;
        }
        ListNode ptr = head;
        for (int datum : data) {
            ptr.next = new ListNode(datum);
            ptr = ptr.next;
            size++;
        }
    }

    // Appends the specified element to the end of this list
    public void add(int val) {
        size++;
        ListNode ptr = head;
        while (ptr.next != null) {
            ptr = ptr.next;
        }
        ptr.next = new ListNode(val);
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        ListNode ptr = head.next;
        while (ptr != null) {
            builder.append(ptr.val).append(ptr.next == null ? " -> end " : " -> ");
            ptr = ptr.next;
        }
        return builder.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }

        if (!(obj instanceof SingleLinkedList)) {
            return false;
        }

        SingleLinkedList otherList = (SingleLinkedList) obj;

        if (this.size != otherList.size) {
            return false;
        }
        ListNode n1 = head.next;
        ListNode n2 = otherList.head.next;
        while (n1 != null && n2 != null) {
            if (n1.val != n2.val) {
                return false;
            }
            n1 = n1.next;
            n2 = n2.next;
        }
        return (n1 == null && n2 == null);
    }

    public int getSize() {
        return size;
    }
}
