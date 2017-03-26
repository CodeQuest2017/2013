// INCOMPLETE
// For some reason, this code works for small N but fails
// silently for large N
import java.util.*;
import java.io.*;

public class Prob08 {
	public static final String dir = "../../Cases/2013/sample/in/";
	public static void main(String[] args) throws IOException {
		Scanner scan = new Scanner(new File(dir + "Prob08.in.txt"));
		while(scan.hasNext()) {
			int n = scan.nextInt();
			int k = scan.nextInt();
			int ans = f(n) / (f(k) * f(n - k));
			System.out.println(ans);
		}
		System.out.println("Got here"); // This is never reached
	}
	public static int f(int n) {
		if(n == 1) return n;
		return n * f(n - 1);
	}
}
