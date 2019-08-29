package db_Mysql;


import java.sql.*;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DButil {
	
	private static	Connection conn=null;
	private static PreparedStatement stsm=null;
	private static	ResultSet rs=null; 
	
	static {
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	
	}
	public static Connection getConnection() {

		String url= "jdbc:mysql://localhost/user?useSSL=false&useUnicode=true&characterEncoding=utf-8";
		String  username="root";
		String password= "root";
		
		try {
			conn =DriverManager.getConnection(url, username, password);
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		return conn;
	}

	public static int executeUpdate(String sql ,Object[] params) {
		
		int n=0;
		try {
			stsm=conn.prepareStatement(sql);
			if(params!=null) {
				for(int i=0;i<params.length;i++) {
					stsm.setObject(i+1, params[i]);
				}
			}
			n=stsm.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return n;
		
	}

	public static ResultSet executeQuery(String sql ,Object[] param)  {
			

			try {
				stsm=conn.prepareStatement(sql);
				if(param!=null) {
					for(int i=0;i<param.length;i++) {
						stsm.setObject(i+1, param[i]);
					}
				}
				rs=stsm.executeQuery();
			} catch (SQLException e) {
				
				e.printStackTrace();
			}
			
		return rs;
	}


	public static void close(ResultSet rs,PreparedStatement stsm,Connection conn) {

		try {
                if(rs!=null)rs.close();
				if(stsm!=null)stsm.close();
				if(conn!=null)conn.close();
			} catch (SQLException e) {

				e.printStackTrace();
			}

			
	}
public static void main(String[] args)  {
		
		Connection conn=DButil.getConnection();
		
		System.out.println("成功连接");
		
		DButil.close(null, null, conn);
		
		System.out.println("关闭连接");
		
	}


}
