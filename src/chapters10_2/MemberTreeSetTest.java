package chapters10_2;

public class MemberTreeSetTest {

	public static void main(String[] args) {
		MemberTreeSet ts = new MemberTreeSet();
		
		ts.addMember(new Member(1003, "������"));
		ts.addMember(new Member(1005, "����ȣ"));
		ts.addMember(new Member(1002, "���¿�"));
		ts.addMember(new Member(1001, "��ȿ��"));

		ts.showAllMember();
	}

}
