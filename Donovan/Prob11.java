import java.util.*;
import java.io.*;

public class Prob11 {
	public static final String dir = "../../Cases/2013/sample/in/";
	public static void main(String[] args) throws IOException {
		Scanner scan = new Scanner(new File(dir + "Prob11.in.txt"));
		while(scan.hasNextLine()) {
			String[] in = scan.nextLine().split(";");
			String s = in[2], n = "";
			if(in[0].equals("S")) {
				if(in[1].equals("M")) s = s.substring(0, s.length() - 2);
				else if(in[1].equals("C")) s = s.substring(0, 1).toLowerCase() + s.substring(1);
				for(int i = 0, x = s.length(); i < x; i++) {
					if(s.charAt(i) != s.toLowerCase().charAt(i)) n += " " + s.toLowerCase().substring(i, i + 1);
					else n += s.substring(i, i + 1);
				}
			} else {
				if(in[1].equals("M")) s = s + "()";
				else if(in[1].equals("C")) s = s.substring(0, 1).toUpperCase() + s.substring(1);
				for(int i = 0, x = s.length(); i < x; i++) {
					if(s.charAt(i) == ' ') n += s.substring(++i, i + 1).toUpperCase();
					else n += s.substring(i, i + 1);
				}
			}
			System.out.println(n);
		}
	}
}
