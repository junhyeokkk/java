package test05;

public class Subject {
	private String subName;
	private String[] students;
	private int studentCount;
	public Subject(String subName) {
		this.subName = subName;
		this.students =  new String[10];
		this.studentCount = 0;
	}

	public String getSubName() {
		return subName;
	}

	public void addStudent(Student student) {

		for(int i=0; i<students.length; i++) {
			if(students[i] == null) {
				students[i] = student.getName();
				break;
			}
		}
	}

	public void printSubjectInfo() {

		System.out.println(this.subName);
		System.out.print("수강생 : ");
		for(int i=0; i<students.length; i++) {
			if(students[i] == null) {
				System.out.println();
				break;
			}else {
				System.out.print(students[i]+", ");
			}
		}
	}

}
