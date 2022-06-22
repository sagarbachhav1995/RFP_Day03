
public class Switch_case {

	public static void main(String[] args) {
		final int FULL_TIME = 1;        
		final int PART_TIME = 2;         
		int WAGE_PER_HR = 20;        
		int empType = (int) (Math.random() * 10) % 3;        
		int workingHrs =0;        
		switch (empType)        
		{            
		case FULL_TIME:                
		System.out.println("Employee is Present Full time");                
		workingHrs = 8; 
		break; 
		case PART_TIME:                
		System.out.println("Employee is Present Part time");                
		workingHrs = 4;
		break; 
		default : System.out.println("Employee is Absent");        
		}       
		 int wage = workingHrs * WAGE_PER_HR;        
		System.out.println("Employee Daily Wage is " + wage);
		
		
	}

}
