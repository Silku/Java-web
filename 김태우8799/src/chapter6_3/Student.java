package chapter6_3;
//static(����)�� ��Ÿ���� ����� , ��翵������ ���ٰ����Ѱ�
//STACK�� �޼ҵ��� ���������ִ�.
public class Student {
	public static int createCount = 0;
	//static���� �ع����� ��� �������� �����ع����� ���������� �������� ����. count�����ϴ¹������ �ذ��ϴ°�찡 �ִ� ?! 
	//private static int createCount = 0; ī��Ʈ �־ �̷��� �Ʒ� ��Ʃ��Ʈ �޼ҵ�(?)���ٰ� studentId += ++createCount; �̷���
	//static�� �ν��Ͻ��� �� ���� �Ǵ°���(?)
	private int studentId = 20210000;			//�й�
	private String studentName; //�̸�
	private int studentAge;			//����
	private String studentGrade;	//����
	
	public Student() {
		studentId += ++createCount;
		showCount();
	}
	
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public int getStudentAge() {
		return studentAge;
	}
	public void setStudentAge(int studentAge) {
		this.studentAge = studentAge;
	}
	public String getStudentGrade() {
		return studentGrade;
	}
	public void setStudentGrade(String studentGrade) {
		this.studentGrade = studentGrade;
	}
	
	public int showId() {
		return studentId;
	}
	
	public static int showCount() {
		return createCount;
	}
	
	
}
