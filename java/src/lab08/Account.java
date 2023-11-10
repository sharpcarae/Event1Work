package lab08;

public class Account {
	private int id;
	private String owner;
	private double balance;

	public Account(int id, String owner, double balance) {
		this.id = id;
		this.owner = owner;
		this.balance = balance;

	}

	public void getDetails() {
		System.out.printf("The account is: ID: %d, Name: %s, Amound %.2f\n", id, owner, balance);
	}

	public void deposit(double amount) {
		
		if (amount < 0) {
			System.out.println("You cannot deposit less then 0.");
		} else {
			balance += amount;
		}
	}

	public void withdraw(double amount) {
		
		if (amount > balance) {
			System.out.printf("You cannot withdraw %d as it is more then the balance of %d\n", amount, balance);
		} else {
			balance -= amount;
			
		}
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

}
