package com.IsteMySQL.Util;

import java.sql.Connection;
import java.sql.DriverManager;

public class VeritabaniUtil {
	static Connection conn=null;
	public static Connection Baglan() {
		try {
			conn=DriverManager.getConnection("jdbc:mysql://localhost/projemdb", "root", "mysql");
			return conn;
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage().toString());
			return null;
		}
}
}
