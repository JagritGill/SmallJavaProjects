package bankaccountapp;

public class Savings extends Account {
	//List properties specific to a Saving account
	private int safetyDepositBoxID;
	private int safetyDepositBoxKey;
	
	//Constructor to initialize Saving account properties
	public Savings(String name, String SSN, double initDeposit) {
		super(name , SSN , initDeposit );
		accountNumber = "1" + accountNumber;
		setSafetyDepositBox();

	}
	
	private void setSafetyDepositBox() {
		safetyDepositBoxID = (int) (Math.random() * Math.pow(10, 3));
		safetyDepositBoxKey = (int) (Math.random() * Math.pow(10, 4));
	}
	
	//List any methods specific to Saving account
	public void showInfo() {
		super.showInfo();
		System.out.println(
				" Your Saving Account Features" +
				"\n Safety Deposit Box ID: "+ safetyDepositBoxID +
				"\n Safety Deposit Box Key: " + safetyDepositBoxKey);
		
	}

	@Override
	public void setRate() {
		rate = getBaseRate() - .25;
		
	}

}
