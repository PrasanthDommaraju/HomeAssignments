package week2.day3homeassignments;

public class CheckBoxButton extends Button {
	
	//Inheritance
	//subclass
	
	public void clickCheckButton() {
		System.out.println("click check box");
	}
	
	public static void main(String[] args) {
		
		CheckBoxButton checkBoxBtn = new CheckBoxButton();
		checkBoxBtn.clickCheckButton();
		checkBoxBtn.submit();
		checkBoxBtn.click();
		checkBoxBtn.setText("");
		
		
	}

}
