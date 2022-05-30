package j08_클래스;

public class CalculatorDemo2 {

	public static void sum(int left, int right) {
		System.out.println(left + right);

	}
	
	public static void main(String[] args) {
		sum(10, 20);
		sum(20, 40);
	}

}


//메소드를 이용해서 코드를 리팩토링했다. 코드가 훨씬 깔끔해졌다.
//하지만 메소드를 이용해서 코드를 짜다보면 코드가 많아진다. 그래서 코드가 복잡해진다.


