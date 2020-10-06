
public class SwitchCase {

	public static void main(String[] args) {
		float grade1 = (float)91.14;
		float grade2 = (float)85.01;
		float grade3 = (float)72;
		float grade4 = (float)63;
		float grade5 = (float)81.14;
		
		float average = (grade1 + grade2 + grade3+ grade4 + grade5)/5;	
		System.out.println("Your average grade is " + average);
		
		char grade = 0;
		
		if(average >= 90 && average <= 100){
	         grade = 'A';
	      }
		  else if(average >= 80 && average <= 89.99){
	         grade = 'B';
	      }
	      else if(average >= 70 && average <= 79.99){
	         grade = 'C';
	      }
	      else if(average <= 69.99){
		         grade = 'F';
	      }


		System.out.println("Your final grade is " + grade);
		
		switch(grade) {
		case 'A' :
		System.out.println("Fantastic Job!"); break;
		case 'B' :
		System.out.println("Good"); break;
		case 'C' :
		System.out.println("Please try more next time!"); break;
		case 'F' :
		System.out.println("Unfortunately you failed!"); break;
		default :
		System.out.println("Invalid grade");
		}
		


	}

}
