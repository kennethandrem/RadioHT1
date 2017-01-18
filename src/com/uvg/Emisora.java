package com.uvg;

public class Emisora implements IRadio{

	private String nombre;
	private boolean fMaM;
	private float numEstacion;

	public Emisora(String nombre, boolean fMaM, float numEstacion) {
		this.nombre = nombre;
		this.fMaM = fMaM;
		this.numEstacion = numEstacion;
	}
	
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public boolean isfMaM() {
		return fMaM;
	}
	public void setfMaM(boolean fMaM) {
		this.fMaM = fMaM;
	}
	public float getNumEstacion() {
		return numEstacion;
	}
	public void setNumEstacion(float numEstacion) {
		this.numEstacion = numEstacion;
	}
	
}
