package week2.day3homeassignments;

public class LoginPage extends BasePage {
	
	//subclass
	
	public void performCommonTasks() {
		System.out.println("This method overrides the same method in BasePage class");
	}
	
	public static void main(String[] args) {
		
		LoginPage login = new LoginPage();
		login.findElement();
		login.clickElement();
		login.enterText();
		login.performCommonTasks();
	}

}
