import java.security.SecureRandom;
import java.util.Scanner;
//Jonathan Ko
//assignment 7 problem 1
public class mathTutor
{//start class
	public static void main(String[] args)
	{//start main
		//declare variables
		int numb1,numb2,ans,correctAns=0,numerator;
		int pass=1;
		double correct=0,problem=0,score;
		String operator,again;
		//read variables
		Scanner input= new Scanner(System.in);
		//makes num random
		SecureRandom rand = new SecureRandom();
		numb1=1+rand.nextInt(12);
		numb2=1+rand.nextInt(12);
		System.out.println("Welcome to the Math Tutor!");
		System.out.print("Select an operation ( + - / *) : ");
		operator=input.nextLine();
		while(pass==1)
		{//start loop
			//math for certain operator
			switch(operator)
			{
			case "+"://addition
				correctAns=numb1+numb2;
				System.out.print(numb1+" + "+numb2+" = ");
				break;
			case "*"://multiply
				correctAns=numb1*numb2;
				System.out.print(numb1+" * "+numb2+" = ");
				break;
			case "-"://subtraction
				
				if(numb1>numb2)
				{
					correctAns=numb1-numb2;
					System.out.print(numb1+" - "+numb2+" = ");
				}
				else
				{
					correctAns=numb2-numb1;
					System.out.print(numb2+" - "+numb1+" = ");
				}
				break;
			case "/"://divide
				numerator=numb1*numb2;
				correctAns=numerator/numb2;
				System.out.print(numerator+" / "+numb2+" = ");
				break;
			}
			ans=Integer.parseInt(input.nextLine());
			//if input answer is correct
			if(correctAns==ans)
			{
				System.out.println("That's right");
				correct++;
			}
			else
			{
				System.out.println("The answer is "+correctAns);
			}
			System.out.println("");
			//ask again
			System.out.print("Another problem? ");
			again=input.nextLine();
			again=again.toLowerCase();
			problem++;
			switch(again)
			{
			case "y":
				System.out.print("Select an operation ( + - / *) : ");
				operator=input.nextLine();
				numb1=1+rand.nextInt(12);
				numb2=1+rand.nextInt(12);
				break;
			case "n":
				pass=0;
				break;
			}
		}//end of loop
		System.out.println("GAME STATISTICS");
		System.out.println("Number of problems: "+(int)problem);
		System.out.println("Number of correct:  "+(int)correct);
		score=(correct/problem)*100;
		System.out.printf("Your score is %.2f",score);
		System.out.println("%");
		System.out.println("Programmed by Jonathan Ko");
	}//end main
}//end class
/*
Welcome to the Math Tutor!
Select an operation ( + - / *) : +
3 + 2 = 5
That's right

Another problem? y
Select an operation ( + - / *) : -
8 - 2 = 6
That's right

Another problem? y
Select an operation ( + - / *) : *
10 * 3 = 30
That's right

Another problem? y
Select an operation ( + - / *) : /
90 / 10 = 9
That's right

Another problem? y
Select an operation ( + - / *) : -
9 - 4 = 1
The answer is 5

Another problem? y
Select an operation ( + - / *) : -
7 - 3 = 4
That's right

Another problem? n
GAME STATISTICS
Number of problems: 6
Number of correct:  5
Your score is 83.33%
Programmed by Jonathan Ko
*/