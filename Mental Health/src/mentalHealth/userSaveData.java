package mentalHealth;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class userSaveData { //date,rating,notes
	
	userData [] dataArray = new userData[365];

	for (int i=0; i< dataArray.length; i++) {
		String outputText = dataArray[i].getRating() + "|" + dataArray[i].getNotes() + "|" + dataArray[i].getDate();
	}

	saveToFile("dataList.txt", outputText, true);

	public void saveUserData(userData segment) {
		segment.getDate();
	}

}
