package week2.day3homeassignments;

public class loginTestData1 extends TestData {
	
	//Single level Inheritance
	//subclass1
	
	public void enterUsername() {
		System.out.println("Please enter the User Name");
		}
	
	public void enterPassword() {
		System.out.println("Please enter the Password");
	}
	
	public static void main(String[] args) {
		
		loginTestData1 login = new loginTestData1();
		login.enterUsername();
		login.enterPassword();
		login.enterCredentials();
		login.navigateToHomePage();
	}

}
