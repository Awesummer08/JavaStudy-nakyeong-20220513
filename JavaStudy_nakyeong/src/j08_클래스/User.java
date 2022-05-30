package j08_클래스;

public class User {
	String name;
	String age;
	String phone;
	String address;
	
	User(){//기본생성자
		System.out.println("생성.");
	}
	
	User(String name){//사용자정의 생성자
		this.name = name;
	}
	
	User(String name, String age, String phone, String address){
		this.name = name;
		this.age = age;
		this.phone = phone;
		this.address = address;
	}
	
	void setName(String name) {
		this.name = name;
	}

	void showInfoAll() {
		System.out.println(name+age+phone+address);
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getName() {
		return name;
	}
	
	
	
	
}
