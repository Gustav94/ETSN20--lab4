import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class SearchStrings {
	int count = 0;
	int lineNumber = 0;
	
	//Goes through the text and prints the lines where the word in found
	//also how many times the word is seen in the text
	public void stringCount(File f, String s) {
		try {
			try (BufferedReader br = new BufferedReader(new FileReader(f))) {
				String line = br.readLine();
				  while ((line = br.readLine()) != null) {
					  lineNumber++;
				    if ( line.toLowerCase().indexOf(s.toLowerCase()) != -1 ) {

				    	System.out.println("I found the input on row " + lineNumber);
				  }
				    
				  }
				
	}		
		} catch (IOException e) {
	    e.printStackTrace();
		}
}
		
	
	
	//Gets the file name from input
	public File getFileFromInput(String s) {
		//int i = s.indexOf(' ');
		//String textDoc = s.substring(i);
		String[] searchWords = s.split(" ");
		System.out.println(searchWords[2]);
		File file = new File(searchWords[2]);
		return file;
	}
	//Gets the search word from input
	public String getWordFromInput(String s) {
		String[] searchWords = s.split(" ");
		//int i = s.indexOf(' ');
		//String word = s.substring(0, i);
		System.out.println(searchWords[1]);
		return searchWords[1];
	}
	
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Input:");
		String input = keyboard.nextLine();		
	    SearchStrings s = new SearchStrings();
		s.stringCount(s.getFileFromInput(input), s.getWordFromInput(input));
		
	}
	
	}


