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
		
		public static void searchMenu() {
			System.out.println("\u001B[31;1;4;41;42;43;44;45;46m----------------------------------------------------\u001B[0m");
	        System.out.println("1.전체 검색");
	        System.out.println("2.국가별 맛집 검색(한식,중식,일식,양식)");
	        System.out.println("3.지역별 맛집 검색(서울,인천,경기도,강원도,충청도,경상도,전라도)");	  
	        System.out.println("4.가격별 맛집 검색(만원 미만,2만원 미만,3만원 미만,4만원 미만,5만원 미만,5만원 이상)");
	        System.out.println("5.맞춤 맞집 검색");	        
	        System.out.println("6.메인 화면으로 돌아가기");	  
	        System.out.print("\u001B[31;1;4;41;42;43;44;45;46m >>> 원하는 숫자를 눌러주세요 :\u001B[0m");
		}
		
		public static void fourMenu() {
			System.out.println("\u001B[31;1;4;41;42;43;44;45;46m----------------------------------------------------\u001B[0m");
			System.out.println("1.한식 검색");
			System.out.println("2.일식 검색");
			System.out.println("3.중식 검색");
			System.out.println("4.양식 검색");
			System.out.print("\u001B[31;1;4;41;42;43;44;45;46m >>> 원하는 숫자를 눌러주세요 :\u001B[0m");
		}
		
		public static void region() {
			System.out.println("\u001B[31;1;4;41;42;43;44;45;46m----------------------------------------------------\u001B[0m");
			System.out.println("1.서울 검색");
			System.out.println("2.인천 검색");
			System.out.println("3.경기도 검색");
			System.out.println("4.강원도 검색");
			System.out.println("5.충청도 검색");
			System.out.println("6.경상도 검색");
			System.out.println("7.전라도 검색");
			System.out.print("\u001B[31;1;4;41;42;43;44;45;46m >>> 원하는 숫자를 눌러주세요 :\u001B[0m");
		}
		
		public static void pricethen() {
			System.out.println("\u001B[31;1;4;41;42;43;44;45;46m----------------------------------------------------\u001B[0m");
			System.out.println("1.0 ~ 9900원 검색");
			System.out.println("2.10000 ~ 19900원 검색");
			System.out.println("3.20000 ~ 29900원 검색");
			System.out.println("4.30000 ~ 39900원 검색");
			System.out.println("5.40000 ~ 49900원 검색");
			System.out.println("6.50000원 이상 검색");
			System.out.print("\u001B[31;1;4;41;42;43;44;45;46m >>> 원하는 숫자를 눌러주세요 :\u001B[0m");
		}
		
		public static void totalthen() {
			System.out.println("\u001B[31;1;4;41;42;43;44;45;46m----------------------------------------------------\u001B[0m");
			System.out.println("1.이름으로 검색");
			System.out.println("2.조건별 맛집 검색");
			System.out.print("\u001B[31;1;4;41;42;43;44;45;46m >>> 원하는 숫자를 눌러주세요 :\u001B[0m");
			
		}
		
		
		
	        
	}


