package j03_연산;

public class Operation06 {

	public static void main(String[] args) {
		int num = 80;
		
		//삼항 연산자
//		String result = num % 4 == 0 ? "4의 배수" : "4의 배수가 아님";   //결과가 스트링
//		boolean result2 = num % 4 == 0 ? true : false;   //결과가 불리언
//		int result3 = num % 4 == 0 ? 1 : 0;   //1은 true 0은 false   결과가 int
//		
//		double result4 = num % 4 == 0 ? 2 : 1.5; // 이게 업캐스팅
//		//삼항연산자의 결과는 동일한 자료형을 사용해라. 업캐스팅은 가능하다.
		
		String result = num % 4 == 0 ? "4의 배수"  : "4의 배수가 아님";
		boolean result2 = num % 4 == 0 ? true : false;
		int result3 = num % 4 == 0 ? 1 : 0 ;
		 
		double result4 = num % 4 == 0 ? 1.0 : 0; // 업캐스팅이 된것. int를 넣어도 되니까.
		

		System.out.println(result);
		System.out.println(result2);
		System.out.println(result3);
		System.out.println(result4);

		
	}

}
