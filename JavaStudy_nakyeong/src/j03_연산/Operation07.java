package j03_연산;

public class Operation07 {

	public static void main(String[] args) {
		
		//윤년 공식 = 4의 배수이면서, 100의 배수가 아니거나, 400의 배수인것
		//참이면 윤년. 
		//거짓이면 윤년이 아님
		
		int year = 1999;
		 
		String result = null;
		result = year % 4 == 0 
		&& year % 100 != 0 
		         || year % 400 == 0 ? "윤년이다" : "윤년이 아니다";  
//		         String result 자료형과 변수명은 1번만 쓰는거다. 
		       //그리고 그 뒤부터는 result 변수명에다가 내용을 넣어서 쭉쭉 적으면 된다.

		System.out.println("결과: " + result);
		

		
		
	}

}

// 클래스는 첫자를 대문자로 적어야한다. 





