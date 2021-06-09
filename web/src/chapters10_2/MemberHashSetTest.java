package chapters10_2;

public class MemberHashSetTest {

	public static void main(String[] args) {
		MemberHashSet hs = new MemberHashSet();
		
		hs.addMember(new Member(1001, "김준일"));
		hs.addMember(new Member(1002, "안대양"));
		hs.addMember(new Member(1003, "최종원"));
		
		hs.showAllMember();
		
		hs.addMember(new Member(1001, "김준일"));
		hs.showAllMember();
		
		
		
	}

}
