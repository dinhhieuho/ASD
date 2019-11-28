import java.util.Observable;

public class ObservableCounter extends Observable
{
    
    private int count;

    public ObservableCounter (){
        
        count = 0;
    }
    
    public void increment(){
        count++;        
        setChanged(); 
        /*This method notifies the change to all the  
        observers that are registered and passes an object*/
        notifyObservers(new Integer(count));
    }
    
    public void decrement(){
        if (count >0){
            count--;
            setChanged(); 
            /*This method notifies the change to all the  
            observers that are registered and passes an object*/
            notifyObservers(new Integer(count));
        }
    }
}