
public class Shift2State implements ShiftState {

	public void changeState(CarShiftContext ctx, int speed) {
		// TODO Auto-generated method stub
		if(speed<=5) {
			ctx.setState(new Shift1State());
		}
		else if (speed > 5 && speed <= 10) {
			ctx.setState(this);
        }
		else {
			ctx.setState(new Shift3State());
		}
		
	}
	public String toString() {
		return "2";
	}
}
