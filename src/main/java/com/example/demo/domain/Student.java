package com.example.demo.domain;

public class Student {
	
	private Long id;
	private String Ad;
	private String SoyAd;
	private String Sinif;	
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getAd() {
		return Ad;
	}

	public void setAd(String ad) {
		Ad = ad;
	}

	public String getSoyAd() {
		return SoyAd;
	}

	public void setSoyAd(String soyAd) {
		SoyAd = soyAd;
	}

	public String getSinif() {
		return Sinif;
	}

	public void setClass(String class1) {
		Sinif = class1;
	}

	public Student(Long id, String ad, String soyAd, String class1) {
		
		this.id = id;
		Ad = ad;
		SoyAd = soyAd;
		Sinif = class1;
	}
	
	
	

}
