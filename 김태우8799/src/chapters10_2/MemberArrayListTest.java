package chapters10_2;

import java.util.Scanner;

public class MemberArrayListTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		MemberArrayList aList = new MemberArrayList();
		for (int i = 0; i < 2; i++) {
			System.out.print("회원 아이디 : ");
			int id = Integer.parseInt(sc.nextLine());
			System.out.print("회원 이름 : ");
			String name = sc.nextLine();
			
			
			aList.addMember(new Member(id, name));
		}
		aList.showAllMember();
		
		System.out.println("수정하고자하는 회원의 아이디를 입력하세요 : ");
		int id = Integer.parseInt(sc.nextLine());
		System.out.println("새로 수정할 회원이름을 입력하세요 : ");
		String name = sc.nextLine();
		aList.modifyMember(id, name);
		aList.showAllMember();
		
		System.out.println("삭제할 회원의 아이디를 입력하세요 :");
		id = Integer.parseInt(sc.nextLine());
		if(aList.removeMember(id) == true){
				System.out.println("회원삭제가 성공적으로 이루어졌습니다.");
		}else {
				System.out.println("회원 삭제 실패!");
		}
		aList.showAllMember();
	}
	
}
