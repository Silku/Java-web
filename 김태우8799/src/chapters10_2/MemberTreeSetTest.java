package chapters10_2;

public class MemberTreeSetTest {

	public static void main(String[] args) {
		MemberTreeSet ts = new MemberTreeSet();
		
		ts.addMember(new Member(1110, "������"));
		ts.addMember(new Member(1600, "������"));
		ts.addMember(new Member(1511, "���ػ�"));
		ts.addMember(new Member(1234, "���ػ�"));
		
		ts.showAllMember();
	}

}
