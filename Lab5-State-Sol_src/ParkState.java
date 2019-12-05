
public class ParkState implements ShiftState {

	public void changeState(CarShiftContext ctx, int speed) {
		// TODO Auto-generated method stub
		if(speed==0)
			ctx.setState(this);
		else
			ctx.setState(new Shift1State());
			
	}
	public String toString() {
		return "Park";
	}
}
