public class ArrayStack {
    private String[] items; // array
    private int count; // the number of elements in stack
    private int n; // the size of stack

    /**
     *
     * */
    private ArrayStack(int n) {
        this.items = new String[n];
        this.count = 0;
        this.n = n;
    }

    /**
     *  push the item
     * */
    public boolean push(String item) {
        if (count == n) return false;
        items[count] = item;
        count ++;
        return true;
    }

    /**
     * delete and return the top element
     * */
    public String pop() {
        if (count == 0) return null;
        String temp = items[count - 1];
        count --;
        return temp;
    }

    /**
     *  Return whether the stack is empty.
     * */
    public boolean isEmpty() {
        if (count == 0) return true;
        else return false;
    }

    /**
     *  Return whether the stack is full.
     * */
    public boolean isFull() {
        if (count == n) return true;
        else return false;
    }

}
