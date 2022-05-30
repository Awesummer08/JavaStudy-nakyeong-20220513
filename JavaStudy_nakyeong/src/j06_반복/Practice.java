package j06_반복;

import java.util.Scanner;

public class Practice {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner (System.in);
		boolean loopFlag = true;
		char select = 0;
		
		while(loopFlag) {
			System.out.println("프로그램 시작");
			System.out.println("[프로그램 선택]");
			System.out.println("1. 자바");
			System.out.println("2. 파이선");
			System.out.println("3. 자바스크립트");
			System.out.println("q. 프로그램 종료");
			System.out.println("명령을 입력하세요");
			select = scanner.nextLine().charAt(0);
			
			if(select == 'q') {
				break;
			}else if(select == '1') {
				System.out.println("자바를 선택하셨습니다.");
				scanner.nextLine();
				
				while(true) {
					System.out.println("[프로그램선택]");
					System.out.println("1. 자바란?");
					System.out.println("b. 뒤로가기");
					System.out.println("q. 프로그램 종료");
					select = scanner.nextLine().charAt(0);
					
					if(select == 'b') {
						break;
					}else if(select == 'q') {
						loopFlag = false;
						break;
					}else if(select == '1') {
						System.out.println("자바는 ~입니다.");
						System.out.println("뒤로가시려면 엔터를 누르세요");
					}else {
						System.out.println("명령어를 잘못 입력하셨습니다.");
						System.out.println("뒤로가시려면 엔터를 누르세요");
					}
					
					
				}
				
				
			
			}else if(select == '2') {
				System.out.println("자바를 선택하셨습니다.");
				scanner.nextLine();
				
				while(true) {
					System.out.println("[프로그램선택]");
					System.out.println("1. 자바란?");
					System.out.println("b. 뒤로가기");
					System.out.println("q. 프로그램 종료");
					select = scanner.nextLine().charAt(0);
					
					if(select == 'b') {
						break;
					}else if(select == 'q') {
						loopFlag = false;
						break;
					}else if(select == '1') {
						System.out.println("자바는 ~입니다.");
						System.out.println("뒤로가시려면 엔터를 누르세요");
					}else {
						System.out.println("명령어를 잘못 입력하셨습니다.");
						System.out.println("뒤로가시려면 엔터를 누르세요");
					}
					
					
				}
				
			}else if(select == '3') {
				System.out.println("자바를 선택하셨습니다.");
				scanner.nextLine();
				
				while(true) {
					System.out.println("[프로그램선택]");
					System.out.println("1. 자바란?");
					System.out.println("b. 뒤로가기");
					System.out.println("q. 프로그램 종료");
					select = scanner.nextLine().charAt(0);
					
					if(select == 'b') {
						break;
					}else if(select == 'q') {
						loopFlag = false;
						break;
					}else if(select == '1') {
						System.out.println("자바는 ~입니다.");
						System.out.println("뒤로가시려면 엔터를 누르세요");
					}else {
						System.out.println("명령어를 잘못 입력하셨습니다.");
						System.out.println("뒤로가시려면 엔터를 누르세요");
					}
					
					
				}
				
			}else {
				System.out.println("명령어를 잘못 입력하셨습니다.");
				System.out.println("뒤로가시려면 엔터를 누르세요");
			}	
			
		}
		System.out.println("프로그램 종료");
	
	}
}

		