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

        public static Node Head;
        public static Node Tail;
        static int size;

        public void addFirst(int data) {
            // step1 - create new node
            Node newNode = new Node(data);
            if (Head == null) {
                Head = Tail = newNode;
                return;
            }
            // step2 - newNode next =head
            newNode.next = Head.next;
            // step3 - head= newNode
            Head = newNode;

            size++;
        }

        public void AddLast(int data) {
            Node newNode = new Node(data);
            if (Head == null) {
                Head = Tail = newNode;
                return;
            }

            Tail.next = newNode;
            newNode.next = null;
            Tail = newNode;

            size++;
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
            System.err.println();
        }

        public void Add(int index, int data) {
            if (index == 0)
                addFirst(data);

            Node temp = Head;
            for (int i = 0; i < index - 1; i++) {
                temp = temp.next;
            }
            Node newNode = new Node(data);
            newNode.next = temp.next;
            temp.next = newNode;

            size++;
        }

    }
}
