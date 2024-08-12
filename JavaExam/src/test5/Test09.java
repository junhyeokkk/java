package test5;
enum Gender {
	MALE, FEMALE
}
class Man {
	public void print() {
		System.out.println("남자입니다.");
	}
}
class Woman {
	public void print() {
		System.out.println("여자입니다.");
	}
}
public class Test09 {
	public static void main(String[] args) {
		Object human1 = makeHuman(Gender.MALE);
		Object human2 = makeHuman(Gender.FEMALE);
		
		if(human1 instanceof Man) {
			Man man = (Man) human1;
			man.print();
		} 
		if(human2 instanceof  Woman woman) {
			woman.print();
		}
	}
	public static Object makeHuman(Gender gender) {
		if(gender == Gender.MALE) {
			return new Man();
		} else if (gender == Gender.FEMALE) {
			return new Woman();
		}
		return null;
	}
}
