import java.util.Vector;

public class Board implements Component {
	  private Component bus;
	  private Vector<Component> cardlist = new Vector<Component>();
	  public void setBus (Component b){
	    bus=b;
	  }
	  public void addCard(Component d){
	    cardlist.addElement(d);
	  }
	  public double netPrice()      {return 26.00;}
	  public double discountPrice() {return  6.00;}
	  
	  public double computePrice(){
	    double tmp=discountPrice();
	    if (bus!= null)
	       tmp+=bus.computePrice();
	    for (Component card : cardlist) {
	        tmp+=card.computePrice();
	    }
	    return tmp;
	  }
}
