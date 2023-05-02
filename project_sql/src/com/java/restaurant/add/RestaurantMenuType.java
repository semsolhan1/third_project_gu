package com.java.restaurant.add;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.java.common.DatabaseConnection;

public class RestaurantMenuType {

	private DatabaseConnection connection = DatabaseConnection.getInstance();

	public void menuTypeKo(int resReview) {

		while(true) {
			String sql = "INSERT INTO ko_restaurant_review "
					+ "VALUES(SEQ_Ko_Restaurant_Review_ko_id.NEXTVAL,SEQ_Restaurant_restaurant_id.CURRVAL,?)";

			try(Connection conn = connection.getConnection();
					PreparedStatement pstmt = conn.prepareStatement(sql);) {
				pstmt.setInt(1, resReview);


			} catch (SQLException e) {
				e.printStackTrace();
			}
			break;
		}


	}

	public void menuTypeCh(int resReview) {




	}

	public void menuTypeJa(int resReview) {




	}

	public void menuTypeWe(int resReview) {




	}


}
