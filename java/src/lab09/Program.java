package lab09;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map map = new Map(500,400);
		Token t1 = new Token(60,20,map);
		Token t2 = new Token(80,35,map);
		Token t3 = new Token(70,30,map);
		
		t1.getCoords();
		t1.move("east", 30);
		t1.getCoords();
		t2.getCoords();
		t2.move("north", 20);
		t2.getCoords();
		t3.getCoords();
		t3.move("south", 40);
		t3.getCoords();
	}

}
