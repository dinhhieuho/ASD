
public class CarShiftContext {
	private ShiftState currState;
	public CarShiftContext() {
		currState = new ParkState();
	}
	public void setState(ShiftState state) {
		currState = state;
	}
	
	public ShiftState getState() {
		return currState;
	}
}
