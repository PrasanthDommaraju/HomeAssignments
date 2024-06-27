package week2.day3homeassignments;

public class loginTestData2 extends loginTestData1 {
	
	//Single level Inheritance
	//subclass2
	
	public void enterUsernamee() {
		System.out.println("Enter the user name");
	}
	
	public void enterPasswordd() {
		System.out.println("Enter the password");
	}
	
	public static void main(String[] args) {
		
		loginTestData2 loginn = new loginTestData2();
		loginn.enterUsernamee();
		loginn.enterPasswordd();
		loginn.enterUsername();
		loginn.enterPassword();
		loginn.enterCredentials();
		loginn.navigateToHomePage();
	}

}
