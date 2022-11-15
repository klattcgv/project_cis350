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
	
	userData u1 = new userData(4,"Testing", 3);
	userData u2 = new userData(53,"This is a test", 5);
	userData u3 = new userData(78,"Good job!", 8);
	userData u4 = new userData(130,"???", 1);

	userSaveData test = new userSaveData();
	
	public static void main(String Args[]) throws IOException {
		backEndTest backEndTest = new backEndTest();
		backEndTest.saveTest();
		backEndTest.loadTest();
	}
	
	public void saveTest() throws IOException {
		test.saveUserData(u1);
		test.saveUserData(u2);
		test.saveUserData(u3);
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
