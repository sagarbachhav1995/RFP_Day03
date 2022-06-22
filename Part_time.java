
public class Part_time {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Part time
	    
	    int PART_TIME = 1;         
	    int FULL_TIME = 2;         
	    int WAGE_PER_HR = 20;        
	    int empType = (int) (Math.random() * 100) % 3;        
	    int workingHrs = 0;        
	    if (empType == FULL_TIME)        
	    {            
	    System.out.println("Employee Present for Full time");            
	    workingHrs = 8;        
	    } 
	    else 
	    if (empType == PART_TIME)        
	    {            
	    System.out.println("Employee Present for Part time");            
	    workingHrs = 4;        
	    } 
	    else        
	    {            
	    System.out.println("Employee is Absent");      }        
	    int wage = workingHrs * WAGE_PER_HR;        
	    System.out.println("Employee Daily Wage is " + wage);
	    
	    
	}

}
