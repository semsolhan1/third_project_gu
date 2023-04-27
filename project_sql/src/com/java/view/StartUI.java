package com.java.view;

import java.util.InputMismatchException;
import java.util.Scanner;

public class StartUI {

		
		private static Scanner sc = new Scanner(System.in);
		
		public static String inputString() {
			return sc.nextLine();
		}
		
		public static int inputInteger() {
			int num = 0;
			try {
				num = sc.nextInt();
			} catch (InputMismatchException e) {
				System.out.println("정수로 입력해 주세요.");
			} finally {
				sc.nextLine();
			}
			
			return num;
		}
		//시작 화면 출력
		public static void startScreen() {
		 System.out.println("\u001B[32m====================================================");
		 	System.out.println("|   #    #  #   #  #    #   ######  ####   #     # |                   ");
		    System.out.println("|   #    #  #   #  ##   #  #        #   #   #   #  |                   ");
	        System.out.println("|   ######  #   #  # #  #  #  ####  ####      #    |                   ");
	        System.out.println("|   #    #  #   #  #  # #  #    ##  #   #     #    |                   ");
	        System.out.println("|   #    #   ###   #   ##   #### #  #    #    #    |                   ");
	        System.out.println("====================================================\u001B[0m");
	        System.out.println("");
	        
		}
	        
		public static void startMenu() {
			System.out.println("\u001B[31;1;4;41;42;43;44;45;46m----------------------------------------------------\u001B[0m");
	        System.out.println("1.나만의 음식점 찾기");
	        System.out.println("2.음식점 추가");
	        System.out.println("3.음식점 삭제");
	        System.out.println("4.프로그램 종료");
	        System.out.print("\u001B[31;1;4;41;42;43;44;45;46m >>> 원하는 숫자를 눌러주세요 :\u001B[0m");
		}
		
		
//	        System.out.println("1.맛");
//	        System.out.println("2.거리");
//	        System.out.println("3.가격");
//	        System.out.println("4.종합");
	        
	        
	}


