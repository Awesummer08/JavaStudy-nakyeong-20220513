package j05_조건;

import java.util.Scanner;

public class If03 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int score = 0;
		
		System.out.print("점수를 입력하세요");
		score = scanner.nextInt();
		
		
		//첫번째 조건은 점수가 계산할 수 있는 범위여야한다.
		if(score < 0 || score > 100) {
			System.out.println("계산할 수 없는 점수입니다.");
		}else if(score > 89) {
			System.out.println("A");
		}else if(score > 79) {
			System.out.println("B");
		}else if(score > 69 ) {
			System.out.println("C");
		}else if(score > 59) {
			System.out.println("D");
		}else{
			System.out.println("F");
		}
		

		
	
	}

}
