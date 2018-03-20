package br.usjt.arqsw.entity;

import java.io.Serializable;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 * 
 * @author Arthur Santos
 *
 */
public class Usuario implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	private int id;
	
	@NotNull
	@Size(min=1, max=45, message="O username deve estar entre 5 e 45 caracteres.")
	private String username;
	
	@NotNull
	@Size(min=1, max=45, message="A senha deve estar entre 5 e 45 caracteres.")
	private String password;
	
	public Usuario() {
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
}
