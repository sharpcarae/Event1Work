package lab17;

public class Plane extends Token {

	public Plane(int x, int y, Map map) {
		super(x, y, map);
	}

	// TODO Auto-generated constructor stub
	public static int maxSpeed = 360;

	private int field;

	public int getField() {
		return field;
	}

	public void setField(int field) {
		this.field = field;
	}

	public void climb(int howHigh) {
		this.field +=howHigh;

	}

	public void land() {
		field = 0;
	}
}
