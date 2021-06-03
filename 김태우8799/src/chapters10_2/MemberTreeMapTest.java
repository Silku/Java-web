package chapters10_2;

public class MemberTreeMapTest {

	public static void main(String[] args) {
		MemberTreeMap tm = new MemberTreeMap();
		tm.addMember(new Member(1001, "김준일"));
		tm.addMember(new Member(1201, "김준이"));
		tm.addMember(new Member(1021, "김준삼"));
		tm.addMember(new Member(1091, "김준사"));
		tm.addMember(new Member(1051, "김준오"));
		tm.addMember(new Member(1051, "박준오"));
		//만약에 스트링으로 하고싶다면 integer형으로 변환을 하고 아스키코드값을 대입해서 할수 있는 방법이있다.
		tm.showAllmember();
	}

}
