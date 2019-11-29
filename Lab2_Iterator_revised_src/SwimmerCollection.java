import java.util.List;

public class SwimmerCollection implements Collection {
	
	//static final int MAX_ITEMS = 9;
	List<Swimmer> data;
	int count = 0;
	public SwimmerCollection(List<Swimmer> data) {
		this.data = data;
	}
	public Iterator createIterator() {
		// TODO Auto-generated method stub
		return new SwimmerIterator(FillData(false, 0));
	}
	public Iterator createIterator(int prediction) {
		// TODO Auto-generated method stub
		return new SwimmerIterator(FillData(false, prediction));
	}
	public Iterator createReverseIterator() {
		// TODO Auto-generated method stub
		return new SwimmerIterator(FillData(true, 0));
	}
	private Swimmer[] FillData(boolean reverse, int predictionAge){
		Swimmer swimmerList[] = new Swimmer[data.size()];
		int count = 0;
		if(reverse==false) {
			for(int i=0;i<data.size();i++) {
				Swimmer s = data.get(i);
				if(s.getAge()>=predictionAge) {
					swimmerList[count] = data.get(i);
					count++;
				}
			}
		}
		else{
			for(int i=data.size()-1;i>=0;i--) {
				Swimmer s = data.get(i);
				if(s.getAge()>=predictionAge) {
					swimmerList[count] = data.get(i);
					count++;
				}
			}
		}
		return swimmerList;
    }
}
