 package j08_클래스;

/*
 * 1. Car 클래스를 만든다.
 * 2. Car 클래스의 속성(변수) 제조사(Company) 모델 (model)  color(색상)
 * 3. Car 클래스의 기능 (메소드) 
 * showCmopanyInfo() ->  000회사에서 제조된 차량입니다. 
 * showInfoAll() ->
 * 제조사 : 000
 * 모델 : 00
 * 색상 : 화이트
 * getCar() -> return "KIA_K5_화이트"  main에서 출력도 해야함
 * setColor() -> 매개변수에 색상을 받아서 color 변수의 값을 변경
 * 
 * 
 * 3개를 만들어서 각각 집어넣고,
 * set컬러를 사용해서 중간중간 컬러를 호출해라.
 * KIA, K7, 블랙(블루)   setColor
 * 현대자동차, 소나타, 화이트(그레이)
 * Tesla, Model3, 레드(그린)
 * */


public class CarMain {

	public static void main(String[] args) {
		Car c1 = new Car();
		Car c2 = new Car();
		Car c3 = new Car();
		
		c1.company = "테슬라";
		c2.company = "기아";
		c3.company = "벤츠";
		
		c1.model = "a";
		c2.model = "b";
		c3.model = "s";
		
		c1.color = "pink";
		c2.color = "red";
		c3.color = "green";
		
		c1.showCompanyInfo();
		c1.showInfoAll();
		c2.showCompanyInfo();
		c2.showInfoAll();
		c3.showCompanyInfo();
		c3.showInfoAll();
		
		System.out.println(c1.getCar());
		System.out.println(c2.getCar());
		System.out.println(c3.getCar());
		
		c1.setColor("브라운");
		c2.setColor("블루");
		c3.setColor("레드");

		System.out.println();
		System.out.println();
		System.out.println();
		
		c1.showInfoAll();
		c2.showInfoAll();
		c3.showInfoAll();
		
//		Car c1 = new Car();
//		Car c2 = new Car();
//		Car c3 = new Car();
//		
//		c1.company = "KIA";
//		c2.company = "현대자동차";
//		c3.company = "Tesla";
//	
//		c1.model = "K7";
//		c2.model = "소나타";
//		c3.model = "Model3";
//
//		c1.color = "블랙";
//		c2.color = "화이트";
//		c3.color = "레드";
//
//		c1.showCompanyInfo();
//		c2.showCompanyInfo();
//		c3.showCompanyInfo();
//
//		c1.showInfoAll();
//		c2.showInfoAll();
//		c3.showInfoAll();
//		
//		System.out.println();
//		
//		System.out.println(c1.getCar());
//		System.out.println(c2.getCar());
//		System.out.println(c3.getCar());
//		
//		System.out.println();
//		
//		c1.setColor("블루");
//		c2.setColor("그레이");
//		c3.setColor("그린");
//	
//		c1.showInfoAll();
//		c2.showInfoAll();
//		c3.showInfoAll();
//		

	}
	
	
	

}
