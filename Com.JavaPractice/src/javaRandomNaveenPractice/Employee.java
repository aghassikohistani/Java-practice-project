package javaRandomNaveenPractice;

public class Employee {

	public Object[] getEmpNames() {

		Object[] empData = new Object[] { "Aghassi", 22, "Seattle", "Washingtn", "United States" };

		return empData;
	}

	public static void main(String[] args) {

		// System.out.println(getEmpNames()[1]);
//
		Employee e1 = new Employee();
//
//		for (Object e : e1.getEmpNames()) {
//
//			System.out.println(e);
//		}
		for (int i = 0; i < e1.getEmpNames().length; i++) {
			System.out.println(e1.getEmpNames()[i]);
		}

	}

}
