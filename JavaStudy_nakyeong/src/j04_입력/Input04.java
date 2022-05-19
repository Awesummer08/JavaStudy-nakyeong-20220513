package j04_입력;

import java.util.Scanner;

public class Input04 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner (System.in);
		String outline = null;
		String director = null;
		String grade = null;
		String number = null;
		String summery = null;
		String summery2 = null;
		
		System.out.print("개요 ");
		outline = scanner.nextLine();
		System.out.print("감독 ");
		director = scanner.nextLine();
		System.out.print("등급 ");
		grade = scanner.nextLine();
		System.out.print("흥행 ");
		number = scanner.nextLine();
		System.out.println("줄거리");
		summery = scanner.nextLine();
		summery2 = scanner.nextLine();
		
		System.out.println("개요 "+outline);
		System.out.println("감독 "+director);
		System.out.println("등급 "+grade);
		System.out.println("흥행 "+number);
		System.out.println("줄거리");
		System.out.println(summery);
		System.out.println(summery2);
		

	}

}
