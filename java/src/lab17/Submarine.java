package lab17;

public class Submarine extends Token {

	public Submarine(int x, int y, Map map) {
		super(x, y, map);
	}

	// TODO Auto-generated constructor stub
	public static int maxSpeed = 15;
	private int depth;

	public int getDepth() {
		return depth;
	
	}

	public void setDepth(int depth) {
		this.depth = depth;
	}

	public void dive(int howDeep) {
		this.depth += howDeep;
	

	}

	public void surface() {
		depth = 0;
	}

	
}
