import java.util.*;
import java.io.*;

public class Prob12 {
	public static final String dir = "../../Cases/2013/sample/in/";
	public static void main(String[] args) throws IOException {
		Scanner scan = new Scanner(new File(dir + "Prob12.in.txt"));
		Map<String, Integer> map = new LinkedHashMap<String, Integer>();
		while(scan.hasNextLine()) {
			String next = scan.nextLine();
			int start = next.indexOf("<"), end = next.indexOf(">");
			if(start == -1 || end == -1) continue;
			
			String tag = next.substring(start + 1, end);
			if(tag.indexOf("/") > -1) continue;
			map.put(tag, (map.containsKey(tag) ? map.get(tag) : 0) + 1);
		}
		map.forEach((k, v) -> System.out.println(k + " " + v));
	}
}
