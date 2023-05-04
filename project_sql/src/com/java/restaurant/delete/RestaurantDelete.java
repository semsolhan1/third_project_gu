package com.java.restaurant.delete;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.java.common.AppService;
import com.java.common.DatabaseConnection;
import com.java.restaurant.add.RestaurantMenuType;
import com.java.view.StartUI;

public class RestaurantDelete implements AppService{

	private DatabaseConnection connection = DatabaseConnection.getInstance();

	private final RestaurantMenuTypeDel restaurantMenuTypeDel = new RestaurantMenuTypeDel();	
	
	@Override
	public void start() {

		while(true) {
			System.out.println("\u001B[31;1;4;41;42;43;44;45;46m----------------------------------------------------\u001B[0m");
			System.out.println("### 음식점 삭제 하기");
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
				if(count == 0) {
					System.out.println("### 존재하지 않는 식당입니다.");
					break;
				}

			} catch (SQLException e) {
				e.printStackTrace();
			}

			System.out.print("식당 메뉴의 종류[1.한식,2.중식,3.양식,4.일식]: ");
			int menuType = StartUI.inputInteger();
			if(menuType != 1 && menuType != 2 && menuType != 3 && menuType != 4) {
                System.out.println("메인화면으로 돌아갑니다.");
                break;
            }

			if(menuType == 1) { //한식
				restaurantMenuTypeDel.menuTypeKo(resName);
				break;
			} else if(menuType == 2) { //중식
				restaurantMenuTypeDel.menuTypeCh(resName);
				break;
			} else if(menuType == 3) { //양식
				restaurantMenuTypeDel.menuTypeWe(resName);
				break;
			} else if(menuType == 4) { //일식
				restaurantMenuTypeDel.menuTypeJa(resName);
				break;
			}






		}

	}


}
