import java.util.*;
import java.io.*;
import java.math.*;
import java.text.*;
import java.time.*;

public class Prob17 {
	public static List<Integer[]> image = new ArrayList<Integer[]>();
	public static int[][] img;
	public static void main(String[] args) throws IOException {
		final String dir = (args.length > 0) ? args[0] : "../../Cases/2013/sample/in/";
		Scanner scan = new Scanner(new File(dir + "Prob17.in.txt"));
		while(scan.hasNextLine()) {
			String in = scan.nextLine();
			int N = in.length();
			Integer[] arr = new Integer[N];
			for(int i = 0; i < N; i++) {
				arr[i] = Integer.parseInt(String.valueOf(in.charAt(i)));
			}
			// System.out.println(Arrays.toString(arr));
			image.add(arr);
		}
		img = new int[image.size()][image.get(0).length];

		for(int i = 0, x = image.size(); i < x; i++) {
			for(int j = 0, y = image.get(i).length; j < y; j++) {
				img[i][j] = image.get(i)[j];
			}
		}
		for(int i = 0, x = img.length; i < x; i++) {
			System.out.println(Arrays.toString(img[i]));
		}

		System.out.println(N(Integer.parseInt(args[0]), Integer.parseInt(args[1])));

	}
	public static int N(int x, int y) {
		int count = 0;
		System.out.println("x, y: " + img[x][y]);
		System.out.println("x - 1, y: " + img[x - 1][y]);
		System.out.println("x + 1, y: " + img[x + 1][y]);
		System.out.println("x, y + 1: " + img[x][y + 1]);
		System.out.println("x, y - 1: " + img[x][y - 1]);
		System.out.println("[0].len: " + img[0].length);
		System.out.println("len: " + img.length);
		if(y - 1 > 0 && img[x - 1][y] == 1) count++;
		if(y + 1 < img[0].length && img[x + 1][y] == 1) count++;
		if(x - 1 > 0 && img[x][y - 1] == 1) count++;
		if(x + 1 < img.length && img[x][y + 1] == 1) count++;


		return count;
	}
}
