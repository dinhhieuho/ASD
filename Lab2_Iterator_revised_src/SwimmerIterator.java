
public class SwimmerIterator implements Iterator {
	Swimmer[] swimmers;
	int pos = 0;
	public SwimmerIterator(Swimmer[] swimmers) {
		this.swimmers = swimmers;
		pos = 0;
	}
	
	public Object next() {
		// TODO Auto-generated method stub
		Swimmer s = swimmers[pos];
		pos++;
		return s;
	}
	
	public boolean hasNext() {
		// TODO Auto-generated method stub
		if(pos >= swimmers.length || swimmers[pos] == null)
			return false;
		else
			return true;
	}

	public Object currentItem() {
		// TODO Auto-generated method stub
		return swimmers[pos];
	}

}
