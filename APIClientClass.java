package week2.day3homeassignments;

public class APIClientClass {
	
	//Demonstrating Method overloading in Java
	
	//creating two methods with same name having different arguments
	public void sendRequest(String endPoint) {
		System.out.println("First Method");
		System.out.println(endPoint);
	}
	
	public void sendRequest(String endPoint, String requestBody, boolean requestStatus) {
		System.out.println("Second Method");
		System.out.println(endPoint);
		System.out.println(requestBody);
		System.out.println(requestStatus);
	}
	
	public static void main(String[] args) {
		
		APIClientClass apiClass = new APIClientClass();
		apiClass.sendRequest("htm/head/body/div/p");
		apiClass.sendRequest("end", "body/div/p/input", true);
		
		
	}

}
