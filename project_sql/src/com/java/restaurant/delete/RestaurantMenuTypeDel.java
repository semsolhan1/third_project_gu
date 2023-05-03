package com.java.restaurant.delete;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import com.java.common.DatabaseConnection;

public class RestaurantMenuTypeDel {
	private DatabaseConnection connection = DatabaseConnection.getInstance();
	
	public void menuTypeKo(String resName) {
		
		String sqld = "DELETE FROM ko_restaurant_review "
				+ "WHERE restaurant_id = (SELECT restaurant_id "
				+ "FROM restaurant "
				+ "WHERE restaurant_name = " + "'" + resName + "'" + ")";

		String sql = "DELETE FROM Restaurant WHERE restaurant_name = " + "'" + resName + "'";

		try {

			Connection conn = connection.getConnection();
			PreparedStatement pstmt = conn.prepareStatement(sqld);

			conn.setAutoCommit(false);

			if(pstmt.executeUpdate() == 1) {
				System.out.printf("\n### [%s] 식당이 삭제되는 중입니다.\n", resName);
			} else {
				System.out.println("식당 삭제 실패1!");
			}

			pstmt = conn.prepareStatement(sql);


			if(pstmt.executeUpdate() == 1) {
				System.out.println("식당 삭제 완료!");
				conn.commit();
			} else {
				System.out.println("식당 삭제 실패2!");
				conn.rollback();
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	public void menuTypeCh(String resName) {
		String sqld = "DELETE FROM Ch_restaurant_review "
				+ "WHERE restaurant_id = (SELECT restaurant_id "
				+ "FROM restaurant "
				+ "WHERE restaurant_name = " + "'" + resName + "'" + ")";

		String sql = "DELETE FROM Restaurant WHERE restaurant_name = " + "'" + resName + "'";

		try {

			Connection conn = connection.getConnection();
			PreparedStatement pstmt = conn.prepareStatement(sqld);

			conn.setAutoCommit(false);

			if(pstmt.executeUpdate() == 1) {
				System.out.printf("\n### [%s] 식당이 삭제되는 중입니다.\n", resName);
			} else {
				System.out.println("식당 삭제 실패!");
			}

			pstmt = conn.prepareStatement(sql);


			if(pstmt.executeUpdate() == 1) {
				System.out.println("식당 삭제 완료!");
				conn.commit();
			} else {
				System.out.println("식당 삭제 실패2!");
				conn.rollback();
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void menuTypeWe(String resName) {
		String sqld = "DELETE FROM We_restaurant_review "
				+ "WHERE restaurant_id = (SELECT restaurant_id "
				+ "FROM restaurant "
				+ "WHERE restaurant_name = " + "'" + resName + "'" + ")";

		String sql = "DELETE FROM Restaurant WHERE restaurant_name = " + "'" + resName + "'";

		try {

			Connection conn = connection.getConnection();
			PreparedStatement pstmt = conn.prepareStatement(sqld);

			conn.setAutoCommit(false);

			if(pstmt.executeUpdate() == 1) {
				System.out.printf("\n### [%s] 식당이 삭제되는 중입니다.\n", resName);
			} else {
				System.out.println("식당 삭제 실패!");
			}

			pstmt = conn.prepareStatement(sql);


			if(pstmt.executeUpdate() == 1) {
				System.out.println("식당 삭제 완료!");
				conn.commit();
			} else {
				System.out.println("식당 삭제 실패!");
				conn.rollback();
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public void menuTypeJa(String resName) {
		String sqld = "DELETE FROM Ja_restaurant_review "
				+ "WHERE restaurant_id = (SELECT restaurant_id "
				+ "FROM restaurant "
				+ "WHERE restaurant_name = " + "'" + resName + "'" + ")";

		String sql = "DELETE FROM Restaurant WHERE restaurant_name = " + "'" + resName + "'";

		try {

			Connection conn = connection.getConnection();
			PreparedStatement pstmt = conn.prepareStatement(sqld);

			conn.setAutoCommit(false);

			if(pstmt.executeUpdate() == 1) {
				System.out.printf("\n### [%s] 식당이 삭제되는 중입니다.\n", resName);
			} else {
				System.out.println("식당 삭제 실패!");
			}

			pstmt = conn.prepareStatement(sql);


			if(pstmt.executeUpdate() == 1) {
				System.out.println("식당 삭제 완료!");
				conn.commit();
			} else {
				System.out.println("식당 삭제 실패!");
				conn.rollback();
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
		
		
		
		
}
