package org.tukorea.myweb.domain;

public class MemberVO {

	private String id;
	private String passwd;
	private String name;
	private String num;
	private String address;


	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPasswd() {
		return passwd;
	}
	public void setPasswd(String passwd) {
		this.passwd = passwd;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getNum() {
		return num;
	}
	public void setNum(String num) {
		this.num = num;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	

	@Override
	public String toString() {
		return "StudentVO [id=" + id + ", passwd=" + passwd + ", name=" + name + ", num=" + num + ", address="
				+ address + "]";
	}

	
}
