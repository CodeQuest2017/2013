import java.util.*;
import java.io.*;

public class Prob10 {
	public static void main(String[] args) throws IOException {
		final String dir = (args.length > 0) ? args[0] : "../../Cases/2013/sample/in/";
		Scanner scan = new Scanner(new File(dir + "Prob10.in.txt"));
		while(scan.hasNextLine()) {
			String ip = scan.nextLine();
			String c = "";
			for(int i = 0; i < 4; i++) {
				int a = Integer.parseInt(ip.substring(0 + 8 * i, 8 + 8 * i), 2);
				if(i == 0) {
					if(a >= 240) c = "E";
					else if(a >= 224) c = "D";
					else if(a >= 192) c = "C";
					else if(a >= 128) c = "B";
					else c = "A";
				}
				System.out.print(a);
				if(i != 3) System.out.print(".");
			}
			System.out.println(" [CLASS " + c + "]");
		}
	}
}
