
public class SwimmerCollection implements Collection {
	
	static final int MAX_ITEMS = 9;
	Swimmer[] swimmerList;
	int count = 0;
	public SwimmerCollection() {
		swimmerList = new Swimmer[MAX_ITEMS];
		FillData();
	}
	public Iterator CreateIterator() {
		// TODO Auto-generated method stub
		return new SwimmerIterator(swimmerList);
	}
	private void addItem(Swimmer s) {
		if(count >= MAX_ITEMS) {
			System.err.print("Full");
		}
		else {
			swimmerList[count] = s;
			count++;
		}
	}
	private void FillData(){
        
        Swimmer pswim = new Swimmer ("Amanda", "McCarthy","WCA",12,28.10);
        addItem(pswim);
        pswim = new Swimmer ("Jamie", "Falco","HNHS",12,29.80);
        addItem(pswim);
        pswim = new Swimmer ("Meaghan", "O'Donnell","EDST",12,30.00);
        addItem(pswim);
        pswim = new Swimmer ("Greer", "Gibbs","CDEV",11,30.04);
        addItem(pswim);
        pswim = new Swimmer ("Rhiannon", "Jeffrey","WYW",12,30.04);
        addItem(pswim);
        pswim = new Swimmer ("Sophie", "Connolly","HNHS",11,30.11);
        addItem(pswim);
        pswim = new Swimmer ("Dana", "Helyer","EDST",12,30.20);
        addItem(pswim);
        pswim = new Swimmer ("Lindsay", "Marotto","CDEV",11,30.22);
        addItem(pswim);
        pswim = new Swimmer ("Sarah", "Treichel","WCA",12,30.34);
        addItem(pswim);
        
    }
}
