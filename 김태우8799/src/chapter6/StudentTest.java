package chapter6;


public class StudentTest {
	//Student jun , jun�̶�� ��ü�� ����;
	// jun = new Student(); �����ڸ� ���� ������ �ϸ� �ν��Ͻ��� �ȴ�.
	// 
	static void output(Student s) {
		System.out.println(s.studentID);
		System.out.println(s.studentName);
		System.out.println(s.grade);
		System.out.println(s.address);
	}
	
	
	public static void main(String[] args) {
		StudentTest st = new StudentTest(); //st��� �ν��Ͻ��� ������̴�.
		Student jun = new Student(); //������
		jun.studentID = 20210525;
		jun.studentName = "������";
		jun.grade = 80;
		jun.address = "�λ� ������";
		jun.test();
		
		Student jee = new Student(); 
		jee.studentID = 20210526;
		jee.studentName = "����ȣ";
		jee.grade = 90;
		jee.address = "�λ� ������";
		jun.test();
		
		st.output(jun);
		st.output(jee);
	
		

	}

}
