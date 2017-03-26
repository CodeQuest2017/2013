import java.util.*;
import java.io.*;

public class Prob04 {
	public static final String dir = "../../Cases/2013/sample/in/";
	public static void main(String[] args) throws IOException {
		Scanner scan = new Scanner(new File(dir + "Prob04.in.txt"));
		while(scan.hasNextLine()) {
			List<String> ints = new ArrayList<String>();
			ints = Arrays.asList(scan.nextLine().split(","));

			int x = ints.size();
			int[] a = new int[x];
			for(int i = 0; i < x; i++) {
				a[i] = Integer.parseInt(ints.get(i));
			}

			Arrays.sort(a);

			for(int i = 0; i < x; i++) {
				System.out.print(a[i]);
				if(i + 1 != x) System.out.print(",");
			}

			System.out.println();
		}
	}
}
