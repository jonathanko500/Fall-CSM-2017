import java.util.Scanner;

//Jonathan Ko
//Lab 5

public class cookie 
{//class start

	public static void main(String[] args)
	{//main start
		//declare variables
		double numbCookies, adjSugar, adjButter, adjFlour;
		double sugar=1.5;
		double butter=3;
		double flour=2.75;
		//read inputs
		Scanner input = new Scanner(System.in);
		System.out.print("How many cookies do you want to make?");
		numbCookies = Double.parseDouble(input.nextLine());
		//calculate adjSugar
		adjSugar=(sugar*numbCookies)/48;
		//calculate adjButter
		adjButter=(butter*numbCookies/48);
		//calculate adjFlour
		adjFlour=(flour*numbCookies)/48;
		System.out.println("Ingredients needed to produce " + (int)numbCookies + " cookies.");
		System.out.println("Sugar: " + adjSugar + " cup(s)");
		System.out.println("Butter: " + adjButter + " cup(s)");
		System.out.println("Flour: " + adjFlour + " cup(s)");
		System.out.println("Programmed by Jonathan Ko");
	}//main end

}//class end

/* test 1
 * How many cookies do you want to make?40
	Ingredients needed to produce 40 cookies.
	Sugar: 1.25 cup(s)
	Butter: 2.5 cup(s)
	Flour: 2.2916666666666665 cup(s)
	Programmed by Jonathan Ko

 * test 2
 * How many cookies do you want to make?20
	Ingredients needed to produce 20 cookies.
	Sugar: 0.625 cup(s)
	Butter: 1.25 cup(s)
	Flour: 1.1458333333333333 cup(s)
	Programmed by Jonathan Ko

 * test 3
 * How many cookies do you want to make?100
	Ingredients needed to produce 100 cookies.
	Sugar: 3.125 cup(s)
	Butter: 6.25 cup(s)
	Flour: 5.729166666666667 cup(s)
	Programmed by Jonathan Ko

 */





