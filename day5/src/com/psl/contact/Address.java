package com.psl.contact;

public class Address{
	
	String area;
	String city;
	String pincode;
	String state;
	
	String country;
	
	public Address(String area,String city,String pincode,	String state,String country){
		this.area=area;
		this.city=city;
		this.country=country;
		this.pincode=pincode;
		this.state=state;
		
	}
}