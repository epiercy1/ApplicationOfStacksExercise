
public class Car implements Vehicle{
	private int speed;
	public Car() {
		speed = 0;
	}
	public void speedUp() {
		speed += 10;
	}
	public void slowDown() {
		speed -= 10;
	}
	@Override
	public int getSpeed() {
		return speed;
	}
}
