
public class StockMod
{//start class
	private String compName;
	private int numShares;
	private double purchPrice,currPrice;
	//constructor
	public StockMod()
	{
		compName="none";
		numShares=0;
		purchPrice=0;
		currPrice=0;
	}
	public StockMod(String name,int shares,double buy,double now)
	{
		compName=name;
		numShares=shares;
		purchPrice=buy;
		currPrice=now;
	}
	//setters
	public void setName(String name)
	{
		compName=name;
	}
	public void setShares(int shares)
	{
		numShares=shares;
	}
	public void setPurch(double buy)
	{
		purchPrice=buy;
	}
	public void setCurr(double now)
	{
		currPrice=now;
	}
	//getter
	public String getName()
	{
		return compName;
	}
	public int getShares()
	{
		return numShares;
	}
	public double getPurch()
	{
		return purchPrice;
	}
	public double getCurr()
	{
		return currPrice;
	}
	//others
	public double getValue()
	{
		double value;
		value=numShares*(currPrice-purchPrice);
		return value;
	}
	public void ToString()
	{
		System.out.println(numShares+" shares of "+compName);
	}
}//end class
