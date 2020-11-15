package cn.student.util;

import java.sql.DriverManager;
import com.mysql.jdbc.Connection;

public class baseDAO {
	//����
	private static String driver = "com.mysql.jdbc.Driver";
	//URL
	private static String url = "jdbc:mysql://127.0.0.1:3306/student";
	//�û���
	private static String user = "root";
	//����
	private static String psw  = "haroot"; 
	//���ݿ�����
    private Connection conn = null;
    //statement����
   public baseDAO() {
	   try {
		Class.forName(driver);
		this.conn = (Connection) DriverManager.getConnection(url,user,psw);
	} catch (Exception e) {
		
	}
   }
	 //ȡ��һ�����ݿ������
	public Connection getConnection() {
		return this.conn;
	}
	//���ݿ�Ĺر�
	public void close() {
		if(this.conn!=null) {
			try {
				this.conn.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
	
}
