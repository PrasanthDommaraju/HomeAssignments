package week2.day4homeassignments;

public class JavaConnection implements DatabaseConnection {
	
	//concrete class
	//implementing the abstract methods from interface
	
	@Override
	public void connect() {
		System.out.println("connect method");
		
	}

	@Override
	public void disconnect() {
		System.out.println("disconnect method");
		
	}

	@Override
	public void executeUpdate() {
		System.out.println("execution update method");
		
	}
	
    public static void main(String[] args) {
		
    	JavaConnection jConnect = new JavaConnection();
    	jConnect.connect();
    	jConnect.disconnect();
    	jConnect.executeUpdate();
	}
	
	
	
	
	

}
