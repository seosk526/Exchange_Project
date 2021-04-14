package ChangeMoney;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Calendar;

public class FileStringGetter {	
	private OutputClass outClass = null;
	
	public FileStringGetter() {
		outClass = new OutputClass();		
	}
	
	public void printSaveText(String saveText) throws Exception {	
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy.MM.dd.HH:mm:ss");
		Calendar cal = Calendar.getInstance();
		
		OutputStream out = new FileOutputStream("C:\\Users\\강세영\\Desktop\\Currency_Test.txt", true);
		String str = saveText;
		String str2 = sdf.format(cal.getTime()) + "\n";
		
		FileOutputStream outputStream = new FileOutputStream("C:\\Users\\강세영\\Desktop\\Currency_Test.txt", true);
		byte[] strToBytes = str.getBytes();
		byte[] str2ToBytes = str2.getBytes(); 
		outputStream.write(strToBytes);		
		outputStream.write(str2ToBytes);
		outputStream.close();
	}

	public static void main(String[] args) {
		/*
		 * InputStream in1 = new FileInputStream("C:\\Users\\강세영\\Desktop\\Main.txt");
		 * OutputStream out1 = new
		 * FileOutputStream("C:\\Users\\강세영\\Desktop\\Test_Main.txt");
		 * 
		 * long start = System.currentTimeMillis(); //현재시간, 실행시간 구하는 Method
		 * 
		 * try{ byte[] readBuffer = new byte[1024]; while (in1.read(readBuffer, 0,
		 * readBuffer.length) != -1) { //버퍼 크기만큼 읽을 때마다 출력 스트림에 써준다.
		 * out1.write(readBuffer); System.out.println(Arrays.toString(readBuffer)); } }
		 * catch (Exception e) { System.out.println("파일 입출력 에러!!" + e); }
		 * 
		 * long end = System.currentTimeMillis(); System.out.println(end - start);
		 * in1.close(); out1.close(); }
		 */
	}
}
      