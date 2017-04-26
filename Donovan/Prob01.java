import java.util.*;
import java.io.*;

public class Prob01 {
	public static void main(String[] args) throws IOException {
		final String dir = (args.length > 0) ? args[0] : "../../Cases/2013/sample/in/";
		Scanner scan = new Scanner(new File(dir + "Prob01.in.txt"));
		while(scan.hasNextLine()) {
			System.out.println(scan.nextLine());
		}
	}
}
