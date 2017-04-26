import java.util.*;
import java.io.*;
import java.math.*;
import java.text.*;
import java.time.*;

public class Prob16 {
	public static List<Integer> called = new ArrayList<Integer>();
	public static List<Integer[][]> cards = new ArrayList<Integer[][]>();
	public static void main(String[] args) throws IOException {
		final String dir = (args.length > 0) ? args[0] : "../../Cases/2013/sample/in/";
		Scanner scan = new Scanner(new File(dir + "Prob16.in.txt"));
		while(scan.hasNextInt()) {
			Integer[][] card = new Integer[5][5];
			for(int i = 0; i < 5; i++) {
				for(int j = 0; j < 5; j++) {
					if(i == 2 && j == 2) {
						card[i][j] = 0;
						continue;
					}
					card[i][j] = scan.nextInt(); 
				}
			}
			cards.add(card);
		}
		int x = cards.size();
		scan.nextLine(); // Empty line
		scan.nextLine(); // "PLAY"
		called.add(0); // Add 0 since it's the free space
		while(scan.hasNext()) {
			int numCalled = Integer.parseInt(scan.nextLine().substring(1));
			called.add(numCalled);
			if(called.size() >= 5) {
				boolean bingo = false;
				for(int i = 0; i < x; i++) {
					if(hasBingo(cards.get(i))) {
						System.out.print((!bingo ? "" : " ") + (i + 1));
						bingo = true;
					}
				}
				if(bingo) {
					System.out.println();
					System.exit(0);
				}
			}
		}
	}
	public static boolean hasBingo(Integer[][] card) {
		// #1 Check each row
		for(int row = 0; row < 5; row++) {
			int count = 0;
			// For each col in row
			for(int col = 0; col < 5; col++) {
				// Check that each column has been called
				if(called.contains(card[row][col])) count++;
			}
			if(count == 5) return true;
		}

		// #2 Check each column
		for(int col = 0; col < 5; col++) {
			int count = 0;
			// For each row in col
			for(int row = 0; row < 5; row++) {
				// Check that each row has been called
				if(called.contains(card[row][col])) count++;
			}
			if(count == 5) return true;
		}

		// #3 Check diagonal A
		int countA = 0;
		for(int i = 0; i < 5; i++) {
			if(called.contains(card[i][i])) countA++;
		}
		if(countA == 5) return true;

		// #4 Check diagonal B
		int countB = 0;
		for(int i = 0; i < 5; i++) {
			if(called.contains(card[5 - i - 1][i])) countB++;
		}
		if(countB == 5) return true;

		return false;
	}
}
