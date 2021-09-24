
public class Details {
	
	public Details()
	{
		
		
	}
	
	public int getPrice(String type)
	{
		if(type.equals("Ceiling Fly Swatter"))
		{
			return 25;
		}
		else if(type.equals("Portable"))
		{
			return 35;
		}
		else if(type.equals("Table Fly Swatter"))
		{
			return 30;
		}
		
		return 0;
	}


}
