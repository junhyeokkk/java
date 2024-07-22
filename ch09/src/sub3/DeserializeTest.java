package sub3;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/*
 * 날짜 : 2024/07/18
 * 이름 : 최준혁
 * 내용 : 역직렬화 실습하기
 */
public class DeserializeTest {
	public static void main(String[] args) {
		
		
		String path = "C:\\Users\\lotte4.DESKTOP-8N3GG4O\\Desktop\\apple.txt";
		
		try {
			FileInputStream fis = new FileInputStream(path);
			
			//직렬화 객체를 내보내기 위한 보조스트림
			ObjectInputStream ois = new ObjectInputStream(fis);
			
			//객체 역직렬화
			Apple apple = (Apple) ois.readObject();
			apple.show();
		
			//스트림 해제
			ois.close();
			fis.close();
			
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		System.out.println("프로그램 종료..");
	}
}
