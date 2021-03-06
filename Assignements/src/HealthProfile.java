import java.util.Scanner;
//Jomnathan Ko
//assignment 10 problem 1
//main
public class HealthProfile
{//start class
	public static void main(String[] args)
	{//start main
		//declare variable
		String name;
		int age,heightFT,heightIN,valid=0;
		double weight;
		//declare object
		HealthProfileMods stats = new HealthProfileMods();
		Scanner input = new Scanner(System.in);
		System.out.print("Enter name or X to quit: ");
		name=input.nextLine();
		stats.setName(name);
		while(valid==0)
		{//start loop
			//set variables
			System.out.print("Your age: ");
			age=Integer.parseInt(input.nextLine());
			System.out.print("Your weight: ");
			weight=Integer.parseInt(input.nextLine());
			System.out.print("Your height - feet: ");
			heightFT=Integer.parseInt(input.nextLine());
			System.out.print("Your height - inches: ");
			heightIN=Integer.parseInt(input.nextLine());
			stats.setAge(age);
			stats.setHeight(heightFT, heightIN);
			stats.setWeight(weight);
			//print variables
			System.out.println("");
			printProfile(stats.getName(),stats.getBMI(),stats.getCategory(),stats.getMaxHR());
			System.out.println("");
			//loop
			System.out.print("Enter name or X to quit: ");
			name=input.nextLine();
			stats.setName(name);
			if(stats.getName().equalsIgnoreCase("X"))
			{
				valid++;;
			}
		}//end loop
		System.out.println("GooodBye");
		System.out.println("Programmed by Jonathan Ko");
	}//end main
	public static void printProfile(String aName, double body, String section, int HR)
	{
		HealthProfileMods stats = new HealthProfileMods();
		stats.setName(aName);
		System.out.println("Health Profile for "+stats.getName());
		System.out.printf("BMI:  %.1f%n",body);
		System.out.println("BMI Category: "+section);
		System.out.println("Max heart rate: "+HR);
	}
}//end class
/*
test 1(without printProfile)
Enter name or X to quit: asdfasdfas
Your age: 35
Your weight: 200
Your height - feet: 6
Your height - inches: 0

Health Profile for asdfasdfas
BMI:  27.1
BMI Category: OverWeight
Max heart rate: 185

Enter name or X to quit: qqehqethg
Your age: 50
Your weight: 120
Your height - feet: 5
Your height - inches: 2

Health Profile for qqehqethg
BMI:  21.9
BMI Category: Normal
Max heart rate: 170

Enter name or X to quit: X
GooodBye
Programmed by Jonathan Ko

test 2(withoutPrintProfile)
Enter name or X to quit: ljadnad
Your age: 35
Your weight: 250
Your height - feet: 5
Your height - inches: 4

Health Profile for ljadnad
BMI:  42.9
BMI Category: Obese
Max heart rate: 185

Enter name or X to quit: jdfgajlba
Your age: 12
Your weight: 80
Your height - feet: 5
Your height - inches: 2

Health Profile for jdfgajlba
BMI:  14.6
BMI Category: Underweight
Max heart rate: 208

Enter name or X to quit: x
GooodBye
Programmed by Jonathan Ko

test 3(with printProfile)
Enter name or X to quit: asdfasdf
Your age: 35
Your weight: 200
Your height - feet: 6
Your height - inches: 0

Health Profile for asdfasdf
BMI:  27.1
BMI Category: OverWeight
Max heart rate: 185

Enter name or X to quit: sdfasdfs
Your age: 50
Your weight: 120
Your height - feet: 5
Your height - inches: 2

Health Profile for sdfasdfs
BMI:  21.9
BMI Category: Normal
Max heart rate: 170

Enter name or X to quit: x
GooodBye
Programmed by Jonathan Ko


*/