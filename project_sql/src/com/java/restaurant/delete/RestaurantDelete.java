package com.java.restaurant.delete;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.java.common.AppService;
import com.java.common.DatabaseConnection;
import com.java.view.StartUI;

public class RestaurantDelete implements AppService{

	private DatabaseConnection connection = DatabaseConnection.getInstance();

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

				break;


			} catch (SQLException e) {
				e.printStackTrace();
			}
			
			


		}

	}


}
