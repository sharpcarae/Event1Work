package lab09;

public class Token {
	private int x;
	private int y;
	private Map map;

	public Token(int x, int y, Map map) {
		this.x = x;
		this.y = y;
		this.map = map;
	}
	public void getCoords() {
		System.out.printf("Coordinates are:  %d, %d\n", x, y);
	}
	
	public boolean move(String direction, int distance) {
		if (direction == "east") {
			if (x + distance <= map.getxSize()) {
				x += distance;
			}

		} else if (direction == "west") {
			if (x + distance <= map.getxSize()) {
				x -= distance;
			}
		} else if (direction == "north") {
			if (x + distance <= map.getySize()) {
				y += distance;
			}
		} else if (direction == "south") {
			if (x + distance >= map.getySize()) {
				y -= distance;
			}
		}
		return true;
	}

}
