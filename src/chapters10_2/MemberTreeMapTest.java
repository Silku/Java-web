package chapters10_2;

public class MemberTreeMapTest {

	public static void main(String[] args) {
		MemberTreeMap tm = new MemberTreeMap();
		
		tm.addMember(new Member(1005, "±èÁØÀÏ"));
		tm.addMember(new Member(1008, "±èÁØÀÏ"));
		tm.addMember(new Member(1002, "±èÁØÀÏ"));
		tm.addMember(new Member(1004, "±èÁØÀÏ"));
		tm.addMember(new Member(1001, "±èÁØÀÏ"));
		tm.addMember(new Member(1001, "¹ÚÁöÈ£"));
		
		tm.showAllMember();

	}

}
