package chapter1;

public class ArrayEx7_Student{
	public static void main(String[] args) {
		String [] schoolType = {"중학교", "고등학교", "대학교"}; //1. 중학교, 2. 고등학교, 3. 대학교
		int[] schoolYear = {1,2,3,4,5}; //학년
		String[][] schoolName = new String[3][2];
		String[][][] studentName = new String[3][2][5];
		int schoolTypeIndex = 0;
		int schoolNameIndex = 0;
		
		schoolName[0][0] = "대성 중학교";
		schoolName[0][1] = "부산 중학교";
		schoolName[1][0] = "대성 고등학교";
		schoolName[1][1] = "부산 고등학교";
		schoolName[2][0] = "부경 대학교";
		schoolName[2][1] = "부산 대학교";
		studentName[2][1][1] = "김준일";
		studentName[2][1][3] = "안대양";
		
		System.out.println("부산 대학교 학생을 모두 출력해 주세요.");
		
		for(int i = 0; i < schoolName.length; i++) {
			for(int j = 0; j < schoolName[0].length; j++) {
				if(schoolName[i][j].equals("부산 대학교")) {
					schoolTypeIndex = i;
					schoolNameIndex = j;
				}
			}
		}
		for(int i = 0; i < studentName[0][0].length; i++) {
			if(studentName[schoolTypeIndex][schoolNameIndex][i] == null) {
				continue;
			}
			System.out.println("학교 종류: " + schoolType[schoolTypeIndex]);
			System.out.println("대학교 이름: " + schoolName[schoolTypeIndex][schoolNameIndex]);
			System.out.println(studentName[schoolTypeIndex][schoolNameIndex][i]);
		}
		
	}
	
	// 1. 학생 이름으로 찾기
	// 2. 학교 이름으로 찾기
	// 단 중복은 없어야함.

}