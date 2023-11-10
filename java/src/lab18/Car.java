package lab18;

public class Car {
	private String model;
	private int speed;

	public Car(String model, int speed) {
		super();
		this.model = model;
		this.speed = speed;
	}
	
	

	public void accelerate(int seconds) {
		speed += 5*seconds;
	}

	public void getToSixty(int speed) {
		this.speed = 60;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

}
