package j12.상속;

public class Test1 extends Test{
	
	public Test1() {
		super();
		System.out.println("T1생성자 호출");
		System.out.println("T1에서 확인"+super.toString());
	}
}


