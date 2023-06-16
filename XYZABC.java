
public class XYZABC {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] name = { "11.20", "12.23", "14.17" };
		int sum1 = 0;
		int sum2 = 0;
		for (int i = 0; i < name.length; i++) {
			String b = name[i].substring(0, 2);
			// System.out.println(b);
			int d = Integer.parseInt(b);
			// System.out.println(d);
			sum1 = sum1 + d;

		}
		System.out.println("Point before sum = " + sum1);

		for (int j = 0; j < name.length; j++) {
			String a = name[j].substring(3);
			int e = Integer.parseInt(a);
			sum2 = sum2 + e;
			// System.out.println(a);

		}
		System.out.println("point after sum = " + sum2);
//		for (int i = 0; i < name.length; i++) {
//			String 
//		}
//		String a =  "11.20";
//		String s = a.substring(3);
//		System.out.println(s);
//		for (int i = 0; i < name.length; i++) {
//			String r = name[i].replace('.', ' ');
//			String[] q = r.split(" ");
//			for (int j = 0; j < q.length; j++) {
//				System.out.println(q[j]); // split ho gye h 11 20
//				Integer.parseInt(q[j]);
//			}
//
//		}
		// "11 20"
//		System.out.println(r);

//		String[] q = r.split(" ");
//		for (int i = 0; i < q.length; i++) {
//			System.out.println(q[i]);
//		}
//		

	}

}
