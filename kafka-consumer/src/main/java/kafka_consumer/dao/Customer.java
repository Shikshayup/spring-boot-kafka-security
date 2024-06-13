package kafka_consumer.dao;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Customer {

	
	private int id;
	private String name;
	private String email;
    @JsonProperty("contactno") // Use this annotation to specify the JSON key
	private String contactno;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getContactno() {
		return contactno;
	}
	public void setContactno(String contactno) {
		this.contactno = contactno;
	}
	@Override
	public String toString() {
		return "Customer [id=" + id + ", name=" + name + ", email=" + email + ", contactno=" + contactno + "]";
	}

	
	
	
}
