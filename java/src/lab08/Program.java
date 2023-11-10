package lab08;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String word = "Hello";
		Account test = new Account(1, "Cara", 500);
		Account test2 = new Account(2, "Cara", 500);
		test.withdraw(100);
		test.deposit(300);
		test.getDetails();
		test2.getDetails();
//		getDetails(test);
//	}
//	
//	public static void getDetails(Account accValue) {
//		
//		System.out.printf("The account is: ID: %d, Name: %s, Amound %.2f\n", accValue.getId(), accValue.getOwner(), accValue.getBalance());
	}
}
