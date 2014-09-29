package reversewords;

/* Charlie Patton
 * Solution to Google Code Jam Practice Question
 */


import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ReverseWords {

	public static void main(String[] args) throws IOException {
		
		ReverseWords rv = new ReverseWords();
		FileReader reader = new FileReader("C:/Users/Charlie/Desktop/B-large-practice.in");
		BufferedWriter writer = new BufferedWriter(new FileWriter("C:/Users/Charlie/Desktop/output.txt"));
		Scanner scanner = new Scanner(reader);
		
		int numberOfCases = scanner.nextInt();
		String disregard = scanner.nextLine();
		
		for(int i = 0; i < numberOfCases; i++){
					
				String line = scanner.nextLine();
				String [] words = line.split(" ");
				List<String> list = Arrays.asList(words);
				Collections.reverse(list);
				
				String oneLine = rv.stringsOnOneLine(list);
				String eol = System.getProperty("line.separator"); 
				writer.write("Case #" + (i+1) + ": " + oneLine + eol);
			
		}
		
		writer.close();
		reader.close();
	}
	
	public String stringsOnOneLine(List listOfWords){
		String low = "";
		for(int i = 0; i < listOfWords.size(); i++){
			low = low + " " + listOfWords.get(i);
		}
		return low;
	}
}

