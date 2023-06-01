package in.ineuron.question5;

public class Question5 {
	public static String reverse(String s, int k) {
		StringBuilder sb = new StringBuilder(s);

		for (int i = 0; i < sb.length(); i += 2 * k) {
			int l = i;
			int r = Math.min(i + k - 1, sb.length() - 1);
			while (l < r) {
				sb.setCharAt(l, s.charAt(r));
				sb.setCharAt(r, s.charAt(l));
				++l;
				--r;
			}
		}

		return sb.toString();
	}

	public static void main(String[] args) {
		int k = 2;
		String s = "abcdefg";
		System.out.print(reverse(s, k));

	}
}
