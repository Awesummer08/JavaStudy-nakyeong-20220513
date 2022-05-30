package j10_클래스기본정리.repository;

/*
 * 
 * Entity(독립체) Class
 * 
 * 각각의 데이터를 저장할 수 있는. 정보만 가지고 있는 클래스가 엔티티 클래스다. 
 * 정보만 담는 객체를 엔티티 객체라고 한다. 
 * 
 * 
 * 
 * */


public class User {
	private String usercode;
	private String email;
	private String name;
	private String username;
	private String password;
	//엔티티 클래스는 보통 변수밖에없다.
	// 아래있는 생성자 getter setter들은 다 이 변수만을 위해서 존재한다.
	
	

	
//기본생성자
	public User() {}

	//전체생성자
	public User(String usercode, String email, String name, String username, String password) {
		this.usercode = usercode;
		this.email = email;
		this.name = name;
		this.username = username;
		this.password = password;
	}

	//getter & setter
	public String getUsercode() {
		return usercode;
	}

	public void setUsercode(String usercode) {
		this.usercode = usercode;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "User [usercode=" + usercode + ", email=" + email + ", name=" + name + ", username=" + username
				+ ", password=" + password + "]";
	}




}
