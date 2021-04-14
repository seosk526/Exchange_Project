package ChangeMoney;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class FileOutputClass {
	private OutputStream fileOut = null;
	
	public FileOutputClass() {
		try {
			fileOut = new FileOutputStream("C:\\Users\\강세영\\Desktop\\Test_Stream.txt");			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	public void saveToFile(String savetext) {
		try {
			fileOut.write(savetext.getBytes());
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
