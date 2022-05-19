package j04_입력;

import java.util.Scanner;

public class Input03 {

	public static void main(String[] args) {
		/*
		 * [개인정보 입력] 
		 * 이름: 김준일  String
		 * 나이: 29             Int
		 * 연락처: 010-9988-1916   String
		 * 주소: 부산 동래구 사직동  String
		 * 성별: 남                 Char
		 * 
		 * 
		 * [개인정보 출력] 
		 * 이름=> 김준일  String
		 * 나이=> 29
		 * 연락처=> 010-9988-1916
		 * 주소=> 부산 동래구 사직동
		 * 성별=> 남
		 */
		
		Scanner scanner = new Scanner (System.in);
		String name = null;
		int age = 0;
		String phone = null;
		String address = null;
		char gender = 0;
		
		System.out.println("[개인정보 입력]");
		System.out.print("이름: ");
		name = scanner.next();   //띄어쓰기가 안되니까.
		
		System.out.print("나이: ");
		age = scanner.nextInt(); //29엔터
		
		System.out.print("연락처: ");
		phone = scanner.next();    // 010-9988-1916 엔터. 그런데 엔터는 출력안되고 버퍼에 남겨둠.
		scanner.nextLine();        // 버퍼에 남겨둔 엔터를 얘가 흡수함.
		                           // next에 엔터친걸 버퍼에 남겨두지, 사라지는건아니다. 다른게 나오면 상관없는데
		                           // 이 밑에 nextLine이 나오기 때문에 이 엔터를 없애줘야하는것
		
		System.out.print("주소: ");
		address = scanner.nextLine(); 
		
		System.out.print("성별: ");   
		gender = scanner.next().charAt(0); 
		
		System.out.println();
		System.out.println();
		
		System.out.println("[개인정보 출력]");
		System.out.println("이름=> "+name);
		System.out.println("나이=> "+age);
		System.out.println("연락처=> "+phone);
		System.out.println("주소=> "+address);
		System.out.println("성별=> "+gender);
		
//		Scanner scanner = new Scanner (System.in);
//		String address = null; 
//		
//		System.out.print("주소: ");
//		address = scanner.nextLine();
//		address = scanner.nextLine();
//		address = scanner.nextLine();
//		System.out.print("연락처: ");
//		address = scanner.nextLine();
//		
//		System.out.println(address);

	}

}
