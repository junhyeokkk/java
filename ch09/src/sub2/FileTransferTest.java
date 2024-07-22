package sub2;
/*
 * 날짜 : 2024/07/18
 * 이름 : 최준혁
 * 내용 : 파일 메서드를 이용한 파일 복사 실습하기
 */

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileTransferTest {
	public static void main(String[] args) {
		
		String source = "C:\\Users\\lotte4.DESKTOP-8N3GG4O\\Desktop\\workspace.zip";
		String target = "C:\\Users\\lotte4.DESKTOP-8N3GG4O\\Desktop\\workspace3.zip";
		
	
		try {
			//입력스트림 생성 및 파일연결
			FileInputStream fis = new FileInputStream(source);
			FileOutputStream fos =  new FileOutputStream(target);
			
			//파일 복사(메서드 이용)
			fis.transferTo(fos);
			
			//스트림 해제
			fis.close();
			fos.close();
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("프로그램 종료 ..");
	}
}
