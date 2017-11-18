//assignment 10 problem 1
//object
public class HealthProfileMods
{//start class
	private String name,Category;
	private int age,HR;
	private int totalHeight;
	private double weight,BMI;
	//set
	public void setName(String aName)
	{
		name=aName;
	}
	public void setAge(int years)
	{
		age=years;
	}
	public void setHeight(int heightFt,int heightIn)
	{
		totalHeight=(heightFt*12)+heightIn;
	}
	public void setWeight (double heavy)
	{
		weight=heavy;
	}
	//get
	public String getName()
	{
		return name;
	}
	public int getAge()
	{
		return age;
	}
	public int getHeight()
	{
		return totalHeight;
	}
	public double getWeight()
	{
		return weight;
	}
	//calculate other stuff
	public double getBMI()
	{
		BMI=(weight*703)/(totalHeight*totalHeight);
		return BMI;
	}
	public String getCategory()
	{
		if(BMI>=30)
		{
			Category="Obese";
			return Category;
		}
		else if(BMI<18.5)
		{
			Category="Underweight";
			return Category;
		}
		else if(BMI>=18.5&&BMI<25)
		{
			Category="Normal";
			return Category;
		}
		else
		{
			Category="OverWeight";
			return Category;
		}
	}
	public int getMaxHR()
	{
		HR=220-age;
		return HR;
	}
}//end class
