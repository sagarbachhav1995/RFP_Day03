import static java.lang.Math.sqrt;
public class Line_Comp_Prob02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int x1 = 10;
        int y1 = 12;
        int x2 = 20;
        int y2 = 16;
        double Length_1 = sqrt((x2 - x1)^2 +(y2-y1)^2);
        System.out.println("Length_1 is :" +Length_1);
        int x3 = 15;
        int y3 = 8;
        int x4 = 20;
        int y4 = 16;
        double Length_2 = sqrt((x4 - x3)^2 +(y4-y3)^2);
        System.out.println("Length_2 is :" +Length_2);
        System.out.println(Length_1 == Length_2); //

        if(Length_1 == Length_2){
            System.out.println("Both lines are equal");
        }else{
            System.out.println("Both lines are not equal");
        }
    
	}

}
