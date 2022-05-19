package j04_입력;

import java.util.Scanner;

public class Input02 {

	public static void main(String[] args) {
/*
 * 문자열2 입력: nextLine()
 * 문자열1 입력: next()
 * 문자 입력: next().charAt(0)
 * 정수 입력: nextInt()
 * 실수 입력: nextDouble()
 * 
 * 
 */
//		Scanner scanner = new Scanner(System.in);
//		내가 한 풀이
//		System.out.print("문자열1 입력: ");
//		String str = scanner.nextLine();
//		
//		System.out.print("문자열2 입력: ");
//		String str2 = scanner.next();
//		
//		System.out.print("문자 입력: ");
//		char character = scanner.next().charAt(0);
//		
//		System.out.print("정수 입력: ");
//		int integer = scanner.nextInt();
//		
//		System.out.print("실수 입력: ");
//		double dou = scanner.nextDouble();
//		
//		System.out.println(str);
//		System.out.println(str2);
//		System.out.println(character);
//		System.out.println(integer);
//		System.out.println(dou);
		
		Scanner scanner = new Scanner (System.in);
		String a = null;
		String b = null;
		char c = 0;
		int d = 0;
		double e = 0;
		
		System.out.println("문자열1 입력: ");
		a = scanner.nextLine();
		System.out.println("문자열2 입력: ");
		b = scanner.next();
		System.out.println("문자 입력: ");
		c = scanner.next().charAt(0);
	    System.out.println("정수 입력: ");
		d = scanner.nextInt();
	    System.out.println("실수 입력: ");
		e = scanner.nextDouble();
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);
		
		
		
		
		
		
		
		
		
		
		
		
		
	
	}

}
