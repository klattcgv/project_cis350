package mentalHealth;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class userSaveData { //date,rating,notes
	
	userData [] userMonth = new userData[30];
	
	public void saveUserData(userData segment) {
		segment.getDate();
	}
	
}
