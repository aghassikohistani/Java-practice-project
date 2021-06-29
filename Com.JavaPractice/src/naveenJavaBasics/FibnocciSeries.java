package naveenJavaBasics;

public class FibnocciSeries {

	public static void main(String[] args) {

//fibnocci series the one which is working 

//0 1 1 2 3 5 8 13 21 34 55 89

		int a = 0;
		int b = 1;
		System.out.println(a);
		;
		System.out.println(b);
		int sum;
		for (int i = 1; i <= 10; i++) {
			sum = a + b; // 0+1---1 1+1----2 1+2---3
			System.out.print(" " + sum); // 1 2 3
			a = b; // a---------1 1 2
			b = sum; // b--------1 2 3
		}
	}

}
