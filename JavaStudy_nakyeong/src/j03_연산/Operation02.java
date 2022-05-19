package j03_연산;

public class Operation02 {

	public static void main(String[] args) {
	/*
	 * 논리연산자
	 * 
	 * AND => &&  - 곱   
	 * => 모든 조건이 참일때 True의 결과를 가짐. 
	 * => 하나라도 거짓이라면 False의 결과를 가짐.
	 * 
	 * 
	 * OR  => ||  - 합  
	 * => 모든 조건이 거짓일때 False의 결과를 가짐.
	 * => 하나라도 참이라면 True의 결과를 가짐
	 * 
	 * NOT => !   - 부정
	 * => !(t && t) => f
	 * => !(f && f) => t
	 * 
	 * 숫자로 참과 거짓
	 * 0(false)
	 * !0(true)
	 * 
	 * t(1) && t(1) => t(1)    1곱하기 1은 1
	 * t(1) && f(0) => f(0)    1곱하기 0은 0
	 *
	 * t(1) || t(1) => t(2)
	 * t(1) || f(0) => t(1)
	 * f(0) || f(0) => f(0)
	 * */
		
		
		

		
		
		int num = 10;
		
		boolean result1 = num > 5;
		boolean result2 = num == 10;
		
		System.out.println("result1: "+result1);
		System.out.println("result2: "+result2);
		
		System.out.println("result1 AND result2: "+(result1 && result2));

		
		
		
		
		
		

	}

}
