package dataDriven;


public class Pojo {
	
	private String first_name;
	private String last_name;
	private String email;
	private String gender;
	private String contact;
	private String birthDate;
	private String subject;
	private String hobby;
	private String address;
	private String state;
	private String city;
	
	
	
	public Pojo(String first_name, String last_name, String email, String gender, String contact, String birthDate,
			String subject, String hobby, String address, String state, String city) {
		// TODO Auto-generated constructor stub
		this.first_name = first_name;
		this.last_name = last_name;
		this.email = email;
		this.gender = gender;
		this.contact = contact;
		this.birthDate = birthDate;
		this.subject = subject;
		this.hobby = hobby;
		this.address = address;
		this.state = state;
		this.city = city;
		
		
	}
	public String getFirst_name() {
		return first_name;
	}
	public void setFirst_name(String firsSt_name) {
		this.first_name = firsSt_name;
	}
	public String getLast_name() {
		return last_name;
	}
	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getContact() {
		return contact;
	}
	public void setContact(String contact) {
		this.contact = contact;
	}
	public String getBirthDate() {
		return birthDate;
	}
	public void setBirthDate(String birthDate) {
		this.birthDate = birthDate;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public String getHobby() {
		return hobby;
	}
	public void setHobby(String hobby) {
		this.hobby = hobby;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	@Override
	public String toString() {
		return "User [first_name=" + first_name + ", last_name=" + last_name + ", email=" + email + ", gender=" + gender
				+ ", contact=" + contact + ", birthDate=" + birthDate + ", subject=" + subject + ", hobby=" + hobby
				+ ", address=" + address + ", state=" + state + ", city=" + city + "]";
	}
	
	
	

}
