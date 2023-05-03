package com.java.restaurant.service;


import com.java.common.AppService;
import com.java.restaurant.repository.Restaurantrepository;
import com.java.restaurant.total.RestaurantTotal;
import com.java.view.StartUI;

public class Restaurantservice implements AppService{

	private final Restaurantrepository restaurantrepository 
	= new Restaurantrepository();
	private final RestaurantTotal restauranttotal = new RestaurantTotal();
	
	
	@Override
	public void start() {

		
		while(true) {
			StartUI.searchMenu();
			int selection = StartUI.inputInteger();
			
			switch(selection) {
			
			case 1:
				restaurantrepository.searchRestaurant();
				break;
			case 2:
				StartUI.fourMenu();
				int fourvalue= StartUI.inputInteger();
				restaurantrepository.foodtype(fourvalue);
				break;
			case 3:
				StartUI.region();
				int regionnum= StartUI.inputInteger();
				restaurantrepository.regiontype(regionnum);
				break;
			case 4:
				StartUI.pricethen();
				int pricenum= StartUI.inputInteger();
				restaurantrepository.pricetype(pricenum);
				break;
			case 5:
				
				StartUI.totalthen();
				int totalnum= StartUI.inputInteger();
				restauranttotal.totalrestauranttotal(totalnum);
				break;
			case 6:
				return;
			default:
				System.out.println("메뉴를 다시 입력하세요.");
			}
			System.out.println("\n==== 계속 진행하시려면 ENTER를 누르세요====");
			StartUI.inputString();
			
			}
			
		}
		
	
}
