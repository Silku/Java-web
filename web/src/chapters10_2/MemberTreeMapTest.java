package chapters10_2;

public class MemberTreeMapTest {

	public static void main(String[] args) {
		MemberTreeMap tm = new MemberTreeMap();
		
		tm.addMember(new Member(1005, "������"));
		tm.addMember(new Member(1008, "������"));
		tm.addMember(new Member(1002, "������"));
		tm.addMember(new Member(1004, "������"));
		tm.addMember(new Member(1001, "������"));
		tm.addMember(new Member(1001, "����ȣ"));
		
		tm.showAllMember();

	}

}
