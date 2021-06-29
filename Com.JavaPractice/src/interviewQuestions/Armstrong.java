package interviewQuestions;

public class Armstrong {

	public static void main(String[] args) {


//Armstrong---------sum of the cube of each digit

int number=151;
int sum=0;
int old_number=number;  // 151
while(number>0) 
{
int r=number%10;    
sum=sum+r*r*r;  
number=number/10;  
}
if(old_number==sum)
{
System.out.println("is an armstrong number");
}
else
{
System.out.println("not armstrong number");
}

//%-------------remainder
/// ------------divident
	
	}

}
