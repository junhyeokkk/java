package test05;

public class Student {

	private String name;
	private String studentId;
	private String[] subjects;
	private int[] scores;
	private int subjectCount;
	public Student(String name, String studentId) {
		this.name = name;
		this.studentId = studentId;
		this.subjects = new String[10];
		this.scores = new int[10];
		this.subjectCount = 0;
	}


	public String getName() {
		return name;
	}

	public void enrollSubject(Subject subject) {
		subject.addStudent(this);
		subjects[subjectCount] = subject.getSubName();
		subjectCount++;
		System.out.println(name+" - "+subject.getSubName()+" 과목 신청 완료");

	}

	public void setScore(Subject subject, int score) {

		for(int i=0; i<subjects.length; i++) {
			if(subjects[i].equals(subject.getSubName())) {
				scores[i] = score;
				System.out.println(name+" - "+subject.getSubName()+" 점수 입력 완료");
				break;
			}
		}
	}
	public void printStudentInfo() {
		System.out.println("학생명 : "+ this.name);
		System.out.println("아이디 : "+ this.studentId);
		System.out.println("성적");
		for(int i=0; i<subjects.length; i++) {
			if(subjects[i] == null) {
				break;
			}else {
				System.out.println(" - "+subjects[i]+" : "+scores[i]);
			}
		}
	}

}
