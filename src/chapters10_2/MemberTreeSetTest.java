package chapters10_2;

public class MemberTreeSetTest {

	public static void main(String[] args) {
		MemberTreeSet ts = new MemberTreeSet();
		
		ts.addMember(new Member(1003, "김준일"));
		ts.addMember(new Member(1005, "박지호"));
		ts.addMember(new Member(1002, "김태우"));
		ts.addMember(new Member(1001, "손효현"));

		ts.showAllMember();
	}

}
