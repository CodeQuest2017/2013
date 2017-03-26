import java.util.*;
import java.io.*;

public class Prob02 {
	public static final String dir = "../../Cases/2013/sample/in/";
	public static void main(String[] args) throws IOException {
		Scanner scan = new Scanner(new File(dir + "Prob02.in.txt"));
		while(scan.hasNextLine()) {
			StringBuilder s = new StringBuilder();
			String line = scan.nextLine();
			for(int i = line.length() - 1; i > -1; i--) {
				s.append(String.valueOf(line.charAt(i)));
			}
			System.out.println(s);
		}
	}
}
