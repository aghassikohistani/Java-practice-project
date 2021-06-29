package naveenJavaBasics;

import java.util.ArrayList;

public class StreramConcept {

	public static void main(String[] args) {

		ArrayList<String> carModels = new ArrayList<String>();

		carModels.add("X5");
		carModels.add("Corolla");
		carModels.add("Sieanna");

		// for (int i = 0; i <= carModels.size(); i++) {
		// System.out.println(carModels);
		// for(String e: carModels) {
		// System.out.println(e);
		// carModels.stream().forEach(e -> System.out.println(e));

		carModels.stream().filter(e -> e.equals("X5")).forEach(e -> System.out.println(e));
	}

}
