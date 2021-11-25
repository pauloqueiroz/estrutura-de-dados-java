package com.paulo.estruturadados.listaencadeada;

public class No<T> {
	
	private T item;
	
	private T proximo;

	public No(T item) {
		super();
		this.item = item;
		this.proximo = null;
	}

	public No(T item, T proximo) {
		super();
		this.item = item;
		this.proximo = proximo;
	}

	public T getItem() {
		return item;
	}

	public void setItem(T item) {
		this.item = item;
	}

	public T getProximo() {
		return proximo;
	}

	public void setProximo(T proximo) {
		this.proximo = proximo;
	}

	@Override
	public String toString() {
		return "No [item=" + item + ", proximo=" + proximo + "]";
	}

}
