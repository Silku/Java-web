package chapters10_2;

public class MemberHashSetTest {

	public static void main(String[] args) {
		MemberHashSet hs = new MemberHashSet();
		
		hs.addMember(new Member(1001, "±Ë¡ÿ¿œ"));
		hs.addMember(new Member(1002, "±Ë¡ÿ¿Ã"));
		hs.addMember(new Member(1003, "±Ë¡ÿªÔ"));
		hs.addMember(new Member(1004, "±Ë¡ÿªÁ"));
		
		hs.showAllMember();
		
		hs.addMember(new Member(1001,"±Ë¡ÿ¿œ"));
		hs.showAllMember();
	}

}
