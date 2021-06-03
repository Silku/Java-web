package chapters10_2;

public class MemberTreeSetTest {

	public static void main(String[] args) {
		MemberTreeSet ts = new MemberTreeSet();
		
		ts.addMember(new Member(1110, "±Ë¡ÿ¿œ"));
		ts.addMember(new Member(1600, "±Ë¡ÿ¿Ã"));
		ts.addMember(new Member(1511, "±Ë¡ÿªÔ"));
		ts.addMember(new Member(1234, "±Ë¡ÿªÁ"));
		
		ts.showAllMember();
	}

}
