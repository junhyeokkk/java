package sub2;
/*
 * 날짜 : 2024/07/18
 * 이름 : 최준혁
 * 내용 : 바이트 배열을 이용한 버퍼 실습하기
 */

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteArrayBufferTest {
	public static void main(String[] args) {
		
		String source = "C:\\Users\\lotte4.DESKTOP-8N3GG4O\\Desktop\\workspace.zip";
		String target = "C:\\Users\\lotte4.DESKTOP-8N3GG4O\\Desktop\\workspace3.zip";
		
		//버퍼로 이용한 byte 배열
		byte[] buffer = new byte[1024]; //1KB
		
		try {
			//입력스트림 생성 및 파일연결
			FileInputStream fis = new FileInputStream(source);
			FileOutputStream fos =  new FileOutputStream(target);
			
			
			while(true) {
				
				//파일 읽기 (일반은 1byte buffer사용시 1KB씩 읽음)
				int data = fis.read(buffer);
				
				if(data == -1) {
					//더이상 읽을 파일 내용이 없을 경우
					break;
				}
				
				//파일 쓰기
				fos.write(buffer, 0, data);
			}
			
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
