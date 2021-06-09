package chapter4;

import java.util.Scanner;

public class ArrayEx7_Student {
	// 학생 이름으로 정보 찾기
	// 대학 이름으로 정보 찾기
	// 학교 종류로 정보 찾기

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean mloop = true;
		
		String [] schoolType = {"중학교", "고등학교", "대학교"}; //1. 중학교, 2. 고등학교, 3. 대학교
		int[] schoolYear = {1,2,3,4,5}; //학년
		String[][] schoolName = new String[3][2];
		String[][][] studentName = new String[3][2][5];
		schoolName[0][0] = "대성중학교";
		schoolName[0][1] = "부산중학교";
		schoolName[1][0] = "대성고등학교";
		schoolName[1][1] = "부산고등학교";
		schoolName[2][0] = "부경대학교";
		schoolName[2][1] = "부산대학교";
		
		studentName[0][0][0] = "김준일";
		studentName[0][0][1] = "권혁인";
		studentName[0][1][0] = "김상우";
		studentName[0][1][2] = "김태우";
		studentName[1][0][0] = "박용수";
		studentName[1][0][1] = "박지호";
		studentName[1][1][1] = "배현준";
		studentName[1][1][2] = "손효현";
		studentName[2][0][0] = "안대양";
		studentName[2][0][1] = "유정무";
		studentName[2][1][2] = "이은수";
		studentName[2][1][3] = "최종원";
		
		int typeIndex = 0; //학교 종류
		int yearIndex = 0; //학년
		int schoolIndex = 0; //학교명
		
		while(mloop) {
			System.out.println("학교 정보 시스템");
			System.out.println("--------------------------");
			System.out.println("1. 학교 이름으로 정보 검색");
			System.out.println("2. 학생 이름으로 정보 검색");
			System.out.println("3. 학교 종류로 정보 검색");
			System.out.println("q. 프로그램 종료");
			System.out.println("--------------------------");
			System.out.print("명령을 선택해 주세요: ");
			String select = sc.nextLine();
			System.out.println();
			
			if(select.equals("1")) {
				System.out.print("학교 명을 입력해 주세요: ");
				String name = sc.nextLine(); //부산대학교
				for(int i = 0; i < schoolName.length; i++) {
					for(int j = 0; j < schoolName[0].length; j++) {
						if(schoolName[i][j].equals(name)) {
							typeIndex = i;
							schoolIndex = j;
						}
					}
				}
				System.out.println(schoolName[typeIndex][schoolIndex] + "의 모든 학생 정보");
				for(int i = 0; i < studentName[typeIndex][schoolIndex].length; i++) {
					if(studentName[typeIndex][schoolIndex][i] == null) {
						continue;
					}
					System.out.println("학년: " + schoolYear[i]);
					System.out.println("이름: " + studentName[typeIndex][schoolIndex][i]);
				}
				System.out.println();
				
			}else if(select.equals("2")) {
				System.out.print("학생 이름을 입력해 주세요: ");
				String name = sc.nextLine(); //김준일
				for(int i = 0; i < studentName.length; i++) {
					for(int j = 0; j < studentName[0].length; j++) {
						for(int k = 0; k < studentName[0][0].length; k++) {
							if(studentName[i][j][k] != null ? studentName[i][j][k].equals(name) : false) {
								System.out.println("학교 종류: " + schoolType[i]);
								System.out.println("학교명: " + schoolName[i][j]);
								System.out.println("학년: " + schoolYear[k]);
								System.out.println("이름: " + studentName[i][j][k]);
								break;
							}
						}
					}
				}
				
			}else if(select.equals("3")) {
				System.out.print("학교 종류를 입력해 주세요: ");
				String type = sc.nextLine(); //김준일
				
				for(int i = 0; i < schoolType.length; i++) {
					if(schoolType[i].equals(type)) {
						typeIndex = i;
					}
				}
				System.out.println("학교 종류: " + type);
				System.out.println();
				for(int i = 0; i < studentName[typeIndex].length; i++) {
					for(int j = 0; j < studentName[typeIndex][0].length; j++) {
						if(studentName[typeIndex][i][j] == null) {
							continue;
						}
						System.out.println("학교명: " + schoolName[typeIndex][i]);
						System.out.println("학년: " + schoolYear[j]);
						System.out.println("이름: " + studentName[typeIndex][i][j]);
					}
				}
				System.out.println();
		
				
			}else if(select.equals("q")) {
				
			}else {
				System.out.println("<입력오류!> 1, 2, 3, q 중 하나만 입력 가능.\n");
			}
		}
		
		
	}
	
	// 1. 학생 이름으로 찾기
	// 2. 학교 이름으로 찾기
	// 단 중복은 없어야함.

}
