package chapters10_2;

import java.util.Iterator;
import java.util.TreeMap;

public class MemberTreeMap {
	private TreeMap<Integer, Member> tm;
	
	public MemberTreeMap() {
		tm = new TreeMap<Integer, Member>();
	}
	
	public void addMember(Member m) {
		tm.put(m.getMemberId(), m); 
	}
	//Collection에서 add쓰는데 여기서 put 쓰는건 Collection의 인터페이스를 상속받았냐 아니냐의 차이
	public boolean removeMember(int memberId) {
			if(tm.containsKey(memberId)) {
				tm.remove(memberId);
				return true;
			}
			System.out.println(memberId + "가 존재하지 않습니다.");
			return false;
	}
	public void showAllmember() {
		Iterator<Integer> ir = tm.keySet().iterator();
		//key값을 Set형태로 바꿉니다. 그리고 나서 iterator 형태로 정렬을해줘야겠죠.
		while(ir.hasNext()) {
			int key = ir.next();
			System.out.println(tm.get(key));
		}
		System.out.println();
	}
	
}
