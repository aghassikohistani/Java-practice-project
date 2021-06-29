package naveenJavaBasics;

public class NoreferenceAndNullReference {

	// Class -- is a blueprint/template/category for all Objects
	// Object -- is a physical entity of the class
	// is an instance of the class
	// data members --> method, class, variables

	String name;
	int age;
	String city;

	public static void main(String[] args) {

		NoreferenceAndNullReference info = new NoreferenceAndNullReference();

		info.name = "Aghassi";
		info.age = 33;
		info.city = "Seattle";
		NoreferenceAndNullReference b1 = new NoreferenceAndNullReference();
		b1.name = "Dan";
		b1.age = 23;
		b1.city = "Kent";

		NoreferenceAndNullReference b2 = new NoreferenceAndNullReference();
		b2.name = "Porter";
		b2.age = 23;
		b2.city = "Renton";

		System.out.println(b2.name + b2.age + b2.city);
		System.out.println(b1.name + b1.age + b1.city);
		System.out.println(info.name + info.age + info.city);

	}

}
