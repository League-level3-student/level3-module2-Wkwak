package _02_More_Algorithms;

import java.util.ArrayList;
import java.util.List;

public class Algorithms {
	public static int findBrokenEgg(List<String> eggs) {
		int index = 0;
		for (int i = 0; i < eggs.size(); i++) {
			if (eggs.get(i).equals("cracked")) {
				index = i;
				break;
			}
		}
		return index;
	}

	public static int countPearls(List<Boolean> pearls) {
		int index = 0;
		for (int i = 0; i < pearls.size(); i++) {
			if (pearls.get(i) == true) {
				index = i;
				break;
			}
		}
		return index;
	}

	public static double findTallest(List<Double> peeps) {
		double tallest = peeps.get(0);
		for (int i = 0; i < peeps.size(); i++) {
			if (peeps.get(i) > tallest) {
				tallest = peeps.get(i);
			}
		}
		return tallest;
	}

	public static String findLongestWord(List<String> words) {
		String longest = words.get(0);
		for (int i = 0; i < words.size(); i++) {
			if (words.get(i).length() > longest.length()) {
				longest = words.get(i);
			}
		}
		return longest;
	}

	public static boolean containsSOS(List<String> message) {
		String everything = "";
		for (int i = 0; i < message.size(); i++) {
			everything += message.get(i);
		}
		if(everything.contains("... --- ...")) {
			return true;
		}else {
			return false;
		}

	}
	
	public static List<Double> sortScores(List<Double> results) {
		for(int i = 0; i < results.size()-1; i++) {
			int index = i;
			for (int j = i + 1; j < results.size(); j++) {
				if(results.get(j) < results.get(index)) {
					index = j;
				}
				double temp = results.get(index);
				results.set(index,results.get(i));
				results.set(i, temp);
			}
		}
		return results;
	}
}
