package br.com.cursojava.aula10web.home;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

@ManagedBean
@RequestScoped
public class HomeBean {

	private final String titulo = "Bem vindo ao JSF";
	
	public String getTitulo() {
		return titulo;
	}
}
