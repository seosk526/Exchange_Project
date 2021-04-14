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
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy.MM.dd.HH:mm:ss");  // 현재시간 나타내는 클래스 활용
		Calendar cal = Calendar.getInstance();		
		String str = saveText;                  
		String str2 = sdf.format(cal.getTime()) + "\n";
		
		FileOutputStream outputStream = new FileOutputStream("C:\\Users\\강세영\\Desktop\\Currency_Test.txt", true);   // 해당 링크에 있는 Currency_Test.txt에 내용 출력
		byte[] strToBytes = str.getBytes();         // 출력하기 위해 byte 단위로 변환
		byte[] str2ToBytes = str2.getBytes(); 
		outputStream.write(strToBytes);		     // 각 변수 출력
		outputStream.write(str2ToBytes);
		outputStream.close();                               // FileOutputStream 종료
	}
}
      