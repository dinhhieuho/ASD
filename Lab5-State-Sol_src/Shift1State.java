
public class Shift1State implements ShiftState {

	public void changeState(CarShiftContext ctx, int speed) {
		// TODO Auto-generated method stub
		if(speed<=0){
			ctx.setState(new ParkState());
		}
		else if (speed > 0 && speed <= 5) {
			ctx.setState(this);
	    }
		else {
			ctx.setState(new Shift2State());
		}
		
	}
	public String toString() {
		return "1";
	}
}
