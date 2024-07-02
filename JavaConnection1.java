package week2.day4homeassignments;

public class JavaConnection1 extends MySqlConnection {
	
	//concrete class
	//inherits abstract class

	@Override
	public void connect() {
		System.out.println("Method to connect to Database ");
		
	}

	@Override
	public void disconnect() {
		System.out.println("thsi method can be used to disconnect from database");
		
	}

	@Override
	public void executeUpdate() {
		System.out.println("This method can be used to update database");
		
	}
	
	public static void main(String[] args) {
		
		JavaConnection1 jConnect = new JavaConnection1();
		jConnect.connect();
		jConnect.disconnect();
		jConnect.executeUpdate();
		jConnect.executeQuery();
	}

}
