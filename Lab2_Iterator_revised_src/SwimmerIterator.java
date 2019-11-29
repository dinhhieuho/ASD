
public class SwimmerIterator implements Iterator {
	Swimmer[] swimmers;
	int pos = 0;
	public SwimmerIterator(Swimmer[] swimmers) {
		this.swimmers = swimmers;
	}
	public Object First() {
		// TODO Auto-generated method stub
		if(swimmers==null)
			return null;
		
		pos = 0;
		return swimmers[pos];
	}
	public Object End() {
		// TODO Auto-generated method stub
		if(swimmers==null)
			return null;
		pos = swimmers.length-1;
		return swimmers[pos];
	}
	public Object Next() {
		// TODO Auto-generated method stub
		Swimmer s = swimmers[pos++];
		return s;
	}
	public Object Previous() {
		// TODO Auto-generated method stub
		Swimmer s = swimmers[pos--];
		return s;
	}
	public boolean hasPrevious() {
		if(pos <= 0 || swimmers[pos] == null)
			return false;
		else
			return true;
	}
	public boolean hasNext() {
		// TODO Auto-generated method stub
		if(pos >= swimmers.length || swimmers[pos] == null)
			return false;
		else
			return true;
	}

	public Object CurrentItem() {
		// TODO Auto-generated method stub
		return swimmers[pos];
	}

}
