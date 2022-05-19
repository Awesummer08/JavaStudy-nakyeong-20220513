package j05_조건;

import java.util.Scanner;

public class If04 {

	public static void main(String[] args) {
		/*
		 * (x == 0 || y == 0) 
		 * 계산 불가
		 * 
		 * (x== 0 && y== 0)
		 * 원점
		 * 
		 * x or y 
		 * -1000 ~ 1000 사이가 아니면 계산 불가
		 * 
		 * */
		
		Scanner scanner = new Scanner(System.in);
		double x = 0;
		double y = 0;
		
		System.out.print("x: ");
		x = scanner.nextDouble();
		System.out.print("y: ");
		y = scanner.nextDouble();
		
		
		if((x > 1000 || y > 1000 || x < -1000 || y < -1000 || x == 0 || y ==0) 
				&& (x != 0 || y != 0)) {
			// && (x != 0 && y != 0)) 동시에 x가 0이거나 y가 0이면 안된다. 그래서 && 를 쓰는거다.
			// || 옆에꺼는 4가지가 하나씩 안 될때.
			System.out.println("계산할 수 없습니다.");
		}else if(x > 0 && y > 0 ) {
			System.out.println("1사분면");
		}else if(x < 0 && y > 0 ) {
			System.out.println("2사분면");
		}else if(x < 0 && y < 0 ) {
			System.out.println("3사분면");
		}else if(x > 0 && y < 0 ) {
			System.out.println("4사분면");
		}else {
			System.out.println("원점");
		}
		
		
		
		//위의 내용을 삼항연산자로 나타내기
//		String result = (x > 1000 || y > 1000 || x < -1000 || y < -1000 || x == 0 || y ==0) 
//				&& (x != 0 || y != 0) ? " 계산불가"
//						: x > 0 && y > 0 ? "1사분면"
//								:x < 0 && y > 0 ? "2사분면"
//										:x < 0 && y < 0 ? "3사분면"
//												: x > 0 && y < 0 ? "4사분면" : "원점";
//		System.out.println(result);
//		
	}
}
