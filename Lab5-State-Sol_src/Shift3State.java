
public class Shift3State implements ShiftState {

	public void changeState(CarShiftContext ctx, int speed) {
		// TODO Auto-generated method stub
		if(speed<=10) {
			ctx.setState(new Shift2State());
		}
		else if (speed > 10 && speed <= 30) {
			ctx.setState(this);
        }
		else {
			ctx.setState(new Shift4State());
		}
		
	}
	public String toString() {
		return "3";
	}
}
