package week2.day4homeassignments;

public interface DatabaseConnection {
	
	//creating interface with abstract methods
	
	public void connect();
	
	public void disconnect();
	
	public void executeUpdate();
	
}
