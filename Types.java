
public class Types implements FlySwatterTypes {
	
public String type[] = {"Portable" , "Ceiling Fly Swatter" ,"Table Fly Swatter"};
	
	
	public FlySwatterIterator createFlySwatterIterator()
	{
		return new IteratorFlySwatter(type);
	}

}
