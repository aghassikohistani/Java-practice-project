package inheritanceConcept;

import java.util.ArrayList;

public class DiamondProblem {

	public static void main(String[] args) {

		Object[] names = { "Aghassi", 22, "Seattle", "Washington", "Aghassi", "Washington" };

		for (Object e : names) {
			System.out.println(e);

			ArrayList<Object> info = new ArrayList<Object>();

			info.add(names);

		}

	}

}
