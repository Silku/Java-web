package chapters12_DB;

public class LoginTest {

	public static void main(String[] args) {
		UserMgr userMgr = new UserMgr();
		boolean flag = userMgr.loginCheck("junil", "1234");
		if(flag == true) {
			System.out.println("로그인 성공");
		}else {
			System.out.println("로그인 실패");
		}	

	}

}
