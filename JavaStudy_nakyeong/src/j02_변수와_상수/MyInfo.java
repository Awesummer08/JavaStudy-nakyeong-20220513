package j02_변수와_상수;

public class MyInfo {

	public static void main(String[] args) {
		//주석
		/*
		 * 메모,필기
		 */
		
		
		char name1 = '곽';
		char name2 = '나';
		char name3 = '경';
		int age = 30;
		String phone = "010-2916-9327";
		String address = "부산 연제구 연산동";
		
		System.out.println("이름 : "+name1+name2+name3);
		//문자열이랑 유니코드랑 합친거라서, 숫자로 변환안되고 CHAR성격 그대로 나옴
		// 그냥 문자열로 나온다.
		System.out.println("나이 : "+age);
		System.out.println("연락처 : "+phone);
		System.out.println("주소 : "+address);
		
		System.out.println("세수의 합: " + 10 + 20 + 30);
		//위처럼 문자 + 숫자하니까 문자열이 된다. 그래서 60 이 아니라 세수의 합 : 102030 으로나옴
		
		System.out.println("세수의 합: " + (10 + 20 + 30));
		// 60이 나옴. 우선순위를 잡아주는 것
		
		
		
	}

}
