package lab17;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map map = new Map(500,400);
		Token t1 = new Token(60,20,map);
		Token t2 = new Token(80,35,map);
		Token t3 = new Token(70,30,map);
		Submarine s1 = new Submarine(20, 30, map);
		Plane p1 = new Plane(50, 20, map);
		
		t1.getCoords();
		t1.move("east", 30);
		t1.getCoords();
		t2.getCoords();
		t2.move("north", 20);
		t2.getCoords();
		t3.getCoords();
		t3.move("south", 40);
		t3.getCoords();
		System.out.println(s1.getDepth());
		s1.dive(40);
		System.out.println(s1.getDepth());
		System.out.println(s1.getDepth());
		s1.surface();
		System.out.println(s1.getDepth());
		System.out.println(p1.getField());
		p1.climb(20);
		System.out.println(p1.getField());
		p1.land();
		System.out.println(p1.getField());
	}

}
