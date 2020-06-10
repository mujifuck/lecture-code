public class VengefulSLList<Item> extends SLList<Item> {
    SLList<Item> deletedItems;

    public VengefulSLList() {
        deletedItems = new SLList<Item>();
    }

    @Override
    public Item removeLast() {
        Item x = super.removeLast();
        deletedItems.addLast(x);
        return x;
    }

    /** Print out the deleted item. */
    public void printLostItems() {
        deletedItems.print();
    }
    public static void main(String[] args) {
        VengefulSLList<Integer> vs1 = new VengefulSLList<Integer>();
        vs1.addLast(10);
        vs1.addLast(11);
        vs1.addLast(12);
        vs1.addLast(13);
        vs1.removeLast();
        vs1.removeLast();
        System.out.print("The fallen are: ");
        vs1.printLostItems();
    }
}
