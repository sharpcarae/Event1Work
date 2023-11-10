package lab18;

public class RacingCar extends Car {
	private String driver;
	private int turboFactor;

	public String getDriver() {
		return driver;
	}

	public void setDriver(String driver) {
		this.driver = driver;
	}

	public int getTurboFactor() {
		return turboFactor;
	}

	public void setTurboFactor(int turboFactor) {
		this.turboFactor = turboFactor;
	}

	public RacingCar(String model, int speed, String driver, int turboFactor) {
		super(model, speed);
		this.driver = driver;
		this.turboFactor = turboFactor;
	}

	public void accelerate() {
		super.accelerate(getSpeed());
		turboFactor *= getSpeed();
	}
}
