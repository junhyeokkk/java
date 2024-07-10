package sub4;

public class Doctor extends Person {
	private String speciality;

	public Doctor(String name, int age, String speciality) {
		super(name, age);
		this.speciality = speciality;
	}
	
	public void work(String speciality) {
		super.introduce();
		System.out.println("저는 의사이며 전공은 "+speciality+" 입니다.");
	}
}
