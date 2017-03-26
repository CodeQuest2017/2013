import java.util.*;
import java.io.*;

public class Prob01 {
	public static final String dir = "../../Cases/2013/sample/in/";
	public static void main(String[] args) throws IOException {
		Scanner scan = new Scanner(new File(dir + "Prob01.in.txt"));
		while(scan.hasNextLine()) {
			System.out.println(scan.nextLine());
		}
	}
}
