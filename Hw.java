
public class Hw {
public static void main(String[]args) {
	String[] arr = {"abc11", "ah2jkb", "hj96y78"};
	int sum=0;

	for(String str:arr) {
		
		for (int i = 0; i < str.length(); i++) {
			System.out.println(str.charAt(i));
			
			try {
				
				sum=sum+Integer.parseInt(str.charAt(i)+"");
				
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
		
	}
	System.out.println("sum "+sum);
}
}
