package model;

public class Phones {
 private int ddd;
 private String numero,tipo;
 
 
 public Phones() {
	 
 }
 
public Phones(int ddd, String numero, String tipo) {
	
	this.ddd = ddd;
	this.numero = numero;
	this.tipo = tipo;
}
public int getDdd() {
	return ddd;
}
public void setDdd(int ddd) {
	this.ddd = ddd;
}
public String getNumero() {
	return numero;
}
public void setNumero(String numero) {
	this.numero = numero;
}
public String getTipo() {
	return tipo;
}
public void setTipo(String tipo) {
	this.tipo = tipo;
}
@Override
public String toString() {
	return "Phones [ddd=" + ddd + ", numero=" + numero + ", tipo=" + tipo + "]";
}
 
}
