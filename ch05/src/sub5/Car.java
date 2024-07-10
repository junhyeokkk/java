package sub5;

import java.util.Set;

//클래스 정의
public class Car {
	
	// 상속관계에서 자식클래스에서 참조할 수 있게 private -> protected 변경
	protected String name;
	protected String color;
	protected int speed;
	
	//클래스 변수(정적변수)
	public static int count;
	
	//생성자(Constructor) : 캡슐화된 클래스 속성을 초기화하는 메서드
	public Car(String name, String color, int speed) {
		this.name = name;
		this.color = color;
		this.speed = speed;	
		count++;
	}
	
	//클래스 메서드(정적 메서드)
	public static int getTotalCount() {
		return count;
	}
	
	//Getter, Setter : 캡슐화된 속성에 대한 추가적인 수정을 위한 메서드 
	public void setColor(String color) {
		this.color = color;
	}
	
	public String getColor() {
		return color;
	}
	
	//기능(멤버 메서드) 
	public void speedUp(int speed) {
		this.speed += speed;
	}
	
	public void speedDown(int speed) {
		this.speed -= speed;
	}
	
	public void show() {
		System.out.println("차량명 :" +this.name);
		System.out.println("차량색 :" +this.color);
		System.out.println("차량속도 :" +this.speed);
	}
}
