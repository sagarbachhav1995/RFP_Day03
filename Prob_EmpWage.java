
public class Prob_EmpWage {

	public static void main(String[] args) {
		
System.out.println("Welcome to EmpWage_Prog");

// Attendance

int present = 1;
int emp = (int) (Math.random() * 100) % 2;
    if (emp == present)
{
    System.out.println("Employee is Present");

} else
{
    System.out.println("Employee is Absent");
	}
//Employee Wage Daily
    int FULL_TIME = 1;
    int WAGE_PER_HR = 20;
    int empType = (int) (Math.random () * 100) % 2;
    int workingHrs = 0;
    if (empType == FULL_TIME) {
       System.out.println ("Employee is Present");
        workingHrs = 8;
    } else {
       System.out.println ("Employee is Absent");
    }
    int wage = workingHrs * WAGE_PER_HR;
    System.out.println ("Employee Daily Wage is " + wage);
    
    
	}
}
