package mentalHealth;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;

/**
 * BackEndTest is a temporary class created for the purpose of testing the functionality of our storage.
 * @author clayk
 *
 */
public class backEndTest {
	
	userData u1 = new userData(3,"Testing", 4);
	userData u2 = new userData(5,"This is a test", 53);
	userData u3 = new userData(8,"Good job!", 78);
	userData u4 = new userData(1,"???", 130);

	userSaveData test = new userSaveData();
	
	public static void main(String Args[]) throws IOException {
		backEndTest backEndTest = new backEndTest();
		backEndTest.saveTest();
		backEndTest.loadTest();
	}
	
	public void saveTest() throws IOException {
		test.saveUserData(u1);
		
		userSaveData.saveToFile();
		
		test.saveUserData(u2);
		
		userSaveData.saveToFile();

		test.saveUserData(u3);
		
		userSaveData.saveToFile();

		test.saveUserData(u4);
		
		userSaveData.saveToFile();
	}
	
	public void loadTest() throws FileNotFoundException {
		ArrayList<userData> storedList = new ArrayList<userData>(userLoadData.readFile("dataList.txt"));
		int test = storedList.get(0).getDate();
		String test2 = storedList.get(3).getNotes();
		int test3 = storedList.get(2).getRating();
		
		System.out.println(test);
		System.out.println(test2);
		System.out.println(test3);

	}
}
