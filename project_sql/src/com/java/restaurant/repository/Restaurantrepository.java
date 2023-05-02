package com.java.restaurant.repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.java.common.DatabaseConnection;
import com.java.view.StartUI;

public class Restaurantrepository {

	private DatabaseConnection connection = DatabaseConnection.getInstance();

	public void searchRestaurant() {
		String sql = "SELECT * FROM Restaurant";

		//		Connection conn = null;
		//		PreparedStatement pstmt = null;
		//		ResultSet rs = null; //SELECT 문에서만 사용하는 객체.


		try(Connection conn = connection.getConnection();
				PreparedStatement pstmt = conn.prepareStatement(sql);
				ResultSet rs = pstmt.executeQuery();){

			int count = 0;
			while(rs.next()) {

//				int restaurant_id = rs.getInt("restaurant_id"); //괄호 안에 컬럼명
				String restaurant_name = rs.getString("restaurant_name"); 
				String main_menu = rs.getString("main_menu"); 
				int price = rs.getInt("price");
				String  address = rs.getString("address"); 

				//LocalDateTime -> Timestamp: Timestamp.valueOf(LocalDateTime);
				//Timestamp -> LocalDateTime: Timestamp.toLocalDateTime();

				count++;

				System.out.printf("# 가게 이름: %s\n# 가게 메뉴: %s\n# 가격: %d원\n# 가게 주소: %s\n", restaurant_name, main_menu, price, address);
				System.out.println("------------------------");

			}
			System.out.println("조회된 행의 개수: " + count + "개");

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public void foodtype(int fourvalue) {
		while(true) {


			if(fourvalue==1) {
				String sql = "SELECT r.restaurant_id, r.restaurant_name, r.main_menu, r.price, r.address, k.review_rating FROM ko_restaurant_review k LEFT JOIN Restaurant r ON k.restaurant_id = r.restaurant_id";

				//				Connection conn = null;
				//				PreparedStatement pstmt = null;
				//				ResultSet rs = null; //SELECT 문에서만 사용하는 객체.


				try(Connection conn = connection.getConnection();
						PreparedStatement pstmt = conn.prepareStatement(sql);
						ResultSet rs = pstmt.executeQuery();){

					int count = 0;
					while(rs.next()) {

//						int restaurant_id = rs.getInt("restaurant_id"); //괄호 안에 컬럼명
						String restaurant_name = rs.getString("restaurant_name"); 
						String main_menu = rs.getString("main_menu"); 
						int price = rs.getInt("price");
						String  address = rs.getString("address");
						int review_rating = rs.getInt("review_rating");

						//LocalDateTime -> Timestamp: Timestamp.valueOf(LocalDateTime);
						//Timestamp -> LocalDateTime: Timestamp.toLocalDateTime();

						count++;

						System.out.printf("# 가게 이름: %s\n# 가게 메뉴: %s\n# 가격: %d원\n# 가게 주소: %s\n# 리뷰 수: %d\n", restaurant_name, main_menu, price, address, review_rating);
						System.out.println("------------------------");

					}
					System.out.println("조회된 행의 개수: " + count + "개");

				} catch (SQLException e) {
					e.printStackTrace();
				}
				break;
			}
			else if(fourvalue==2) {
				String sql = "SELECT r.restaurant_id, r.restaurant_name, r.main_menu, r.price, r.address, j.review_rating FROM ja_restaurant_review j LEFT JOIN Restaurant r ON j.restaurant_id = r.restaurant_id";

				//				Connection conn = null;
				//				PreparedStatement pstmt = null;
				//				ResultSet rs = null; //SELECT 문에서만 사용하는 객체.


				try(Connection conn = connection.getConnection();
						PreparedStatement pstmt = conn.prepareStatement(sql);
						ResultSet rs = pstmt.executeQuery();){

					int count = 0;
					while(rs.next()) {

//						int restaurant_id = rs.getInt("restaurant_id"); //괄호 안에 컬럼명
						String restaurant_name = rs.getString("restaurant_name"); 
						String main_menu = rs.getString("main_menu"); 
						int price = rs.getInt("price");
						String  address = rs.getString("address"); 
						int review_rating = rs.getInt("review_rating");
						//LocalDateTime -> Timestamp: Timestamp.valueOf(LocalDateTime);
						//Timestamp -> LocalDateTime: Timestamp.toLocalDateTime();

						count++;

						System.out.printf("# 가게 이름: %s\n# 가게 메뉴: %s\n# 가격: %d원\n# 가게 주소: %s\n# 리뷰 수: %d\n", restaurant_name, main_menu, price, address, review_rating);
						System.out.println("------------------------");

					}
					System.out.println("조회된 행의 개수: " + count + "개");

				} catch (SQLException e) {
					e.printStackTrace();
				}

				break;
			}
			else if(fourvalue==3) {
				String sql = "SELECT r.restaurant_id, r.restaurant_name, r.main_menu, r.price, r.address, c.review_rating FROM ch_restaurant_review c LEFT JOIN Restaurant r ON c.restaurant_id = r.restaurant_id";

				//				Connection conn = null;
				//				PreparedStatement pstmt = null;
				//				ResultSet rs = null; //SELECT 문에서만 사용하는 객체.


				try(Connection conn = connection.getConnection();
						PreparedStatement pstmt = conn.prepareStatement(sql);
						ResultSet rs = pstmt.executeQuery();){

					int count = 0;
					while(rs.next()) {

//						int restaurant_id = rs.getInt("restaurant_id"); //괄호 안에 컬럼명
						String restaurant_name = rs.getString("restaurant_name"); 
						String main_menu = rs.getString("main_menu"); 
						int price = rs.getInt("price");
						String  address = rs.getString("address");
						int review_rating = rs.getInt("review_rating");

						//LocalDateTime -> Timestamp: Timestamp.valueOf(LocalDateTime);
						//Timestamp -> LocalDateTime: Timestamp.toLocalDateTime();

						count++;

						System.out.printf("# 가게 이름: %s\n# 가게 메뉴: %s\n# 가격: %d원\n# 가게 주소: %s\n# 리뷰 수: %d\n", restaurant_name, main_menu, price, address, review_rating);
						System.out.println("------------------------");

					}
					System.out.println("조회된 행의 개수: " + count + "개");

				} catch (SQLException e) {
					e.printStackTrace();
				}


				break;
			} else if(fourvalue==4) {
				String sql = "SELECT r.restaurant_id, r.restaurant_name, r.main_menu, r.price, r.address, w.review_rating FROM we_restaurant_review w LEFT JOIN Restaurant r ON w.restaurant_id = r.restaurant_id";

				//				Connection conn = null;
				//				PreparedStatement pstmt = null;
				//				ResultSet rs = null; //SELECT 문에서만 사용하는 객체.


				try(Connection conn = connection.getConnection();
						PreparedStatement pstmt = conn.prepareStatement(sql);
						ResultSet rs = pstmt.executeQuery();){

					int count = 0;
					while(rs.next()) {

//						int restaurant_id = rs.getInt("restaurant_id"); //괄호 안에 컬럼명
						String restaurant_name = rs.getString("restaurant_name"); 
						String main_menu = rs.getString("main_menu"); 
						int price = rs.getInt("price");
						String  address = rs.getString("address"); 
						int review_rating = rs.getInt("review_rating");
						//LocalDateTime -> Timestamp: Timestamp.valueOf(LocalDateTime);
						//Timestamp -> LocalDateTime: Timestamp.toLocalDateTime();

						count++;

						System.out.printf("# 가게 이름: %s\n# 가게 메뉴: %s\n# 가격: %d원\n# 가게 주소: %s\n# 리뷰 수: %d\n", restaurant_name, main_menu, price, address, review_rating);
						System.out.println("------------------------");

					}
					System.out.println("조회된 행의 개수: " + count + "개");

				} catch (SQLException e) {
					e.printStackTrace();
				}



				break;
			}
			else {
				System.out.println("메뉴를 다시 입력하세요.");
			}
			System.out.println("\n==== 계속 진행하시려면 ENTER를 누르세요====");
			StartUI.inputString();

		}

	}

	public void regiontype(int regionnum) {
		while(true) {


			if(regionnum==1) {
				String sql = "SELECT r.restaurant_id, r.restaurant_name, r.main_menu, r.price, r.address, COALESCE(k.review_rating, j.review_rating, c.review_rating, w.review_rating) as review_rating FROM Restaurant r LEFT JOIN ko_restaurant_review k ON k.restaurant_id = r.restaurant_id LEFT JOIN ja_restaurant_review j ON j.restaurant_id = r.restaurant_id LEFT JOIN ch_restaurant_review c ON c.restaurant_id = r.restaurant_id LEFT JOIN we_restaurant_review w ON w.restaurant_id = r.restaurant_id WHERE r.address = '서울'";

				//				Connection conn = null;
				//				PreparedStatement pstmt = null;
				//				ResultSet rs = null; //SELECT 문에서만 사용하는 객체.


				try(Connection conn = connection.getConnection();
						PreparedStatement pstmt = conn.prepareStatement(sql);
						ResultSet rs = pstmt.executeQuery();){

					int count = 0;
					while(rs.next()) {

//						int restaurant_id = rs.getInt("restaurant_id"); //괄호 안에 컬럼명
						String restaurant_name = rs.getString("restaurant_name"); 
						String main_menu = rs.getString("main_menu"); 
						int price = rs.getInt("price");
						String  address = rs.getString("address");
						int review_rating = rs.getInt("review_rating");

						//LocalDateTime -> Timestamp: Timestamp.valueOf(LocalDateTime);
						//Timestamp -> LocalDateTime: Timestamp.toLocalDateTime();

						count++;

						System.out.printf("# 가게 이름: %s\n# 가게 메뉴: %s\n# 가격: %d원\n# 가게 주소: %s\n# 리뷰 수: %d\n", restaurant_name, main_menu, price, address, review_rating);
						System.out.println("------------------------");

					}
					System.out.println("조회된 행의 개수: " + count + "개");

				} catch (SQLException e) {
					e.printStackTrace();
				}
				break;
			}
			else if(regionnum==2) {
				String sql = "SELECT r.restaurant_id, r.restaurant_name, r.main_menu, r.price, r.address, COALESCE(k.review_rating, j.review_rating, c.review_rating, w.review_rating) as review_rating FROM Restaurant r LEFT JOIN ko_restaurant_review k ON k.restaurant_id = r.restaurant_id LEFT JOIN ja_restaurant_review j ON j.restaurant_id = r.restaurant_id LEFT JOIN ch_restaurant_review c ON c.restaurant_id = r.restaurant_id LEFT JOIN we_restaurant_review w ON w.restaurant_id = r.restaurant_id WHERE r.address = '인천'";

				//				Connection conn = null;
				//				PreparedStatement pstmt = null;
				//				ResultSet rs = null; //SELECT 문에서만 사용하는 객체.


				try(Connection conn = connection.getConnection();
						PreparedStatement pstmt = conn.prepareStatement(sql);
						ResultSet rs = pstmt.executeQuery();){

					int count = 0;
					while(rs.next()) {

//						int restaurant_id = rs.getInt("restaurant_id"); //괄호 안에 컬럼명
						String restaurant_name = rs.getString("restaurant_name"); 
						String main_menu = rs.getString("main_menu"); 
						int price = rs.getInt("price");
						String  address = rs.getString("address"); 
						int review_rating = rs.getInt("review_rating");
						//LocalDateTime -> Timestamp: Timestamp.valueOf(LocalDateTime);
						//Timestamp -> LocalDateTime: Timestamp.toLocalDateTime();

						count++;

						System.out.printf("# 가게 이름: %s\n# 가게 메뉴: %s\n# 가격: %d원\n# 가게 주소: %s\n# 리뷰 수: %d\n", restaurant_name, main_menu, price, address, review_rating);
						System.out.println("------------------------");

					}
					System.out.println("조회된 행의 개수: " + count + "개");

				} catch (SQLException e) {
					e.printStackTrace();
				}

				break;
			}
			else if(regionnum==3) {
				String sql = "SELECT r.restaurant_id, r.restaurant_name, r.main_menu, r.price, r.address, COALESCE(k.review_rating, j.review_rating, c.review_rating, w.review_rating) as review_rating FROM Restaurant r LEFT JOIN ko_restaurant_review k ON k.restaurant_id = r.restaurant_id LEFT JOIN ja_restaurant_review j ON j.restaurant_id = r.restaurant_id LEFT JOIN ch_restaurant_review c ON c.restaurant_id = r.restaurant_id LEFT JOIN we_restaurant_review w ON w.restaurant_id = r.restaurant_id WHERE r.address = '경기도'";

				//				Connection conn = null;
				//				PreparedStatement pstmt = null;
				//				ResultSet rs = null; //SELECT 문에서만 사용하는 객체.


				try(Connection conn = connection.getConnection();
						PreparedStatement pstmt = conn.prepareStatement(sql);
						ResultSet rs = pstmt.executeQuery();){

					int count = 0;
					while(rs.next()) {

//						int restaurant_id = rs.getInt("restaurant_id"); //괄호 안에 컬럼명
						String restaurant_name = rs.getString("restaurant_name"); 
						String main_menu = rs.getString("main_menu"); 
						int price = rs.getInt("price");
						String  address = rs.getString("address");
						int review_rating = rs.getInt("review_rating");

						//LocalDateTime -> Timestamp: Timestamp.valueOf(LocalDateTime);
						//Timestamp -> LocalDateTime: Timestamp.toLocalDateTime();

						count++;

						System.out.printf("# 가게 이름: %s\n# 가게 메뉴: %s\n# 가격: %d원\n# 가게 주소: %s\n# 리뷰 수: %d\n", restaurant_name, main_menu, price, address, review_rating);
						System.out.println("------------------------");

					}
					System.out.println("조회된 행의 개수: " + count + "개");

				} catch (SQLException e) {
					e.printStackTrace();
				}


				break;
			} else if(regionnum==4) {
				String sql = "SELECT r.restaurant_id, r.restaurant_name, r.main_menu, r.price, r.address, COALESCE(k.review_rating, j.review_rating, c.review_rating, w.review_rating) as review_rating FROM Restaurant r LEFT JOIN ko_restaurant_review k ON k.restaurant_id = r.restaurant_id LEFT JOIN ja_restaurant_review j ON j.restaurant_id = r.restaurant_id LEFT JOIN ch_restaurant_review c ON c.restaurant_id = r.restaurant_id LEFT JOIN we_restaurant_review w ON w.restaurant_id = r.restaurant_id WHERE r.address = '강원도'";

				//				Connection conn = null;
				//				PreparedStatement pstmt = null;
				//				ResultSet rs = null; //SELECT 문에서만 사용하는 객체.


				try(Connection conn = connection.getConnection();
						PreparedStatement pstmt = conn.prepareStatement(sql);
						ResultSet rs = pstmt.executeQuery();){

					int count = 0;
					while(rs.next()) {

//						int restaurant_id = rs.getInt("restaurant_id"); //괄호 안에 컬럼명
						String restaurant_name = rs.getString("restaurant_name"); 
						String main_menu = rs.getString("main_menu"); 
						int price = rs.getInt("price");
						String  address = rs.getString("address"); 
						int review_rating = rs.getInt("review_rating");
						//LocalDateTime -> Timestamp: Timestamp.valueOf(LocalDateTime);
						//Timestamp -> LocalDateTime: Timestamp.toLocalDateTime();

						count++;

						System.out.printf("# 가게 이름: %s\n# 가게 메뉴: %s\n# 가격: %d원\n# 가게 주소: %s\n# 리뷰 수: %d\n", restaurant_name, main_menu, price, address, review_rating);
						System.out.println("------------------------");

					}
					System.out.println("조회된 행의 개수: " + count + "개");

				} catch (SQLException e) {
					e.printStackTrace();
				}



				break;
			} else if(regionnum==5) {
				String sql = "SELECT r.restaurant_id, r.restaurant_name, r.main_menu, r.price, r.address, COALESCE(k.review_rating, j.review_rating, c.review_rating, w.review_rating) as review_rating FROM Restaurant r LEFT JOIN ko_restaurant_review k ON k.restaurant_id = r.restaurant_id LEFT JOIN ja_restaurant_review j ON j.restaurant_id = r.restaurant_id LEFT JOIN ch_restaurant_review c ON c.restaurant_id = r.restaurant_id LEFT JOIN we_restaurant_review w ON w.restaurant_id = r.restaurant_id WHERE r.address = '충청도'";

				//				Connection conn = null;
				//				PreparedStatement pstmt = null;
				//				ResultSet rs = null; //SELECT 문에서만 사용하는 객체.


				try(Connection conn = connection.getConnection();
						PreparedStatement pstmt = conn.prepareStatement(sql);
						ResultSet rs = pstmt.executeQuery();){

					int count = 0;
					while(rs.next()) {

//						int restaurant_id = rs.getInt("restaurant_id"); //괄호 안에 컬럼명
						String restaurant_name = rs.getString("restaurant_name"); 
						String main_menu = rs.getString("main_menu"); 
						int price = rs.getInt("price");
						String  address = rs.getString("address"); 
						int review_rating = rs.getInt("review_rating");
						//LocalDateTime -> Timestamp: Timestamp.valueOf(LocalDateTime);
						//Timestamp -> LocalDateTime: Timestamp.toLocalDateTime();

						count++;

						System.out.printf("# 가게 이름: %s\n# 가게 메뉴: %s\n# 가격: %d원\n# 가게 주소: %s\n# 리뷰 수: %d\n", restaurant_name, main_menu, price, address, review_rating);
						System.out.println("------------------------");

					}
					System.out.println("조회된 행의 개수: " + count + "개");

				} catch (SQLException e) {
					e.printStackTrace();
				} 



				break;
			} else if(regionnum==6) {
				String sql = "SELECT r.restaurant_id, r.restaurant_name, r.main_menu, r.price, r.address, COALESCE(k.review_rating, j.review_rating, c.review_rating, w.review_rating) as review_rating FROM Restaurant r LEFT JOIN ko_restaurant_review k ON k.restaurant_id = r.restaurant_id LEFT JOIN ja_restaurant_review j ON j.restaurant_id = r.restaurant_id LEFT JOIN ch_restaurant_review c ON c.restaurant_id = r.restaurant_id LEFT JOIN we_restaurant_review w ON w.restaurant_id = r.restaurant_id WHERE r.address = '경상도'";

				//				Connection conn = null;
				//				PreparedStatement pstmt = null;
				//				ResultSet rs = null; //SELECT 문에서만 사용하는 객체.


				try(Connection conn = connection.getConnection();
						PreparedStatement pstmt = conn.prepareStatement(sql);
						ResultSet rs = pstmt.executeQuery();){

					int count = 0;
					while(rs.next()) {

//						int restaurant_id = rs.getInt("restaurant_id"); //괄호 안에 컬럼명
						String restaurant_name = rs.getString("restaurant_name"); 
						String main_menu = rs.getString("main_menu"); 
						int price = rs.getInt("price");
						String  address = rs.getString("address"); 
						int review_rating = rs.getInt("review_rating");
						//LocalDateTime -> Timestamp: Timestamp.valueOf(LocalDateTime);
						//Timestamp -> LocalDateTime: Timestamp.toLocalDateTime();

						count++;

						System.out.printf("# 가게 이름: %s\n# 가게 메뉴: %s\n# 가격: %d원\n# 가게 주소: %s\n# 리뷰 수: %d\n", restaurant_name, main_menu, price, address, review_rating);
						System.out.println("------------------------");

					}
					System.out.println("조회된 행의 개수: " + count + "개");

				} catch (SQLException e) {
					e.printStackTrace();
				} 



				break;
			} else if(regionnum==7) {
				String sql = "SELECT r.restaurant_id, r.restaurant_name, r.main_menu, r.price, r.address, COALESCE(k.review_rating, j.review_rating, c.review_rating, w.review_rating) as review_rating FROM Restaurant r LEFT JOIN ko_restaurant_review k ON k.restaurant_id = r.restaurant_id LEFT JOIN ja_restaurant_review j ON j.restaurant_id = r.restaurant_id LEFT JOIN ch_restaurant_review c ON c.restaurant_id = r.restaurant_id LEFT JOIN we_restaurant_review w ON w.restaurant_id = r.restaurant_id WHERE r.address = '전라도'";

				//				Connection conn = null;
				//				PreparedStatement pstmt = null;
				//				ResultSet rs = null; //SELECT 문에서만 사용하는 객체.


				try(Connection conn = connection.getConnection();
						PreparedStatement pstmt = conn.prepareStatement(sql);
						ResultSet rs = pstmt.executeQuery();){

					int count = 0;
					while(rs.next()) {

//						int restaurant_id = rs.getInt("restaurant_id"); //괄호 안에 컬럼명
						String restaurant_name = rs.getString("restaurant_name"); 
						String main_menu = rs.getString("main_menu"); 
						int price = rs.getInt("price");
						String  address = rs.getString("address"); 
						int review_rating = rs.getInt("review_rating");
						//LocalDateTime -> Timestamp: Timestamp.valueOf(LocalDateTime);
						//Timestamp -> LocalDateTime: Timestamp.toLocalDateTime();

						count++;

						System.out.printf("# 가게 이름: %s\n# 가게 메뉴: %s\n# 가격: %d원\n# 가게 주소: %s\n# 리뷰 수: %d\n", restaurant_name, main_menu, price, address, review_rating);
						System.out.println("------------------------");

					}
					System.out.println("조회된 행의 개수: " + count + "개");

				} catch (SQLException e) {
					e.printStackTrace();
				} 



				break;
			} 
			
			
			else {
				System.out.println("메뉴를 다시 입력하세요.");
			}
			System.out.println("\n==== 계속 진행하시려면 ENTER를 누르세요====");
			StartUI.inputString();

		}


	}

	public void pricetype(int pricenum) {
		while(true) {


			if(pricenum==1) {
				String sql = "SELECT r.restaurant_id, r.restaurant_name, r.main_menu, r.price, r.address, COALESCE(k.review_rating, j.review_rating, c.review_rating, w.review_rating) as review_rating FROM Restaurant r LEFT JOIN ko_restaurant_review k ON k.restaurant_id = r.restaurant_id LEFT JOIN ja_restaurant_review j ON j.restaurant_id = r.restaurant_id LEFT JOIN ch_restaurant_review c ON c.restaurant_id = r.restaurant_id LEFT JOIN we_restaurant_review w ON w.restaurant_id = r.restaurant_id WHERE r.price < 10000";

				//				Connection conn = null;
				//				PreparedStatement pstmt = null;
				//				ResultSet rs = null; //SELECT 문에서만 사용하는 객체.


				try(Connection conn = connection.getConnection();
						PreparedStatement pstmt = conn.prepareStatement(sql);
						ResultSet rs = pstmt.executeQuery();){

					int count = 0;
					while(rs.next()) {

//						int restaurant_id = rs.getInt("restaurant_id"); //괄호 안에 컬럼명
						String restaurant_name = rs.getString("restaurant_name"); 
						String main_menu = rs.getString("main_menu"); 
						int price = rs.getInt("price");
						String  address = rs.getString("address");
						int review_rating = rs.getInt("review_rating");

						//LocalDateTime -> Timestamp: Timestamp.valueOf(LocalDateTime);
						//Timestamp -> LocalDateTime: Timestamp.toLocalDateTime();

						count++;

						System.out.printf("# 가게 이름: %s\n# 가게 메뉴: %s\n# 가격: %d원\n# 가게 주소: %s\n# 리뷰 수: %d\n", restaurant_name, main_menu, price, address, review_rating);
						System.out.println("------------------------");

					}
					System.out.println("조회된 행의 개수: " + count + "개");

				} catch (SQLException e) {
					e.printStackTrace();
				}
				break;
			}
			else if(pricenum==2) {
				String sql = "SELECT r.restaurant_id, r.restaurant_name, r.main_menu, r.price, r.address, COALESCE(k.review_rating, j.review_rating, c.review_rating, w.review_rating) as review_rating FROM Restaurant r LEFT JOIN ko_restaurant_review k ON k.restaurant_id = r.restaurant_id LEFT JOIN ja_restaurant_review j ON j.restaurant_id = r.restaurant_id LEFT JOIN ch_restaurant_review c ON c.restaurant_id = r.restaurant_id LEFT JOIN we_restaurant_review w ON w.restaurant_id = r.restaurant_id WHERE r.price < 20000 and r.price >= 10000";

				//				Connection conn = null;
				//				PreparedStatement pstmt = null;
				//				ResultSet rs = null; //SELECT 문에서만 사용하는 객체.


				try(Connection conn = connection.getConnection();
						PreparedStatement pstmt = conn.prepareStatement(sql);
						ResultSet rs = pstmt.executeQuery();){

					int count = 0;
					while(rs.next()) {

//						int restaurant_id = rs.getInt("restaurant_id"); //괄호 안에 컬럼명
						String restaurant_name = rs.getString("restaurant_name"); 
						String main_menu = rs.getString("main_menu"); 
						int price = rs.getInt("price");
						String  address = rs.getString("address"); 
						int review_rating = rs.getInt("review_rating");
						//LocalDateTime -> Timestamp: Timestamp.valueOf(LocalDateTime);
						//Timestamp -> LocalDateTime: Timestamp.toLocalDateTime();

						count++;

						System.out.printf("# 가게 이름: %s\n# 가게 메뉴: %s\n# 가격: %d원\n# 가게 주소: %s\n# 리뷰 수: %d\n", restaurant_name, main_menu, price, address, review_rating);
						System.out.println("------------------------");

					}
					System.out.println("조회된 행의 개수: " + count + "개");

				} catch (SQLException e) {
					e.printStackTrace();
				}

				break;
			}
			else if(pricenum==3) {
				String sql = "SELECT r.restaurant_id, r.restaurant_name, r.main_menu, r.price, r.address, COALESCE(k.review_rating, j.review_rating, c.review_rating, w.review_rating) as review_rating FROM Restaurant r LEFT JOIN ko_restaurant_review k ON k.restaurant_id = r.restaurant_id LEFT JOIN ja_restaurant_review j ON j.restaurant_id = r.restaurant_id LEFT JOIN ch_restaurant_review c ON c.restaurant_id = r.restaurant_id LEFT JOIN we_restaurant_review w ON w.restaurant_id = r.restaurant_id WHERE r.price >= 20000 and r.price < 30000";

				//				Connection conn = null;
				//				PreparedStatement pstmt = null;
				//				ResultSet rs = null; //SELECT 문에서만 사용하는 객체.


				try(Connection conn = connection.getConnection();
						PreparedStatement pstmt = conn.prepareStatement(sql);
						ResultSet rs = pstmt.executeQuery();){

					int count = 0;
					while(rs.next()) {

//						int restaurant_id = rs.getInt("restaurant_id"); //괄호 안에 컬럼명
						String restaurant_name = rs.getString("restaurant_name"); 
						String main_menu = rs.getString("main_menu"); 
						int price = rs.getInt("price");
						String  address = rs.getString("address");
						int review_rating = rs.getInt("review_rating");

						//LocalDateTime -> Timestamp: Timestamp.valueOf(LocalDateTime);
						//Timestamp -> LocalDateTime: Timestamp.toLocalDateTime();

						count++;

						System.out.printf("# 가게 이름: %s\n# 가게 메뉴: %s\n# 가격: %d원\n# 가게 주소: %s\n# 리뷰 수: %d\n", restaurant_name, main_menu, price, address, review_rating);
						System.out.println("------------------------");

					}
					System.out.println("조회된 행의 개수: " + count + "개");

				} catch (SQLException e) {
					e.printStackTrace();
				}


				break;
			} else if(pricenum==4) {
				String sql = "SELECT r.restaurant_id, r.restaurant_name, r.main_menu, r.price, r.address, COALESCE(k.review_rating, j.review_rating, c.review_rating, w.review_rating) as review_rating FROM Restaurant r LEFT JOIN ko_restaurant_review k ON k.restaurant_id = r.restaurant_id LEFT JOIN ja_restaurant_review j ON j.restaurant_id = r.restaurant_id LEFT JOIN ch_restaurant_review c ON c.restaurant_id = r.restaurant_id LEFT JOIN we_restaurant_review w ON w.restaurant_id = r.restaurant_id WHERE r.price >= 30000 and r.price < 40000";

				//				Connection conn = null;
				//				PreparedStatement pstmt = null;
				//				ResultSet rs = null; //SELECT 문에서만 사용하는 객체.


				try(Connection conn = connection.getConnection();
						PreparedStatement pstmt = conn.prepareStatement(sql);
						ResultSet rs = pstmt.executeQuery();){

					int count = 0;
					while(rs.next()) {

//						int restaurant_id = rs.getInt("restaurant_id"); //괄호 안에 컬럼명
						String restaurant_name = rs.getString("restaurant_name"); 
						String main_menu = rs.getString("main_menu"); 
						int price = rs.getInt("price");
						String  address = rs.getString("address"); 
						int review_rating = rs.getInt("review_rating");
						//LocalDateTime -> Timestamp: Timestamp.valueOf(LocalDateTime);
						//Timestamp -> LocalDateTime: Timestamp.toLocalDateTime();

						count++;

						System.out.printf("# 가게 이름: %s\n# 가게 메뉴: %s\n# 가격: %d원\n# 가게 주소: %s\n# 리뷰 수: %d\n", restaurant_name, main_menu, price, address, review_rating);
						System.out.println("------------------------");

					}
					System.out.println("조회된 행의 개수: " + count + "개");

				} catch (SQLException e) {
					e.printStackTrace();
				}



				break;
			} else if(pricenum==5) {
				String sql = "SELECT r.restaurant_id, r.restaurant_name, r.main_menu, r.price, r.address, COALESCE(k.review_rating, j.review_rating, c.review_rating, w.review_rating) as review_rating FROM Restaurant r LEFT JOIN ko_restaurant_review k ON k.restaurant_id = r.restaurant_id LEFT JOIN ja_restaurant_review j ON j.restaurant_id = r.restaurant_id LEFT JOIN ch_restaurant_review c ON c.restaurant_id = r.restaurant_id LEFT JOIN we_restaurant_review w ON w.restaurant_id = r.restaurant_id WHERE r.price >= 40000 and r.price < 50000";

				//				Connection conn = null;
				//				PreparedStatement pstmt = null;
				//				ResultSet rs = null; //SELECT 문에서만 사용하는 객체.


				try(Connection conn = connection.getConnection();
						PreparedStatement pstmt = conn.prepareStatement(sql);
						ResultSet rs = pstmt.executeQuery();){

					int count = 0;
					while(rs.next()) {

//						int restaurant_id = rs.getInt("restaurant_id"); //괄호 안에 컬럼명
						String restaurant_name = rs.getString("restaurant_name"); 
						String main_menu = rs.getString("main_menu"); 
						int price = rs.getInt("price");
						String  address = rs.getString("address"); 
						int review_rating = rs.getInt("review_rating");
						//LocalDateTime -> Timestamp: Timestamp.valueOf(LocalDateTime);
						//Timestamp -> LocalDateTime: Timestamp.toLocalDateTime();

						count++;

						System.out.printf("# 가게 이름: %s\n# 가게 메뉴: %s\n# 가격: %d원\n# 가게 주소: %s\n# 리뷰 수: %d\n", restaurant_name, main_menu, price, address, review_rating);
						System.out.println("------------------------");

					}
					System.out.println("조회된 행의 개수: " + count + "개");

				} catch (SQLException e) {
					e.printStackTrace();
				} 



				break;
			} else if(pricenum==6) {
				String sql = "SELECT r.restaurant_id, r.restaurant_name, r.main_menu, r.price, r.address, COALESCE(k.review_rating, j.review_rating, c.review_rating, w.review_rating) as review_rating FROM Restaurant r LEFT JOIN ko_restaurant_review k ON k.restaurant_id = r.restaurant_id LEFT JOIN ja_restaurant_review j ON j.restaurant_id = r.restaurant_id LEFT JOIN ch_restaurant_review c ON c.restaurant_id = r.restaurant_id LEFT JOIN we_restaurant_review w ON w.restaurant_id = r.restaurant_id WHERE r.price >= 50000";

				//				Connection conn = null;
				//				PreparedStatement pstmt = null;
				//				ResultSet rs = null; //SELECT 문에서만 사용하는 객체.


				try(Connection conn = connection.getConnection();
						PreparedStatement pstmt = conn.prepareStatement(sql);
						ResultSet rs = pstmt.executeQuery();){

					int count = 0;
					while(rs.next()) {

//						int restaurant_id = rs.getInt("restaurant_id"); //괄호 안에 컬럼명
						String restaurant_name = rs.getString("restaurant_name"); 
						String main_menu = rs.getString("main_menu"); 
						int price = rs.getInt("price");
						String  address = rs.getString("address"); 
						int review_rating = rs.getInt("review_rating");
						//LocalDateTime -> Timestamp: Timestamp.valueOf(LocalDateTime);
						//Timestamp -> LocalDateTime: Timestamp.toLocalDateTime();

						count++;

						System.out.printf("# 가게 이름: %s\n# 가게 메뉴: %s\n# 가격: %d원\n# 가게 주소: %s\n# 리뷰 수: %d\n", restaurant_name, main_menu, price, address, review_rating);
						System.out.println("------------------------");

					}
					System.out.println("조회된 행의 개수: " + count + "개");

				} catch (SQLException e) {
					e.printStackTrace();
				} 



				break;
			} 
		
			
			else {
				System.out.println("메뉴를 다시 입력하세요.");
			}
			System.out.println("\n==== 계속 진행하시려면 ENTER를 누르세요====");
			StartUI.inputString();

		}

		
		
	}

	



}
