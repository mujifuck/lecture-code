public class DogLauncher {
    public static void main(String[] args) {
        Dog d = new Dog(51);
        Dog d2 = new Dog(100);
        // Dog bigger = Dog.maxDog(d, d2); /* static method*/
        Dog bigger = d.maxDog(d2);
        bigger.makeNoise();
    }
}
