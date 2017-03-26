import java.util.*;
import java.io.*;
import java.math.*;

public class Prob08 {
	public static final String dir = "../../Cases/2013/sample/in/";
	public static void main(String[] args) throws IOException {
		Scanner scan = new Scanner(new File(dir + "Prob08.in.txt"));
		while(scan.hasNext()) {
			long n = scan.nextLong(), k = scan.nextLong();
			BigInteger num = BigInteger.ONE, denom = BigInteger.ONE;

			for(long i = n; i > k; i--) num = num.multiply(BigInteger.valueOf(i));
			for(long i = n - k; i > 1; i--) denom = denom.multiply(BigInteger.valueOf(i));
			System.out.println(num.divide(denom));
		}
	}
}
