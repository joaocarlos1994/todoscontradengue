package br.com.fatec.api.entity;

public class Endereco {
	
	private String rua; //////////////////aaaaaaaaaaaaabbbbbbb
	public String getRua() {
		return rua;
	}
	public void setRua(String rua) {
		this.rua = rua;
	}
	public String getCep() {
		return cep;
	}
	public void setCep(String cep) {
		this.cep = cep;
	}
	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	public String getEstado1() {
		return estado1;
	}
	public void setEstado1(String estado1) {
		this.estado1 = estado1;
	}
	public String getA() {
		return a;
	}
	public void setA(String a) {
		this.a = a;
	}
	private String cep;
	private String cidade;
	private String estado;
	private String estado1;
	private String a;
	
}
