package br.com.ricardobelfort.entities;

public class Client {
	private String name;
	private String email;
	
	public Client(String name, String email) {
		super();
		this.name = name;
		this.email = email;
	}

	public String getName() {
		return name;
	}

	public String getEmail() {
		return email;
	}
	
	
}
