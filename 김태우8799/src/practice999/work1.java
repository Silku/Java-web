package practice999;

import java.util.Scanner;

//목표 : 숙제 목표 맞추기
public class work1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] schoolType = { "중학교", "고등학교", "대학교" }; // 1. 중학교, 2. 고등학교, 3. 대학교
		int[] schoolYear = { 1, 2, 3, 4, 5 }; // 학년
		String[][] schoolName = new String[3][2];
		String[][][] studentName = new String[3][2][5];
		int schoolTypeIndex = 0;
		int schoolNameIndex = 0;
		boolean mLoop = true;
		boolean sLoop = true;

		schoolName[0][0] = "대성 중학교";
		schoolName[0][1] = "부산 중학교";
		schoolName[1][0] = "대성 고등학교";
		schoolName[1][1] = "부산 고등학교";
		schoolName[2][0] = "부경 대학교";
		schoolName[2][1] = "부산 대학교";

		studentName[2][1][1] = "김준일";
		studentName[2][1][2] = "이영표";
		studentName[2][0][3] = "안대양";
		studentName[2][0][4] = "박지성";

		System.out.print("검색하고자 하는 학생이나 학교명을 입력하세요.");
		sc.nextLine();
		while (mLoop) {
			if (sc.nextLine().equals("부산 대학교")) {
				System.out.println("부산 대학교 학생을 모두 출력합니다.");

				for (int i = 0; i < schoolName.length; i++) {
					for (int j = 0; j < schoolName[0].length; j++) {
						if (schoolName[i][j].equals("부산 대학교")) {
							schoolTypeIndex = i;
							schoolNameIndex = j;
						}			
					}
				}
				for (int i = 0; i < studentName[0][0].length; i++) {
					if (studentName[schoolTypeIndex][schoolNameIndex][i] == null) {
						continue;
					}
					System.out.println("학교 종류: " + schoolType[schoolTypeIndex]);
					System.out.println("대학교 이름: " + schoolName[schoolTypeIndex][schoolNameIndex]);
					System.out.println(studentName[schoolTypeIndex][schoolNameIndex][i]);
				}

			} else if (sc.nextLine().equals("부경 대학교") || sc.nextLine().equals("박지성") || sc.nextLine().equals("안대양")) {
				System.out.println("부경 대학교 학생을 모두 출력합니다.");
				for (int i = 0; i < schoolName.length; i++) {
					for (int j = 0; j < schoolName[0].length; j++) {
						if (schoolName[i][j].equals("부경 대학교")) {
							schoolTypeIndex = i;
							schoolNameIndex = j;
						}
					}
				}
				for (int i = 0; i < studentName[0][0].length; i++) {
					if (studentName[schoolTypeIndex][schoolNameIndex][i] == null) {
						continue;
					}
					System.out.println("학교 종류: " + schoolType[schoolTypeIndex]);
					System.out.println("대학교 이름: " + schoolName[schoolTypeIndex][schoolNameIndex]);
					System.out.println(studentName[schoolTypeIndex][schoolNameIndex][i]);
				}

			} else {
				System.out.println("일치하는 자료가 존재하지 않습니다.");
			}
			mLoop = false;
		}
	}
	// 1. 학생 이름으로 찾기
	// 2. 학교 이름으로 찾기
	// 단 중복은 없어야함.

}