package in.ineuron.question6;

public class Question6 {
	public static boolean rotate(String A, String B) {
	    return A.length() == B.length() && (A + A).contains(B);
	  }
	public static void main(String[] args) {
		int k = 2;
		String a = "abcde";
		String b = "cdeab";
		System.out.print(rotate(a,b));

	}

}
