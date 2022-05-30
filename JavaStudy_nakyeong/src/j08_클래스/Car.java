package j08_클래스;

public class Car {
	String company;
	String model;
	String color;
	
	void showCompanyInfo() {
		System.out.println(company+"회사에서 제조된 차량입니다.");
	}
	
	void showInfoAll() {
		System.out.println("제조사 : "+company);
		System.out.println("모델 : "+model);
		System.out.println("색상 : "+color);
	}
	
	String getCar() {
		return company+"_"+model+"_"+color;
	}
	
	void setColor(String color) {
		this.color = color;
	}


	
	
	
	
//	String company;
//	String model;
//	String color;	
//	
//	void showCompanyInfo(){
//		System.out.println(company + "회사에서 제조된 차량입니다. ");
//	}
//	
//	void showInfoAll() {
//		System.out.println("제조사: "+company);
//		System.out.println("모델: "+model);
//		System.out.println("색상: "+color);
//	}
//	
//	String getCar() {
//		return company + "_" + model + "_" + color; 
//	}
//	
//	void setColor(String color) {
//		this.color =  color;
//	}
	// 변수명이 같아서, 오류가 난다. color = color; 
	// this.color this는 자기자신의 주소다. 우리가 주소 참조를 할 때는 점을 찍었다. 
	//this 넣어주면 동일한 변수명을 써도 된다.  
	// this.color가 전역변수가 됐다!!
	
	
	
	
}
