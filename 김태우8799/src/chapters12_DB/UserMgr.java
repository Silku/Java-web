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
				
			}catch{
				
			}finally {
				
			}
			return flag;
		}
}
