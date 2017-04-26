// I have no idea why this works
import java.util.*;
import java.io.*;
import java.math.*;
import java.text.*;
import java.time.*;

public class Prob05 {
	public static void main(String[] args) throws IOException {
		final String dir = (args.length > 0) ? args[0] : "../../Cases/2013/sample/in/";
		Scanner scan = new Scanner(new File(dir + "Prob05.in.txt"));
		String[] a = scan.nextLine().split("/");
		LocalDate c = LocalDate.of(Integer.parseInt(a[2]), Integer.parseInt(a[0]), Integer.parseInt(a[1]));
		while(scan.hasNextLine()) {
			String[] in = scan.nextLine().split(":");
			String[] b = in[1].split("/");

			LocalDate d = LocalDate.of(Integer.parseInt(b[2]), Integer.parseInt(b[0]), Integer.parseInt(b[1]));
			long n = java.time.temporal.ChronoUnit.DAYS.between(d, c);
			if(n > 180) System.out.println(in[0] + ", " + n);
		}
	}
}
