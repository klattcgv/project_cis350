package mentalHealth;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class userSaveData { //date,rating,notes
	
	userData [] dataArray = new userData[365];
	private String outputText;

	public void saveUserData(userData segment) {
		segment.getDate();

		for (int i=0; i< dataArray.length; i++) {
			String outputText = dataArray[i].getRating() + "|" + dataArray[i].getNotes() + "|" + dataArray[i].getDate();
		}

		saveFile("dataList.txt", outputText, true);
	}

	public static void saveFile(String name, String text, boolean append) throws IOException{
		File file1 = new File("save.txt");

		FileWriter fw - new FileWriter(file1);

		PrintWriter pw = new PrintWriter(fw);

		pw.close();
	}

}
