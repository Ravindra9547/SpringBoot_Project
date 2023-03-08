package com.spring.ci;

public class Trainer {

	private String name;
	private Integer id;
	
	Subject subject;

	public Trainer(String name, Integer id, Subject subject) {
		super();
		this.name = name;
		this.id = id;
		this.subject = subject;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getId() {
		return id;
	}

	public Subject getSubject() {
		return subject;
	}

	@Override
	public String toString() {
		return "Trainer [name=" + name + ", id=" + id + ", subject=" + subject + "]";
	}
}
