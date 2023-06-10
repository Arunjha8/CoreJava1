package abs;

public class TestBusiness {
	public static void main(String[] args) {
		
		Businessman rm = new Businessman("Arun", "Indore");
	//	Businessman sm = new Businessman();
		
		rm.earnmoney();
		rm.donation();
		rm.party();
		rm.helpToOther();
		System.out.println(rm.getAddress());
		System.out.println(rm.getName());
	}

}
