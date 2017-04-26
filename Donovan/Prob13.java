import java.util.*;
import java.io.*;

public class Prob13 {
	public static final String[] T = new String[]
		{"A", "B", "X", "1", "5", "8", "U", "Q", "Y", "3", "R", "G", "K", "4", "E", "7"};
	public static Map<String, Character> map = new HashMap<String, Character>();
	public static void main(String[] args) throws IOException {
		final String dir = (args.length > 0) ? args[0] : "../../Cases/2013/sample/in/";
		Scanner scan = new Scanner(new File(dir + "Prob13.in.txt"));
		makeMap();
		while(scan.hasNextLine()) {
			String in = scan.nextLine();
			String name = in.split(": ")[0];
			String s = in.split("v=")[1];
			
			String decoded = "";
			for(int i = 0, x = s.length(); i < x; i += 2) {
				String encoded = s.substring(i, i + 2);
				decoded += map.get(encoded);
			}
			System.out.println(name + ": " + decoded);
		}
	}
	public static String encode(char c) {
		int ascii = (int) c;
		
		String binary = Integer.toString(c, 2);
		while(binary.length() < 8) binary = "0" + binary;
		
		int v1 = Integer.parseInt(binary.substring(0, 4), 2);
		int v2 = Integer.parseInt(binary.substring(4), 2);

		return T[v1] + T[v2];
	}
	public static void makeMap() {
		// We only care about the alphanumeric characters
		int a1 = (int) 'a', a2 = (int) 'z';
		for(int i = a1; i <= a2; i++) {
			char a = (char) i;
			map.put(encode(a), a);
		}

		int b1 = (int) 'A', b2 = (int) 'Z';
		for(int i = b1; i <= b2; i++) {
			char b = (char) i;
			map.put(encode(b), b);
		}

		int c1 = (int) '0', c2 = (int) '9';
		for(int i = c1; i <= c2; i++) {
			char c = (char) i;
			map.put(encode(c), c);
		}

		// Which also includes the space
		map.put(encode(' '), ' ');
	}
}
