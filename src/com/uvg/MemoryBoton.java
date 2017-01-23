/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.uvg;

/**
 *
 * @author OscarIvan
 */
public class MemoryBoton implements iBoton{

    String frecuency;
    String station; 
    
    public MemoryBoton (String frecuency, String station)
    {
        this.frecuency= frecuency;
        this.station = station;
    }
    
    public void Hold(String frecuency, String station) {
        this.frecuency = frecuency;
        this.station = station;
    }
	@Override
	public String PushFrequency() {
		// TODO Auto-generated method stub
		return frecuency;
	}
	@Override
	public String PushStation() {
		// TODO Auto-generated method stub
		return station;
	}

    
}
