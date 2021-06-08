package chapter1;

import java.util.Scanner;

public class StudentSUOP {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			// TODO Auto-generated method stub
			//1.중학교, 2. 고등학교, 3.대학교
			//학년
			//이름
			int [] schoolType = {1,2,3};
			int [] schoolYear = {1,2,3,4,5};
			String [][] schoolName = new String[3][2];
			String [][][] studentName = new String[3][2][5];
			Scanner sc = new Scanner(System.in);
			int schoolNameIndex = 0;
			int schoolTypeIndex = 0;
//			schoolName[schoolType[2][1]
			
			schoolName[0][0] ="대성 중학교";
			schoolName[0][1] ="부산 중학교";
			schoolName[1][0] ="대성 고등학교";
			schoolName[1][1] ="부산 고등학교";
			schoolName[2][0] ="대성 대학교";
			schoolName[2][1] ="부산 대학교";
			studentName[0][0][0] = "김준일";
			studentName[2][1][3] = "안대양";
			
			System.out.println("부산 대학교 학생을 모두 출력해주세요");
			
			
			
			for(int i = 0; i < schoolName.length; i++) {
				for(int j = 0; j < schoolName[0].length; j++) {
					if(schoolName[i][j].equals("부산대학교")) {
						schoolTypeIndex = i;
						schoolNameIndex = j;
					}
				}
			}
			for(int i = 0; i < studentName[0][0].length; i++) {
				if(studentName[schoolTypeIndex][schoolNameIndex][i] == null) {
					continue;
				}
				System.out.println("학교 종류 : " + schoolType[schoolTypeIndex] );
				System.out.println("대학교 이름: " + schoolName[schoolTypeIndex][schoolNameIndex] );
				System.out.println(studentName[schoolTypeIndex][schoolNameIndex][i]);
			}
			
			
					
			
		}

	
	}

