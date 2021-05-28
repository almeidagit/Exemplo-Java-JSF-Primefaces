package br.com.user.controller;

import java.io.Serializable;

import javax.faces.view.ViewScoped;
import javax.inject.Named;

@Named("LoginBean")
@ViewScoped
public class LoginBean implements Serializable {

	private static final long serialVersionUID = 1L;

	private String usuario ="admin";

	private String senha ="admin";

	public String validador() {

		if (this.getUsuario().equals(this.getSenha())) {

			System.out.println("ok");

			return "cadastro";
		}

		System.out.println("x");

		return "login";

	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

}
