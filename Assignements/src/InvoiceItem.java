//assignment 12
//object for weaponStore
public class InvoiceItem 
{//start class
	private String describtion;
	private int price,quantity;
	//constructor
	public InvoiceItem()
	{
		describtion="none";
		price=0;
		quantity=0;
	}
	public InvoiceItem(String name,int cost,int num)
	{
		describtion=name;
		price=cost;
		quantity=num;
	}
	//setter
	public void setDescription(String name)
	{
		describtion=name;
	}
	public void setPrice(int cost)
	{
		price=cost;
	}
	public void setQuantity(int num)
	{
		quantity=num;
	}
	//getter
	public String getDescription()
	{
		return describtion;
	}
	public int getQuantity()
	{
		return quantity;
	}
	public int getPrice()
	{
		return price;
	}
	//other
	public int getItemTotal()
	{
		int total=quantity*price;
		return total;
	}
}//end class
