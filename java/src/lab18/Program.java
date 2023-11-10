package lab18;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car[] vehicles = {new Car("ford", 30),new RacingCar("honda", 60, "cara", 30)};
//		Car car = new Car("ford", 30);
//		RacingCar racing = new RacingCar("honda", 60, "cara", 30);
		
		for (Car v:vehicles) {
			v.getToSixty(10);
			v.accelerate(2);
			System.out.println(v.getModel() + " "+ v.getSpeed());
			if (v instanceof RacingCar) {
				RacingCar x = (RacingCar) v;
				System.out.println(x.getDriver());
			}
			
		}
	}

}
