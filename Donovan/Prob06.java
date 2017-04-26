import java.util.*;
import java.io.*;

public class Prob06 {
	public static void main(String[] args) throws IOException {
		final String dir = (args.length > 0) ? args[0] : "../../Cases/2013/sample/in/";
		Scanner scan = new Scanner(new File(dir + "Prob06.in.txt"));
		// We can map the sums themselves since we can safely assume
		// that there will be no ties for each place
		Map<Integer, String> map = new HashMap<Integer, String>();
		while(scan.hasNextLine()) {
			String[] pair = scan.nextLine().split(":");
			String[] scores = pair[1].split(",");
			int sum = 0;
			for(int i = 0, x = scores.length; i < x; i++) {
				sum += Integer.parseInt(scores[i]);
			}
			map.put(sum, pair[0]);
		}
		List asc = new ArrayList(map.keySet());
		Collections.sort(asc);
		String[] a = new String[]{"FIRST", "SECOND", "THIRD"};
		for(int i = 0; i < 3; i++) {
			System.out.println(a[i] + ":" + map.get(asc.get(i)));
		}
		System.out.println("LAST:" + map.get(asc.get(asc.size() - 1)));
	}
}
