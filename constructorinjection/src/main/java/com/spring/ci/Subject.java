package com.spring.ci;

public class Subject {

	private String subName;
	
	public Subject(String subName) {
		super();
		this.subName = subName;
	}

	public String getSubName() {
		return subName;
	}

	@Override
	public String toString() {
		return "Subject [subName=" + subName + "]";
	}
	
	
}
