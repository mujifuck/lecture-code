public class Dog implements OurComparable {
    private String name;
    private int size;

    public Dog(String n, int s) {
        this.name = n;
        this.size = s;
    }

    public void bark() {
        System.out.print(name + "says : bark");
    }

    @Override
    public int compareTo(Object o) {
        Dog uddaDog = (Dog) o; //  cast the input to a Dog to make our comparison using the size instance variable.
        return this.size - uddaDog.size;
//        if (this.size < uddaDog.size) {
//            return -1;
//        }
//        else if (this.size == uddaDog.size) {
//            return 0;
//        }
//        return 1;
    }

    public static OurComparable max(OurComparable[] items) {
        int maxDex = 0;
        for (int i = 0;i < items.length;i ++) {
            int cmp = items[i].compareTo(items[maxDex]);
            if (cmp > 0) {
                maxDex = i;
            }
        }
        return items[maxDex];
    }

    public static void main(String[] args) {
        Dog[] dogs = {new Dog("Elyse", 3),new Dog("Sture", 9),new Dog("Artemesios", 15)};
        Dog maxDog = (Dog) max(dogs);
        maxDog.bark();
    }
}
