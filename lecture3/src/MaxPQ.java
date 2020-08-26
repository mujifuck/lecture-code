public class MaxPQ<Key extends Comparable<Key>> {

    private Key[] pq;
    private int N = 0;

    /** Create a priority queue of initial capacity max. */
    public MaxPQ(int max) {
        pq = (Key[]) new Comparable[max + 1];
    }

    /** Create a priority queue from the keys in a[]. */
    public MaxPQ(Key[] a) {

    }

    /** Insert a key into the priority queue. */
    public void insert(Key v) {
        pq[++N] = v;
        swim(N);
    }

    /** */
    private void swim(int k) {
        while (k > 1 && less(k/2, k)) {
            exch(k/2, k);
            k = k / 2;
        }
    }

    /** Return the largest key. */
    public Key max() {
        if (pq == null)
            return null;
        return pq[1];
    }

    /** Return and remove the largest key. */
    public Key delMax() {
        Key max = pq[1];
        exch(1, N--);
        pq[N + 1] = null;
        sink(1);
        return max;
    }

    /** */
    private void sink(int k) {
        while (2 * k <= N) {
            int j = 2 * k;
            if (j < N && less(j, j + 1)) j ++;// return the larger key of the node's two children
            if (!less(k, j)) break;
            exch(k, j); //?
            k = j;
        }
    }

    /** Return true if pq[i] < pq[j] otherwise return false. */
    private boolean less(int i, int j) {
        return pq[i].compareTo(pq[j])< 0;
    }

    /** Exchange the values of two nodes. */
    private void exch(int i, int j) {
        Key t = pq[i];
        pq[i] = pq[j];
        pq[j] = t;
    }

    /** Is the priority queue empty? */
    public boolean isEmpty() {
        return N == 0;
    }

    /** Number of keys in the priority queue. */
    public int size() {
        return N;
    }
    public static void main(String[] args) {
        System.out.print(1<<2);
    }
}
