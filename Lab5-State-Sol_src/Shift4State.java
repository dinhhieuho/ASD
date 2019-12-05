
public class Shift4State implements ShiftState {

	public void changeState(CarShiftContext ctx, int speed) {
		// TODO Auto-generated method stub
		if(speed<=30) {
			ctx.setState(new Shift3State());
		}
		else if (speed > 30 && speed <= 55) {
			ctx.setState(this);
        }
		else {
			ctx.setState(new Shift5State());
		}
		
	}
	public String toString() {
		return "4";
	}
}
