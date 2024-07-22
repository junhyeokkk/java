package sub7;
/*
 * 날짜 : 2024/07/10
 * 이름 : 최준혁
 * 내용 : 자바 추상클래스 연습하기
 */
public class AbstractTest {
	public static void main(String[] args) {
		
		// 추상클래스는 객체 생성 x
		// Animal animal = new Animal();
		
		Animal tiger = new Tiger();
		Animal eagle = new Eagle();
		Animal shark = new Shark();
		
		tiger.move();
		tiger.hunt();
		
		eagle.move();
		eagle.hunt();
		
		shark.move();
		shark.hunt();
	}
}
