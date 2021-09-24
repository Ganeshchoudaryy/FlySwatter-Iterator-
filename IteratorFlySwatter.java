
public class IteratorFlySwatter implements FlySwatterIterator {
	
String type[];
	
	int no_of_flyswatters;
	public IteratorFlySwatter(String [] type)
	{
		this.type=type;
		
	}
	public boolean hasNext()
	{
		if(no_of_flyswatters<type.length)
		{
			return true;
		}
		return false;
	}
	
	public Object next()
	{
		if(this.hasNext())
		{
			return type[no_of_flyswatters++];
		}
		return null;
	}

}
