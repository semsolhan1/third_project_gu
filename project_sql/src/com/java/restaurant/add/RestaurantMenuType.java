package com.java.restaurant.add;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.java.common.DatabaseConnection;

public class RestaurantMenuType {

	private DatabaseConnection connection = DatabaseConnection.getInstance();

	public void menuTypeKo(int resReview, String resName, String menuName, int menuPrice, String resRegion) {

		String sql = "INSERT INTO Restaurant "
				+ "VALUES(SEQ_Restaurant_restaurant_id.NEXTVAL, ?, ?, ?, ?)";

		String sqlK = "INSERT INTO Ko_Restaurant_review "
				+ "VALUES(SEQ_Ko_Restaurant_Review_ko_id.NEXTVAL,SEQ_Restaurant_restaurant_id.CURRVAL,?)";


		try {

			Connection conn = connection.getConnection();
			PreparedStatement pstmt = conn.prepareStatement(sql);

			conn.setAutoCommit(false);

			pstmt.setString(1, resName);
			pstmt.setString(2, menuName);
			pstmt.setInt(3, menuPrice);
			pstmt.setString(4, resRegion);

			if(pstmt.executeUpdate() == 1) {
				System.out.printf("\n### [%s] 식당이 신규 등록되었습니다.\n", resName);
			} else {
				System.out.println("새로운 식당 등록 실패!");
			}

			pstmt = conn.prepareStatement(sqlK);
			pstmt.setInt(1, resReview);

			if(pstmt.executeUpdate() == 1) {
				System.out.println("메뉴 타입 설정 완료!");
				conn.commit();
			} else {
				System.out.println("메뉴 타입 설정 실패!");
				conn.rollback();
			}

			


		} catch (SQLException e) {
			e.printStackTrace();
		}


	}

	public void menuTypeCh(int resReview, String resName, String menuName, int menuPrice, String resRegion) {

		String sql = "INSERT INTO Restaurant "
				+ "VALUES(SEQ_Restaurant_restaurant_id.NEXTVAL, ?, ?, ?, ?)";

		String sqlK = "INSERT INTO Ch_Restaurant_Review "
				+ "VALUES(SEQ_Ch_Restaurant_Review_ch_id.NEXTVAL,SEQ_Restaurant_restaurant_id.CURRVAL,?)";


		try {

			Connection conn = connection.getConnection();
			PreparedStatement pstmt = conn.prepareStatement(sql);

			conn.setAutoCommit(false);

			pstmt.setString(1, resName);
			pstmt.setString(2, menuName);
			pstmt.setInt(3, menuPrice);
			pstmt.setString(4, resRegion);

			if(pstmt.executeUpdate() == 1) {
				System.out.printf("\n### [%s] 식당이 신규 등록되었습니다.\n", resName);
				//						break;
			} else {
				System.out.println("새로운 식당 등록 실패!");
				//						break;
			}

			pstmt = conn.prepareStatement(sqlK);
			pstmt.setInt(1, resReview);

			if(pstmt.executeUpdate() == 1) {
				System.out.println("메뉴 타입 설정 완료!");
				conn.commit();
			} else {
				System.out.println("메뉴 타입 설정 실패!");
				conn.rollback();
			}


		} catch (SQLException e) {
			e.printStackTrace();
		}


	}

	public void menuTypeJa(int resReview, String resName, String menuName, int menuPrice, String resRegion) {

		String sql = "INSERT INTO Restaurant "
				+ "VALUES(SEQ_Restaurant_restaurant_id.NEXTVAL, ?, ?, ?, ?)";

		String sqlK = "INSERT INTO We_Restaurant_Review "
				+ "VALUES(SEQ_We_Restaurant_Review_we_id.NEXTVAL,SEQ_Restaurant_restaurant_id.CURRVAL,?)";


		try {

			Connection conn = connection.getConnection();
			PreparedStatement pstmt = conn.prepareStatement(sql);

			conn.setAutoCommit(false);

			pstmt.setString(1, resName);
			pstmt.setString(2, menuName);
			pstmt.setInt(3, menuPrice);
			pstmt.setString(4, resRegion);

			if(pstmt.executeUpdate() == 1) {
				System.out.printf("\n### [%s] 식당이 신규 등록되었습니다.\n", resName);
				//						break;
			} else {
				System.out.println("새로운 식당 등록 실패!");
				//						break;
			}

			pstmt = conn.prepareStatement(sqlK);
			pstmt.setInt(1, resReview);

			if(pstmt.executeUpdate() == 1) {
				System.out.println("메뉴 타입 설정 완료!");
				conn.commit();
			} else {
				System.out.println("메뉴 타입 설정 실패!");
				conn.rollback();
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}


	}

	public void menuTypeWe(int resReview, String resName, String menuName, int menuPrice, String resRegion) {

		String sql = "INSERT INTO Restaurant "
				+ "VALUES(SEQ_Restaurant_restaurant_id.NEXTVAL, ?, ?, ?, ?)";

		String sqlK = "INSERT INTO Ja_restaurant_review "
				+ "VALUES(SEQ_Ja_Restaurant_Review_ja_id.NEXTVAL,SEQ_Restaurant_restaurant_id.CURRVAL,?)";


		try {

			Connection conn = connection.getConnection();
			PreparedStatement pstmt = conn.prepareStatement(sql);

			conn.setAutoCommit(false);

			pstmt.setString(1, resName);
			pstmt.setString(2, menuName);
			pstmt.setInt(3, menuPrice);
			pstmt.setString(4, resRegion);

			if(pstmt.executeUpdate() == 1) {
				System.out.printf("\n### [%s] 식당이 신규 등록되었습니다.\n", resName);
				//						break;
			} else {
				System.out.println("새로운 식당 등록 실패!");
				//						break;
			}

			pstmt = conn.prepareStatement(sqlK);
			pstmt.setInt(1, resReview);

			if(pstmt.executeUpdate() == 1) {
				System.out.println("메뉴 타입 설정 완료!");
				conn.commit();
			} else {
				System.out.println("메뉴 타입 설정 실패!");
				conn.rollback();
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}


	}


}
