
public class Shift5State implements ShiftState {

	public void changeState(CarShiftContext ctx, int speed) {
		// TODO Auto-generated method stub
		if (speed <= 55 ) {
			ctx.setState(new Shift4State());
        }
		else {
			ctx.setState(this);
		}
	}
	public String toString() {
		return "5";
	}
}
