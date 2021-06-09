package chapter6;

public class PrivateEx2Test {

	public static void main(String[] args) {
		PrivateEx2 pe = new PrivateEx2(20210526);
		PrivateEx2 pe2 = new PrivateEx2();
		
		//pe.studentId = 20210526;
		System.out.println(pe.getStudentId());
	}

}
