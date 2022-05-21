package j07_메소드;

// 클래스 안에 정의된 함수를 메소드라고 한다.

public class Method02 {

	// 매개변수가 없으면서 반환도 없는 메소드
	public static void test1() {
		System.out.println("text1 메소드 실행");
	}
	
	//매개변수가 없고 반환이 있는 메소드
	public static String test2() {
		return "김준일";
	}
	
	public static int test3() {
		return 10000;
	}
	
	
	//매개변수는 있고 반환은 없는 메소드
	public static void test4(int age, int year) {
		System.out.println("나이: "+age);
		System.out.println("출생년도: "+year);
	}
	
	
	//매개변수도 있고 반환도 있는 메소드
//	public static String test5(String name, int num) {
//		return name + num; //문자열 + 숫자면 String 문자열이다.
//	}
	
	public static String test5(String name, int num) {
		return name + num; 
	}
	

	// 리턴자료형이 void일 때 메소드를 강제로 탈출하는 방법
//	public static void test6() {
//		for(int i =0; i < 10; i++) {
//			System.out.println(i);
//			if(i == 6) {
//				System.out.println("메소드 탈출");
//				break;
//			}
//		}
//		System.out.println("test6가 정상 종료되었습니다.");
//	}
//		

	// 리턴자료형이 void일 때 메소드를 강제로 탈출하는 방법
//	public static void test6() {
//		for(int i =0; i < 10; i++) {
//			System.out.println(i);
//			if(i == 6) {
//				System.out.println("메소드 탈출");
//				return;
//			}
//		}
//	}
	
	public static void test6() {
		for(int i = 0; i < 10; i++) {
			System.out.println(i);
			if(i == 6) {
				System.out.println("메소드 탈출");
				return;
			}
		}
	}
	
	
		
	
	public static void main(String[] args) {
		System.out.println("메인함수 시작");
		
		test1(); //호출
		
		String name = test2();   //그 자체로 값이기 때문에 변수에 담을 수도 있다.
		System.out.println(name);    // 그 자체로 출력도 가능하다.  
		
		test4(30, 1993); //호출
		
		System.out.println(test5("김준일", 1));
		
		test6();
 		System.out.println("메인함수 끝");

	}

}
