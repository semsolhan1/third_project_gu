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
			if(menuType != 1 && menuType != 2 && menuType != 3 && menuType != 4) {
                System.out.println("메인화면으로 돌아갑니다.");
                break;
            }
			System.out.print("식당의 리뷰수: ");
			int resReview = StartUI.inputInteger();


			if(menuType == 1) { //한식
				restaurantMenuType.menuTypeKo(resReview, resName, menuName, menuPrice, resRegion);
				break;
				
			} else if(menuType == 2) { //중식
				restaurantMenuType.menuTypeCh(resReview, resName, menuName, menuPrice, resRegion);
				break;

			} else if(menuType == 3) { //양식
				restaurantMenuType.menuTypeWe(resReview, resName, menuName, menuPrice, resRegion);
				break;

			} else if(menuType == 4) { //일식
				restaurantMenuType.menuTypeWe(resReview, resName, menuName, menuPrice, resRegion);
				break;
			}





		}

	}








}
