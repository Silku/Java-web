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
	//Collection���� add���µ� ���⼭ put ���°� Collection�� �������̽��� ��ӹ޾ҳ� �ƴϳ��� ����
	public boolean removeMember(int memberId) {
			if(tm.containsKey(memberId)) {
				tm.remove(memberId);
				return true;
			}
			System.out.println(memberId + "�� �������� �ʽ��ϴ�.");
			return false;
	}
	public void showAllmember() {
		Iterator<Integer> ir = tm.keySet().iterator();
		//key���� Set���·� �ٲߴϴ�. �׸��� ���� iterator ���·� ����������߰���.
		while(ir.hasNext()) {
			int key = ir.next();
			System.out.println(tm.get(key));
		}
		System.out.println();
	}
	
}
