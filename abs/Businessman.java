package abs;

public class Businessman implements Richman, SocialWorker  {
	private String name;
	private String address;
	
	public Businessman() {	
	}
	
	public Businessman(String name, String address) {
		this.name = name;
		this.address = address;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public void earnmoney() {	
		System.out.println("earn");
	}
	
	public void donation() {
		System.out.println("donate");
	}
	
	public void party() {	
		System.out.println("party");
	
	}


	public void helpToOther() {
		System.out.println("help other");
		
	}
}
