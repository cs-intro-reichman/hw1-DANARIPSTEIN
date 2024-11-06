// Generates three integer random numbers in a given range,
// and prints them in increasing order.
public class Ascend {
	public static void main(String[] args) {
		int lim = Integer.parseInt(args[0]);
        int a = (int) (Math.random() * lim);
        int b = (int) (Math.random() * lim);
        int c = (int) (Math.random() * lim);
        System.out.println(a + " " + b + " " + c);
        int smallValue = Math.min(Math.min(a, b), Math.min(a, c));
        int bigValue = Math.max(Math.max(c, a), Math.max(c, b));
        int midValue = ((a + b + c) - bigValue - smallValue);
        System.out.println(smallValue + " " + midValue + " " + bigValue);
	}
}
