package chapters10_2;

public class MemberHashSetTest {

	public static void main(String[] args) {
		MemberHashSet hs = new MemberHashSet();
		
		hs.addMember(new Member(1001, "������"));
		hs.addMember(new Member(1002, "������"));
		hs.addMember(new Member(1003, "���ػ�"));
		hs.addMember(new Member(1004, "���ػ�"));
		
		hs.showAllMember();
		
		hs.addMember(new Member(1001,"������"));
		hs.showAllMember();
	}

}
