import java.security.SecureRandom;
import java.util.Scanner;

public class mathTutor
{//start class

	public static void main(String[] args)
	{//start main
		//declare variables
		int numb1,numb2,ans,correctAns=0,numerator;
		int correct=0,problem=0,pass=1;
		double score;
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
			case "-"://subtracton
				if(numb1>numb2)
				{
					System.out.print(numb1+" - "+numb2+" = ");
				}
				else
				{
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
			if(again=="y")
			{
				System.out.print("Select an operation ( + - / *) : ");
				operator=input.nextLine();
				numb1=1+rand.nextInt(12);
				numb2=1+rand.nextInt(12);
				problem++;
			}
			else if(again=="n")
			{
				//ends loop
				pass=0;
			}
		}//end of loop
		System.out.println("GAME STATISTICS");
		System.out.println("Number of problems: "+problem);
		System.out.println("Number of correct:  "+correct);
		score=(correct/problem)*100;
		System.out.println("Your score is "+score+"%");
		System.out.println("Programmed by Jonathan Ko");
	}//end main
}//end class