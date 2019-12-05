import java.util.Vector;

public class Cabinet implements Component {
	private Component board;
	private Vector<Component> drivelist = new Vector<Component>();
	public void setBoard (Board b){
	  board=b;
	}
	public void addDrive (Component d){
	    drivelist.addElement(d);
	}
	public double netPrice()      {return 6.00;}
	public double discountPrice() {return 3.00;}
	 
	public double computePrice() {
		// TODO Auto-generated method stub
		double tmp=netPrice();
	    if (board!= null)
	       tmp+=board.computePrice();
	    for (Component drive  : drivelist)
	        tmp+=drive.computePrice();
	    return tmp;
	}

}
