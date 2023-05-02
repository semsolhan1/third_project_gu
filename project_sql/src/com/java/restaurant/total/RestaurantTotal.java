package com.java.restaurant.total;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.java.common.DatabaseConnection;
import com.java.restaurant.repository.Restaurantrepository;
import com.java.view.StartUI;

public class RestaurantTotal {
	
	private DatabaseConnection connection = DatabaseConnection.getInstance();
	
	private final Restaurantrepository restaurantrepository 
	= new Restaurantrepository();
	
	public void totalrestauranttotal(int totalnum) {
		
		while(true) {
		
			switch(totalnum) {
		
		case 1:
			String sql = "SELECT r.restaurant_id, r.restaurant_name, r.main_menu, r.price, r.address, COALESCE(k.review_rating, j.review_rating, c.review_rating, w.review_rating) as review_rating FROM Restaurant r LEFT JOIN ko_restaurant_review k ON k.restaurant_id = r.restaurant_id LEFT JOIN ja_restaurant_review j ON j.restaurant_id = r.restaurant_id LEFT JOIN ch_restaurant_review c ON c.restaurant_id = r.restaurant_id LEFT JOIN we_restaurant_review w ON w.restaurant_id = r.restaurant_id WHERE r.restaurant_name=?";
			System.out.print("이름을 입력해주세요:");
			String namevalue= StartUI.inputString();
			//				Connection conn = null;
			//				PreparedStatement pstmt = null;
							ResultSet rs = null; //SELECT 문에서만 사용하는 객체.


			try(Connection conn = connection.getConnection();
					PreparedStatement pstmt = conn.prepareStatement(sql);
					){
				pstmt.setString(1, namevalue);
				rs = pstmt.executeQuery();
				int count = 0;
				while(rs.next()) {

//					int restaurant_id = rs.getInt("restaurant_id"); //괄호 안에 컬럼명
					String restaurant_name = rs.getString("restaurant_name"); 
					String main_menu = rs.getString("main_menu"); 
					int price = rs.getInt("price");
					String  address = rs.getString("address"); 
					int review_rating = rs.getInt("review_rating");
					//LocalDateTime -> Timestamp: Timestamp.valueOf(LocalDateTime);
					//Timestamp -> LocalDateTime: Timestamp.toLocalDateTime();

					count++;
					System.out.println("------------------------");
					System.out.printf("# 가게 이름: %s\n# 가게 메뉴: %s\n# 가격: %d원\n# 가게 주소: %s\n# 리뷰 수: %d\n", restaurant_name, main_menu, price, address, review_rating);
					System.out.println("------------------------");

				}
				System.out.println("조회된 행의 개수: " + count + "개");
				
			} catch (SQLException e) {
				e.printStackTrace();
			} finally {
				try {
					rs.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}



			return;
			
		case 2:
			System.out.println("첫번째 조건을 입력해주세요. ");
			System.out.print("ex)한식,중식,양식,일식 : ");
			String namevalue2= StartUI.inputString();
			System.out.println("두번째 조건을 입력해주세요. ");
			System.out.print("ex) 가격을 지정해주세요(지정한 가격 이하로 검색) : ");
			int namevalue3= StartUI.inputInteger();
			System.out.println("세번째 조건을 입력해주세요. ");
			System.out.print("ex) 지역을 지정해주세요(서울,인천,경기도,강원도,충청도,경상도,전라도) : ");
			String namevalue4= StartUI.inputString();
			//				Connection conn = null;
			//				PreparedStatement pstmt = null;
			ResultSet rs2 = null; //SELECT 문에서만 사용하는 객체.
			
			
			if(namevalue2.equals("한식")) {
				
				String sql2 = "SELECT r.restaurant_id, r.restaurant_name, r.main_menu, r.price, r.address, k.review_rating FROM Restaurant r LEFT JOIN ko_restaurant_review k ON k.restaurant_id = r.restaurant_id WHERE r.price <= ? and r.address = ?";
				try(Connection conn = connection.getConnection();
						PreparedStatement pstmt = conn.prepareStatement(sql2);
						){
					pstmt.setInt(1, namevalue3);
					pstmt.setString(2, namevalue4);
					
					rs2 = pstmt.executeQuery();
					int count = 0;
					while(rs2.next()) {

//						int restaurant_id = rs2.getInt("restaurant_id"); //괄호 안에 컬럼명
						String restaurant_name = rs2.getString("restaurant_name"); 
						String main_menu = rs2.getString("main_menu"); 
						int price = rs2.getInt("price");
						String  address = rs2.getString("address"); 
						int review_rating = rs2.getInt("review_rating");
						//LocalDateTime -> Timestamp: Timestamp.valueOf(LocalDateTime);
						//Timestamp -> LocalDateTime: Timestamp.toLocalDateTime();

						count++;
						System.out.println("------------------------");
						System.out.printf("# 가게 이름: %s\n# 가게 메뉴: %s\n# 가격: %d원\n# 가게 주소: %s\n# 리뷰 수: %d\n", restaurant_name, main_menu, price, address, review_rating);
						System.out.println("------------------------");

					}
					System.out.println("조회된 행의 개수: " + count + "개");
					
				} catch (SQLException e) {
					e.printStackTrace();
				} finally {
					try {
						rs2.close();
					} catch (SQLException e) {
						e.printStackTrace();
					}
				}
				
				
				
				
				return;
			} else if(namevalue2.equals("일식")) {
				
				String sql2 = "SELECT r.restaurant_id, r.restaurant_name, r.main_menu, r.price, r.address, j.review_rating FROM Restaurant r LEFT JOIN ja_restaurant_review j ON j.restaurant_id = r.restaurant_id WHERE r.price <= ? and r.address = ?";
				try(Connection conn = connection.getConnection();
						PreparedStatement pstmt = conn.prepareStatement(sql2);
						){
					pstmt.setInt(1, namevalue3);
					pstmt.setString(2, namevalue4);
					
					rs2 = pstmt.executeQuery();
					int count = 0;
					while(rs2.next()) {

//						int restaurant_id = rs2.getInt("restaurant_id"); //괄호 안에 컬럼명
						String restaurant_name = rs2.getString("restaurant_name"); 
						String main_menu = rs2.getString("main_menu"); 
						int price = rs2.getInt("price");
						String  address = rs2.getString("address"); 
						int review_rating = rs2.getInt("review_rating");
						//LocalDateTime -> Timestamp: Timestamp.valueOf(LocalDateTime);
						//Timestamp -> LocalDateTime: Timestamp.toLocalDateTime();

						count++;
						System.out.println("------------------------");
						System.out.printf("# 가게 이름: %s\n# 가게 메뉴: %s\n# 가격: %d원\n# 가게 주소: %s\n# 리뷰 수: %d\n", restaurant_name, main_menu, price, address, review_rating);
						System.out.println("------------------------");

					}
					System.out.println("조회된 행의 개수: " + count + "개");
					
				} catch (SQLException e) {
					e.printStackTrace();
				} finally {
					try {
						rs2.close();
					} catch (SQLException e) {
						e.printStackTrace();
					}
				}
				
				
				
				
				return;
			} else if(namevalue2.equals("중식")) {
				String sql2 = "SELECT r.restaurant_id, r.restaurant_name, r.main_menu, r.price, r.address, c.review_rating FROM Restaurant r LEFT JOIN ch_restaurant_review c ON c.restaurant_id = r.restaurant_id WHERE r.price <= ? and r.address = ?";
				try(Connection conn = connection.getConnection();
						PreparedStatement pstmt = conn.prepareStatement(sql2);
						){
					pstmt.setInt(1, namevalue3);
					pstmt.setString(2, namevalue4);
					
					rs2 = pstmt.executeQuery();
					int count = 0;
					while(rs2.next()) {

//						int restaurant_id = rs2.getInt("restaurant_id"); //괄호 안에 컬럼명
						String restaurant_name = rs2.getString("restaurant_name"); 
						String main_menu = rs2.getString("main_menu"); 
						int price = rs2.getInt("price");
						String  address = rs2.getString("address"); 
						int review_rating = rs2.getInt("review_rating");
						//LocalDateTime -> Timestamp: Timestamp.valueOf(LocalDateTime);
						//Timestamp -> LocalDateTime: Timestamp.toLocalDateTime();

						count++;
						System.out.println("------------------------");
						System.out.printf("# 가게 이름: %s\n# 가게 메뉴: %s\n# 가격: %d원\n# 가게 주소: %s\n# 리뷰 수: %d\n", restaurant_name, main_menu, price, address, review_rating);
						System.out.println("------------------------");

					}
					System.out.println("조회된 행의 개수: " + count + "개");
					
				} catch (SQLException e) {
					e.printStackTrace();
				} finally {
					try {
						rs2.close();
					} catch (SQLException e) {
						e.printStackTrace();
					}
				}
				
				
				
				
				return;
			} else if(namevalue2.equals("양식")) {
				String sql2 = "SELECT r.restaurant_id, r.restaurant_name, r.main_menu, r.price, r.address, w.review_rating FROM Restaurant r LEFT JOIN we_restaurant_review w ON w.restaurant_id = r.restaurant_id WHERE r.price <= ? and r.address = ?";
				try(Connection conn = connection.getConnection();
						PreparedStatement pstmt = conn.prepareStatement(sql2);
						){
					pstmt.setInt(1, namevalue3);
					pstmt.setString(2, namevalue4);
					
					rs2 = pstmt.executeQuery();
					int count = 0;
					while(rs2.next()) {

//						int restaurant_id = rs2.getInt("restaurant_id"); //괄호 안에 컬럼명
						String restaurant_name = rs2.getString("restaurant_name"); 
						String main_menu = rs2.getString("main_menu"); 
						int price = rs2.getInt("price");
						String  address = rs2.getString("address"); 
						int review_rating = rs2.getInt("review_rating");
						//LocalDateTime -> Timestamp: Timestamp.valueOf(LocalDateTime);
						//Timestamp -> LocalDateTime: Timestamp.toLocalDateTime();

						count++;
						System.out.println("------------------------");
						System.out.printf("# 가게 이름: %s\n# 가게 메뉴: %s\n# 가격: %d원\n# 가게 주소: %s\n# 리뷰 수: %d\n", restaurant_name, main_menu, price, address, review_rating);
						System.out.println("------------------------");

					}
					System.out.println("조회된 행의 개수: " + count + "개");
					
				} catch (SQLException e) {
					e.printStackTrace();
				} finally {
					try {
						rs2.close();
					} catch (SQLException e) {
						e.printStackTrace();
					}
				}
				
				
				
				
				return;
			} else {
				System.out.println("잘못 입력하셨습니다.");
				return;
			}


			
		case 3:		
			return;
		default:
			System.out.println("메뉴를 다시 입력하세요.");
		}
		
		System.out.println("\n==== 계속 진행하시려면 ENTER를 누르세요====");
		StartUI.inputString();
		
		}
		
		
		
	}

	
	
	
}
