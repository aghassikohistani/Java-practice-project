package randomJavaPractice;

public class MethodChaining {

	public static void main(String[] args) {

		MethodChaining m1 = new MethodChaining();
		m1.startDriving();
		// System.out.println(m1);

	}

	public void checkYourMirrors() {
		System.out.println("Mirrors checked");
	}

	public void checkYourSeat() {
		System.out.println("Seat checked");
	}

	public void checkFule() {
		System.out.println("fuel checked");
	}

	public void startDriving() {

		System.out.println("go ahead and start driving");
		checkFule();
		checkYourSeat();
		checkYourMirrors();
	}

}
