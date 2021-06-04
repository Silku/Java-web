package chapters12_DB;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class UserMgr {
		private DBConnectionMgr pool;
		private UserBeans uBeans = new UserBeans();
		
		public UserMgr() {
			pool = DBConnectionMgr.getInstance();
		}
		public boolean loginCheck(String id, String pwd) {
			Connection con = null;
			PreparedStatement pstmt = null;
			ResultSet rs = null;
			String sql = null;
			boolean flag = false;
			try {
				con = pool.getConnection();
				sql ="select count(user_id) from user where user_id = ? and user_pwd = ?";
				pstmt = con.prepareStatement(sql);
				pstmt.setString(1, id);
				pstmt.setString(2, pwd);
				rs = pstmt.executeQuery();
				if(rs.next() && rs.getInt(1) ==1){
					flag = true;
				}		
			}catch(Exception e ){
				e.printStackTrace();
			}finally {
				pool.freeConnection(con, pstmt, rs);
			}
			return flag;
		}
}
//next 다음커서로 넘어가라.
//Exception e 예외처리
//finally 들어온 데이터를 모두 끊어낸다.