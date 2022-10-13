package org.tukorea.myweb.domain;

public class ShoesVO {

	private String pid;
	private String pname;
	private String price;
	private String brand;
	private String color;
	private String inven;

	
	public String getPid() {
		return pid;
	}
	public void setPid(String pid) {
		this.pid = pid;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public String getPrice() {
		return price;
	}
	public void setprice(String price) {
		this.price = price;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getInven() {
		return inven;
	}
	public void setInven(String inven) {
		this.inven = inven;
	}
	

	@Override
	public String toString() {
		return "ShoesVO [pid=" + pid + ", pname=" + pname + ", price=" + price + ", brand=" + brand + ", color=" + color + ", inventory=" + inven + "]";
	}

	
}
