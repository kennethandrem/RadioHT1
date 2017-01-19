//Kenneth Martínez 16976
//Gadhi Rodriguez 16206

package com.uvg;

public class Emisora implements iRadio{

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


	@Override
	public void OnOff() {
		// TODO Auto-generated method stub
		
	}


	@Override
	public boolean isOn() {
		// TODO Auto-generated method stub
		return false;
	}


	@Override
	public String getFrecuency() {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public void changeFrecuency() {
		// TODO Auto-generated method stub
		
	}


	@Override
	public String getStation() {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public void Forward() {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void Backward() {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void setMemory(int Position) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public String ToString() {
		// TODO Auto-generated method stub
		return null;
	}
	
}
