public class Dog {
	public int weighInPounds;
	public Dog(int w) {
		weighInPounds = w;
	}
	public void makeNoise() {
		if (weighInPounds < 10) {
			System.out.println("yipyipyip!");
		} else if (weighInPounds < 30) {
			System.out.println("bark. bark.");
		} else {
			System.out.println("woof!");
		}
	}

	public static Dog maxDog(Dog d1, Dog d2) {
		if (d1.weighInPounds > d2.weighInPounds) {
			return d1;
		}
		return d2;
	}
	public Dog maxDog(Dog d2) {
		if (this.weighInPounds > d2.weighInPounds) {
			return this;
		}
		return d2;
	}
}
