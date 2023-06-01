package in.ineuron.question7;


public class Question7 {
	public static boolean backspace(String s, String t) {
	    return backspace(s).equals(backspace(t));
	  }

	  private static String backspace(final String s) {
	    StringBuilder sb = new StringBuilder();
	    for (final char c : s.toCharArray())
	      if (c != '#')
	        sb.append(c);
	      else if (sb.length() != 0)
	        sb.deleteCharAt(sb.length() - 1);
	    return sb.toString();
	  }
	  public static void main(String[] args) {
			int k = 2;
			String s = "ab#c";
			String t = "ad#c";
			System.out.print(backspace(s,t));

		}

}
