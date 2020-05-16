public  class SLList {
    private static class IntNode {
        public int item;
        public IntNode next;
        public IntNode(int i, IntNode n) {
            item = i;
            next = n;
        }
    }
    private IntNode sentinel;
    private int size;
    /** Create a empty list. */
    public SLList() {
        sentinel = new IntNode(63,null);
        size = 0;
    }

    public SLList(int x) {
        sentinel = new IntNode(63,null);
        sentinel.next = new IntNode(x,null);
        size = 1;
    }

    /** add an item at the begin of the list. */
    public void addFirst(int x) {
        sentinel.next = new IntNode(x,sentinel.next);
        size += 1;
    }

    /** Return the sentinel item of the list. */
    public int getFirst() {
        return sentinel.next.item;
    }

    public  void addLast(int x) {
        IntNode p = sentinel;
        size += 1;
//        if (p == null) {
//            p = new IntNode(x, null);
//            return;
//        }
        while (p.next != null) {
            p = p.next;
        }
        p.next = new IntNode(x, null);
    }

//    private static int size(IntNode p) {
//        if (p.next == null) {
//            return 1;
//        }
//        return 1 + size(p.next);
//    }

    public int size() {
        return size;
    }
//    public int size() {
//        IntNode p = sentinel;
//        int totalSize = 0;
//        while (p != null) {
//            p = p.next;
//            totalSize += 1;
//        }
//        return totalSize;
//    }
    public static void main(String[] args) {
        SLList L = new SLList();
        L.addLast(20);
        System.out.println(L.size());
        System.out.println(L.getFirst());
    }
}
