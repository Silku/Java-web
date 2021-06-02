package chapters10_2;

import java.util.ArrayList;

public class MemberArrayList {
	private ArrayList<Member> arrayList;

	public MemberArrayList() {
		arrayList = new ArrayList<Member>();
	}

	public void addMember(Member m) {
		arrayList.add(m);
	}

	public boolean removeMember(int memberId) {
		for (int i = 0; i < arrayList.size(); i++) {
			Member m = arrayList.get(i);
			if(m.getMemberId()==memberId) {
				arrayList.remove(i);
				return true;
			}
		}
		System.out.println(memberId + "가 존재하지 않습니다.");
		return false;
	}

	public boolean modifyMember(int memberId, String memberName) {
		for(int i = 0; i < arrayList.size(); i++) {
				Member m = arrayList.get(i);	
			if(m.getMemberId() == memberId){
				m.setMemberName(memberName);
				return true;
			}
				
		}	
		System.out.println(memberId + "가 존재하지 않습니다.");
		return false;
	}
	
	public void showAllMember() {
		for (Member m : arrayList) {
			System.out.println(m);
		}
		// 위에 for문이 결국 이거랑 같다.
//		for(int i = 0; i < arrayList.size();i++) {  
//			Member m = arrayList.get(i);
//			System.out.println(m);
//		}

		System.out.println();
	}
}
