
public class hw1 {
public static void main(String[] args) {
	String[] arr = {"abc11", "ah2jkb", "hj96y78"};
	int sum=0;
	for (int i = 0; i < arr.length; i++) {
		for (int j = 0; j < arr[i].length(); j++) {
			char c = arr[i].charAt(j);
			if (c>='0' && c<='9') {
				int num = Integer.parseInt(String.valueOf(c));
				System.out.println(num);
				sum = sum + num;
				num = 0;
			}
		}
	}
	System.out.println("sum = "+ sum);
}
}
