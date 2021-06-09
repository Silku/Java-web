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
	
	public boolean removeMember(int memberId) {
		if(tm.containsKey(memberId)) {
			tm.remove(memberId);
			return true;
		}
		System.out.println(memberId + "가 존재하지 않습니다.");
		return false;
	}
	
	public void showAllMember() {
		Iterator<Integer> ir = tm.keySet().iterator();
		while(ir.hasNext()) {
			int key = ir.next();
			System.out.println(tm.get(key));
		}
		System.out.println();
	}
}
