import java.util.Scanner;
//Jonathan Ko
//assignement 2
//problem 2
public class BMI 
{//start class

	public static void main(String[] args) 
	{//start main
		//declare variables
		int weight,heightFt,heightIN,changedHeight,heightTotal,numerator,denominator;
		double BMI;
		//read inputs
		Scanner input = new Scanner(System.in);
		System.out.print("Enter weight: ");
		weight = Integer.parseInt(input.nextLine());
		System.out.print("Enter height (feet): ");
		heightFt = Integer.parseInt(input.nextLine());
		System.out.print("Enter height (inches): ");
		heightIN = Integer.parseInt(input.nextLine());
		//converight height to inches
		changedHeight=heightFt*12;
		heightTotal=changedHeight+heightIN;
		//calculate numerator
		numerator = weight*703;
		//Calculate denominator
		denominator =heightTotal*heightTotal;
		//Calculate BMI
		BMI= (double)numerator/ (double)denominator;
		//display
		System.out.println("Your BMI is "+BMI);
		System.out.println("Programmed by Jonathan Ko");
	}//end main
}//end class

/*
 * test 1
 * Enter weight: 180
 * Enter height (feet): 5
 * Enter height (inches): 8
 * Your BMI is 27.3659169550173
 * Programmed by Jonathan Ko
 * test 2
 * Enter weight: 200
 * Enter height (feet): 6
 * Enter height (inches): 0
 * Your BMI is 27.121913580246915
 * Programmed by Jonathan Ko
 * test 3
 * Enter weight: 140
 * Enter height (feet): 5
 * Enter height (inches): 4
 * Your BMI is 24.0283203125
 * Programmed by Jonathan Ko
 */
