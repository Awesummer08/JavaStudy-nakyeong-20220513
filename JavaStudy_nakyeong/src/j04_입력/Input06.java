package j04_입력;

import java.util.Scanner;

public class Input06 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int A = 0;
		int B = 0; 
		
		System.out.println("A와 B 값의비교");
		System.out.print("A의 값 ");
		A = scanner.nextInt();
		System.out.print("B의 값 ");
		B = scanner.nextInt();
		
		System.out.println(A > B ? ">" 
				: A < B ? "<" : "==");

	}

}
