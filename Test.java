
public class Test {
	
	public static void main(String[] args) {
	      Types type = new Types();
	      Details detail = new Details();

	      for(FlySwatterIterator flyiter = type.createFlySwatterIterator(); flyiter.hasNext();){
	         String types = (String)flyiter.next();
	         System.out.println("Fly Swatter Type = " + types);
	         System.out.println("Price = $"+ detail.getPrice(types));
	         System.out.println();
	         System.out.println();
	      } 	
	   }

}
