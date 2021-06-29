package functionsPractice;

public class WithMethodFunctions {


  public Object [] empList() {
	  
	  Object [] emp1 = new Object [4];
	  
	  emp1 [0] = "David";
	  emp1 [1] = 34;
	  emp1 [2] = "Federal Way";
	  emp1 [3] = "Washington State";
	  
	  return emp1;
	  
  }

  public static void main(String[] args) {
	
	  WithMethodFunctions empData = new WithMethodFunctions();
	  
	 for (Object e: empData.empList()) {
		 System.out.println(e);
	 }
  
  }


}
