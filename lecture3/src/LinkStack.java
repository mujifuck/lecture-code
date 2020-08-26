public class LinkStack {
    private class Node {
        private String item;
        private Node next;

        public Node(String i, Node n) {
            this.item = i;
            this.next = n;
        }

    }

    private Node sentinel = new Node("a", null);
    private int count;

    public LinkStack(String item) {
        Node p  = new Node(item, null);
        sentinel.next = p;
        count = 1;
    }

    public int size() {
        return count - 1;
    }

    public boolean push(String item) {
        Node x = new Node(item, null);
        x.next = sentinel.next;
        sentinel.next = x;
        count ++;
    }

    public String pop() {
        String temp = sentinel.next.item;
        sentinel.next = sentinel.next.next;
        return temp;

    }

    public boolean isEmpty() {
        if (count == 0) return true;
        else return false;
    }
}
