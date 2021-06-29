package methodPractice;

public class JavaFunctions {

	public Object[] empData() {

		Object empInfo[] = new Object[4];

		empInfo[0] = "Jake";
		empInfo[1] = 33;
		empInfo[2] = "Seattle";
		empInfo[3] = "Washington";

		return empInfo;
	}

	public static void main(String[] args) {
		
		JavaFunctions emp1 = new JavaFunctions();
		//System.out.println(emp1.empData()[0]);

		 for (Object e: emp1.empData()) {
			 System.out.println(e);
		 }
	}

}
