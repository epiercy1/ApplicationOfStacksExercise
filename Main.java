import java.awt.List;
import java.util.ArrayList;

public class Main {
	public static void main(String[]args) {
		Main m = new Main();
		m.go();
	}
	public void go() {
		List<Vehicle>vehicles = new ArrayList<Vehicle>();
		Bicycle b1 = new Bicycle();
		Bicycle b2 = new Bicycle();
		Bicycle b3 = new Bicycle();
		Car c1 = new Car();
		Car c2 = new Car();
		Car c3 = new Car();
		vehicles.add(b1);
		vehicles.add(b2);
		vehicles.add(b3);
		vehicles.add(c1);
		vehicles.add(c2);
		vehicles.add(c3);
		for(int i = 0; i < vehicles.size(); i++) {
			vehicles.get(i).speedUp.getSlowest(vehicles);
			if(vehicles.get(i).getSpeed() > Vehicle.speedLimit);
		}
		Vehicle slowest = Vehicle.getSlowest(vehicles);
	}
}
