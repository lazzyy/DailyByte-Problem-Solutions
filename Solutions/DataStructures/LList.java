package DataStructures;

public class LList {
    public Node head;
    public Node tail;
    private int size;

    public LList() {
        this.size = 0;
    }

    public int getSize() {
        return this.size;
    }

    // ? Node Class
    // * A simple Node with data(value) and nextNode value.

    public class Node {
        public int value;
        public Node next;

        public Node(int val) {
            this.value = val;
            this.next = null;
        }
    }

    public LList(int val) {
        insertAtFirst(val);
    }

    // ? Insertion Operations

    // * Insertion at First
    public void insertAtFirst(int val) {
        Node newNode = new Node(val);
        newNode.next = null;
        head = newNode;

        if (tail == null) {
            tail = head;
        }
        size++;
    }

    // * Insertion at Last
    public void insertAtLast(int val) {
        if (tail == null) {
            insertAtFirst(val);
            return;
        }
        Node newNode = new Node(val);
        tail.next = newNode;
        tail = newNode;
        size++;
    }

    // * Insertion at Certain Position
    public void insertAtPosition(int val, int position) {
        if (position == 0) {
            insertAtFirst(val);
            return;
        }
        if (position == size) {
            insertAtLast(val);
            return;
        }

        if (position > size) {
            System.out.println("Index position to insert should be 0 or equal to size or in between 0 and size.");
            return;
        }
        LList.Node temp = head;
        for (int i = 1; i < position; i++) {
            temp = temp.next;
        }
        LList.Node newNode = new Node(val);
        newNode.next = temp.next;
        temp.next = newNode;
        size++;
    }

    // * Display the Linked List
    public void display() {
        LList.Node temp = head;
        while (temp != null) {
            System.out.print(temp.value + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    // ? Deletion Operations

    // * Delete At First
    public int deleteAtFirst() {
        int value = head.value;
        head = head.next;
        if (head == null) {
            tail = null;
        }
        this.size -= 1;
        return value;
    }

    // * Delete at Last
    public int deleteAtLast() {
        if (size <= 1) {
            return deleteAtFirst();
        }

        LList.Node secondLast = get(size - 2);
        int value = tail.value;
        tail = secondLast;
        tail.next = null;
        this.size -= 1;
        return value;
    }

    // * Delete at Position
    public int deleteAtPosition(int index) {
        if (index == 0) {
            return deleteAtFirst();
        }
        if (index == size - 1) {
            return deleteAtLast();
        }

        if (index > size) {
            System.out.print("Index is greater than size so unable to delete.");
            return -1;
        }
        LList.Node prev = get(index - 1);
        int value = prev.next.value;

        prev.next = prev.next.next;
        this.size -= 1;
        return value;
    }

    // ? To get the Node
    public LList.Node get(int index) {
        LList.Node node = head;
        for (int i = 0; i < index; i++) {
            node = node.next;
        }
        return node;
    }

}