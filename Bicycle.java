
public class Bicycle implements Vehicle{
	private int speed;
	public Bicycle() {
		speed = 0;
	}
	public void speedUp() {
		speed += 1;
	}
	public void slowDown() {
		speed -= 1;
	}
	@Override
	public int getSpeed() {
		return speed;
	}
}
