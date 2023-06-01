package in.ineuron.question8;

public class Question8 {
	public static boolean checkStraightLine(int[][] s) {
	    int x0 = s[0][0];
	    int y0 = s[0][1];
	    int x1 = s[1][0];
	    int y1 = s[1][1];
	    int dx = x1 - x0;
	    int dy = y1 - y0;

	    for (int i = 2; i < s.length; ++i) {
	      int x = s[i][0];
	      int y = s[i][1];
	      if ((x - x0) * dy != (y - y0) * dx)
	        return false;
	    }

	    return true;
	  }
	public static void main(String[] args) {
		int k = 2;
		int[][] s = {{1,2},{2,3},{3,4},{4,5},{5,6},{6,7}};
		System.out.print(checkStraightLine(s));

	}

}
