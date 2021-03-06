import java.util.*;
import java.io.*;

public class Prob07 {
	public static Map<String, Integer> map = new LinkedHashMap<String, Integer>();
	public static final String[] name = new String[]
		{"PENNY", "NICKEL", "DIME", "QUARTER", "ONE", "FIVE", "TEN", "TWENTY"};
	public static final int[] value = new int[]
		{1, 5, 10, 25, 100, 500, 1000, 2000};
	public static void main(String[] args) throws IOException {
		final String dir = (args.length > 0) ? args[0] : "../../Cases/2013/sample/in/";
		Scanner scan = new Scanner(new File(dir + "Prob07.in.txt"));
		while(scan.hasNextLine()) {
			String[] in = scan.nextLine().split(", ");
			int left = (int) (Double.parseDouble(in[1]) * 100 - Double.parseDouble(in[0]) * 100);
			String r = String.valueOf(left / 100.0);
			if(r.charAt(0) == '0') r = r.substring(1);
			int index = r.indexOf(".");
			if(r.length() == index + 2) r = r + "0";
			System.out.print("$" + r);
			if(left == 0) {
				System.out.println("NONE");
				System.exit(0);
			}
			while(left >= 1) left = next(left);
			map.forEach((k, v) -> System.out.print(", " + k + "=" + v));
			System.out.println();
			map.clear();
		}
	}
	public static int next(int n) {
		int c = -1;
		for(int i = 0, x = value.length; i < x; i++) {
			if(n >= value[i]) c++;
		}
		String b = name[c];
		map.put(b, (map.containsKey(b) ? map.get(b) : 0) + 1);
		return n - value[c];
	}
}
