package com.java.main;

import com.java.view.StartUI;

public class Main {

	public static void main(String[] args) {
		
		AppController controller = new AppController();
		
		while(true) {
			StartUI.startScreen();
			StartUI.startMenu();
			int selectNumber = StartUI.inputInteger(); 
			controller.chooseSystem(selectNumber);
		}
	}

}
