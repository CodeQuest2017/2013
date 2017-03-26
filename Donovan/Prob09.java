// INCOMPLETE
// Calculations work, but need to format the numbers
// "If your answers are not integers, print only one decimal place."
// "If they are integers, then print them like so."
import java.util.*;
import java.io.*;

public class Prob09 {
	public static final String dir = "../../Cases/2013/sample/in/";
	public static int max = 0;
	public static void main(String[] args) throws IOException {
		Scanner scan = new Scanner(new File(dir + "Prob09.in.txt"));
		int N = 0;
		while(scan.hasNextLine()) {
			String[] in = scan.nextLine().split(",");
			double sum = 0;
			int size = in.length;
			double[] arr = new double[size];

			Map<Integer, Integer> map = new HashMap<Integer, Integer>();

			for(int i = 0; i < size; i++) {
				int c = Integer.parseInt(in[i]);
				sum += c;
				arr[i] = c;
				map.put(c, (map.containsKey(c) ? map.get(c) : 0) + 1);
			}

			max = 0;
			List<Integer> modes = new ArrayList<Integer>();
			map.forEach((k, v) -> max = v > max ? v : max);
			map.forEach((k, v) -> {
				if(v == max) {
					modes.add(k);
				}
			});

			double mean = sum / size;
			double median = 0;
			
			Arrays.sort(arr);
			if(size % 2 == 0) {
				median = (arr[size / 2] + arr[size / 2 - 1]) / 2;
			} else {
				median = arr[size / 2];
			}

			mean = ((int) (mean * 10)) / 10.0;
			String sMean = String.valueOf(mean);
			int index = sMean.indexOf(".");
			if(sMean.charAt(index + 1) == '0') {
				sMean = sMean.substring(0, index);
			}

			median = ((int) (median * 10)) / 10.0;
			String sMedian = String.valueOf(median);
			int index2 = sMedian.indexOf(".");
			if(sMedian.charAt(index2 + 1) == '0') {
				sMedian = sMedian.substring(0, index2);
			}

			System.out.print("Set " + ++N + ": " + "Mean=" + sMean);
			System.out.print(", Median=" + sMedian + ", Mode=");
			System.out.print(modes.get(0));
			for(int i = 1, x = modes.size(); i < x; i++) {
				System.out.print("," + modes.get(i));
			}

			System.out.println();
		}
	}
}
