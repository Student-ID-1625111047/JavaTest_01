package cn.edu.hqu.cst.javaee.HuaMent.entity;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.hibernate.validator.constraints.Email;

public class Hquer {
	private Long id;
	@NotNull
	@Size(min=2,max=30)
	private String firstName;
	@NotNull
	@Size(min=5,max=16)
	private String userName;
	@NotNull
	@Size(min=5,max=25)
	private String password;
	@NotNull
	@Size(min=2,max=30)
	private String lastName;
	@NotNull
	@Email
	private String email;
	public Hquer() {
		
	}
	public Hquer(Long id, String userName, String password, String firstName, String lastName, String email) {
		super();
		this.id = id;
		this.userName = userName;
		this.password = password;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
	}
	public Hquer(String userName,String password,String firstName,String lastName,String email) {
		this(null,userName,password,firstName,lastName,email);
		
	}
	
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	@Override
	public boolean equals(Object that) {
		// TODO Auto-generated method stub
		return EqualsBuilder.reflectionEquals(this, that, "firstName","lastName","userName","password","email");
	}
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return HashCodeBuilder.reflectionHashCode(this, "firstName","lastName","userName","password","emial");
	}
}
