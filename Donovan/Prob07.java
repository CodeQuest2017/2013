// INCOMPLETE
import java.util.*;
import java.io.*;

public class Prob07 {
	public static final String dir = "../../Cases/2013/sample/in/";
	public static Map<String, Integer> map = new LinkedHashMap<String, Integer>();
	public static final String[] name = new String[]
		{"PENNY", "NICKEL", "DIME", "QUARTER", "ONE", "FIVE", "TEN", "TWENTY"};
	public static final double[] value = new double[]
		{0.01, 0.05, 0.10, 0.25, 1, 5, 10, 20};
	public static void main(String[] args) throws IOException {
		Scanner scan = new Scanner(new File(dir + "Prob07.in.txt"));
		while(scan.hasNextLine()) {
			String[] in = scan.nextLine().split(", ");
			double left = Double.parseDouble(in[1]) - Double.parseDouble(in[0]);
			if(left == 0) {
				System.out.println("NONE");
				System.exit(0);
			}
			System.out.print(left);
			while(left >= 0.01) left = next(left);
			map.forEach((k, v) -> System.out.print(", " + k + "=" + v));
			System.out.println();
			map.clear();
		}
	}
	public static double next(double n) {
		int c = -1;
		for(int i = 0, x = value.length; i < x; i++) {
			if(n >= value[i]) c++;
		}
		String b = name[c];
		map.put(b, (map.containsKey(b) ? map.get(b) : 0) + 1);
		return n - value[c];
	}
}
