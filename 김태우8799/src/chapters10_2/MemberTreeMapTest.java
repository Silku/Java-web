package chapters10_2;

public class MemberTreeMapTest {

	public static void main(String[] args) {
		MemberTreeMap tm = new MemberTreeMap();
		tm.addMember(new Member(1001, "������"));
		tm.addMember(new Member(1201, "������"));
		tm.addMember(new Member(1021, "���ػ�"));
		tm.addMember(new Member(1091, "���ػ�"));
		tm.addMember(new Member(1051, "���ؿ�"));
		tm.addMember(new Member(1051, "���ؿ�"));
		//���࿡ ��Ʈ������ �ϰ�ʹٸ� integer������ ��ȯ�� �ϰ� �ƽ�Ű�ڵ尪�� �����ؼ� �Ҽ� �ִ� ������ִ�.
		tm.showAllmember();
	}

}
