package BankManagement;

public class Bank {
	private int id= 22;
	private String name="Loki";
	private double amount=100000;
	private int pin=2025;
	
	
	public Bank() {
		
	}


	


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public double getAmount() {
		return amount;
	}


	public void setAmount(double amount) {
		this.amount = amount;
	}
	public int getPin() {
		return pin;
	}


	

	@Override
	public String toString() {
		return "Bank [id=" + id + ", name=" + name + ", amount=" + amount +"]";
	}
	

}
