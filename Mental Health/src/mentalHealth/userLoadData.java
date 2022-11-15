package mentalHealth;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * userLoadData is tasked with reading data from a text file, storing that data into userData objects which are then stored into an array.
 * 
 * @author clayk
 * @version 1
 */

public class userLoadData {
	
	/**
	 * readFile stores data from text into an array of userData objects
	 * 
	 * @param fileName is the name of the file passed to the function.
	 * @return The array of userDatas is returned.
	 * @throws FileNotFoundException In case a file is not found, this exception will be thrown.
	 */

	public static ArrayList<userData> readFile(String fileName) throws FileNotFoundException{
		
		File dataList = new File(fileName);
		Scanner s = new Scanner(dataList);
		
		ArrayList<userData> storedList = new ArrayList<userData>();
		
		while (s.hasNextLine()) {
			String segment = s.nextLine();
			
			String[] items = segment.split("\\|");
			
			int rating = Integer.parseInt(items[0]);
			String notes = items[1];
			int date = Integer.parseInt(items[2]);
			
			userData newSegment = new userData(rating,notes,date);
			
			storedList.add(newSegment);
		}
		
		s.close();
		
		return storedList;
	}
}
