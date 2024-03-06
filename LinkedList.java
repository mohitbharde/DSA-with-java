public class LinkedList {
    /**
     * Node
     */
    public class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node Head;
    public static Node Tail;
    public static int size;

    public void addFirst(int data) {
        // step1 - create new node
        Node newNode = new Node(data);
        size++;
        if (Head == null) {
            Head = Tail = newNode;
            return;
        }

        // step2 - newNode next =head
        newNode.next = Head;
        // step3 - head= newNode
        Head = newNode;

        return;
    }

    public void AddLast(int data) {
        Node newNode = new Node(data);
        size++;
        if (Head == null) {
            Head = Tail = newNode;
            return;
        }

        Tail.next = newNode;
        newNode.next = null;
        Tail = newNode;
        return;
    }

    public void print() {
        if (Head == null) {
            System.out.println("LinkedList is empty");
        }
        Node temp = Head;
        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.err.println("null");
    }

    public void Add(int index, int data) {
        if (index == 0) {
            addFirst(data);
            return;
        } else if (index >= size) {
            System.out.println("invalid index");
            return;
        }

        Node temp = Head;
        for (int i = 0; i < index - 1; i++) {
            temp = temp.next;
        }
        Node newNode = new Node(data);
        size++;
        newNode.next = temp.next;
        temp.next = newNode;
    }

    public int RemoveFirst() {
        if (size == 0) {
            System.out.println("The Linked List is already Empty!");
            return Integer.MIN_VALUE;
        } else if (size == 1) {
            int val = Head.data;
            Head = Tail = null;
            size = 0;
            return val;
        }
        int val = Head.data;
        Head = Head.next;
        size--;
        return val;
    }

    public int RemoveLast() {
        if (size == 0) {
            System.out.println("The Linked List is already Empty!");
            return Integer.MIN_VALUE;
        } else if (size == 1) {
            int val = Head.data;
            Head = Tail = null;
            size = 0;
            return val;
        }

        Node prev = Head;
        for (int i = 1; i < size - 1; i++) {
            prev = prev.next;
        }

        int val = prev.next.data;

        prev.next = null;
        Tail = prev;
        size--;
        return val;
    }

    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.addFirst(30);
        ll.addFirst(20);
        ll.addFirst(10);
        ll.AddLast(40);
        ll.AddLast(50);
        ll.Add(5, 80);
        ll.print();
        System.out.println(size);
        System.out.println("remove last element " + ll.RemoveLast() + "  size = " + size);
        System.out.println("remove last element " + ll.RemoveFirst() + "  size = " + size);
        ll.print();
    }
}
