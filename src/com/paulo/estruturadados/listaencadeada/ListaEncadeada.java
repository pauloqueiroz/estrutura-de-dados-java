package com.paulo.estruturadados.listaencadeada;

public class ListaEncadeada<T> {
	
	private No<T> inicio;

	public ListaEncadeada(No<T> inicio) {
		super();
		this.inicio = inicio;
	}

	public No<T> getInicio() {
		return inicio;
	}

	public void setInicio(No<T> inicio) {
		this.inicio = inicio;
	}

}
