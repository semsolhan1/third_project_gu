package com.java.restaurant.add;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.java.common.AppService;
import com.java.common.DatabaseConnection;
import com.java.view.StartUI;

public class RestaurantAdd implements AppService{

	private DatabaseConnection connection = DatabaseConnection.getInstance();

	private final RestaurantMenuType restaurantMenuType = new RestaurantMenuType();


	@Override
	public void start() {

		while(true) {
			System.out.println("\u001B[31;1;4;41;42;43;44;45;46m----------------------------------------------------\u001B[0m");
			System.out.println("### 음식점 추가 하기");
			System.out.print("식당이름: ");
			String resName = StartUI.inputString();
			String sql1 = "SELECT * FROM Restaurant WHERE restaurant_name = " + "'" + resName + "'";
			try(Connection conn = connection.getConnection();
					PreparedStatement pstmt = conn.prepareStatement(sql1);
					ResultSet rs = pstmt.executeQuery();) {

				int count = 0;
				if(rs.next()) {
					count++;
				}
				if(count != 0) {
					System.out.println("### 이미 존재하는 식당입니다.");
					break;
				}

			} catch (SQLException e) {
				e.printStackTrace();
			}

			System.out.print("식당의 메인 메뉴: ");
			String menuName = StartUI.inputString();
			System.out.print("메인 메뉴의 가격: ");
			int menuPrice = StartUI.inputInteger();
			System.out.print("식당 위치: ");
			String resRegion = StartUI.inputString();
			System.out.print("메뉴의 종류[1.한식,2.중식,3.양식,4.일식]: ");
			int menuType = StartUI.inputInteger();
			System.out.print("식당의 리뷰수: ");
			int resReview = StartUI.inputInteger();


			if(menuType == 1) { //한식
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

					break;


				} catch (SQLException e) {
					e.printStackTrace();
				}
				
			} else if(menuType == 2) { //중식
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

					break;


				} catch (SQLException e) {
					e.printStackTrace();
				}
			} else if(menuType == 3) { //양식
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

					break;


				} catch (SQLException e) {
					e.printStackTrace();
				}
			} else if(menuType == 4) { //일식
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

					break;


				} catch (SQLException e) {
					e.printStackTrace();
				}
			}





		}

	}








}
