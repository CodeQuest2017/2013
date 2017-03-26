import java.util.*;
import java.io.*;

public class Prob03 {
	public static final String dir = "../../Cases/2013/sample/in/";
	public static void main(String[] args) throws IOException {
		Scanner scan = new Scanner(new File(dir + "Prob03.in.txt"));
		Map<String, Integer> map = new LinkedHashMap<String, Integer>();
		while(scan.hasNextLine()) {
			String ext = scan.nextLine();
			ext = ext.substring(ext.indexOf(".") + 1);
			map.put(ext, (map.containsKey(ext) ? map.get(ext) : 0) + 1);
		}
		map.forEach((key, value) -> System.out.println(key + " " + value));
	}
}
