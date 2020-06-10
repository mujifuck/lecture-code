/** Array based list.
 * @author  guialong
 */

public class AList {
    private int[] items;
    private int size;

    /** Create an empty List. */
    public AList() {
        items = new int[100];
        size = 0;
    }

    private void resize(int capacity) {
         int[] a = new int[capacity];
         System.arraycopy(items, 0, a, 0, capacity - 1);
         items = a;
    }

    /** Inserts an item at the back of the list. */
    public void addLast(int x) {
        if (size == items.length) {
           // int[] a = new int[size + 1];
           // System.arraycopy(items, 0, a, 0, size);
           // items = a;
            resize(size + 1);
        }
        items[size] = x;
        size += 1;
    }

    /** Return the item from the back of the list. */
    public int getLast() {
        return items[size - 1];
    }

    /** Get the ith item in the list. */
    public int get(int i) {
        return items[i];
    }

    /** Return the number of items in the list. */
    public int size() {
        return size;
    }

    /** Delete item from the back of the list.
     * returns deleted item.            */
    public int removeLast() {
        int returnItem = items[size - 1];
        items[size - 1] = 0;
        size -= 1;
        return returnItem;
    }

    public static int[] insert(int[] arr, int item, int position) {
        int result[] = new int[arr.length + 1];
        position = Math.min(arr.length, position);
        for (int i = 0;i < position;i ++) {
            result[i] = arr[i];
        }
        result[position] = item;
        for (int i = position;i < arr.length;i ++) {
            result[i + 1] = arr[i];
        }
        return result;
    }

    /** Reverse the array using iteration. */
    public static void reverse(int[] arr) {
        for (int i = 0;i < arr.length / 2;i ++) {
            int temp = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = temp;
        }
    }

    /** replicate the item in the list with no-destructive method.
     * input: [3, 2, 1]
     * output: [3, 3, 3, 2, 2, 1]
     * */
    public static int[] replicate(int[] arr) {
        int total = 0;
        for (int item:arr) {
            total += item;
        }
        int count = 0;
        int[] result = new int[total];
        for (int i = 0;i < arr.length;i ++) {
            for (int j = 0;j < arr[i];j ++) {
                result[count] = arr[i];
                count ++;
            }
        }
        return result;
    }
}
