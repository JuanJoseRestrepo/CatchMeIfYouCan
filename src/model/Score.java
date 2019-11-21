package model;

import java.io.Serializable;

public class Score implements Serializable {

	
	private int puntaje;
	private String nombre;
	private int nivel;
	public Score(int puntaje, String nombre,int nivel) {
		super();
		this.puntaje = puntaje;
		this.nombre = nombre;
		this.setNivel(nivel);
	}
<<<<<<< HEAD
	public int getPuntaje() {
		return puntaje;
	}
	public void setPuntaje(int puntaje) {
=======
<<<<<<< HEAD
	public int getPuntaje() {
		return puntaje;
	}
	public void setPuntaje(int puntaje) {
=======
	public double getPuntaje() {
		return puntaje;
	}
	public void setPuntaje(double puntaje) {
>>>>>>> e7016384fff3e494ae384b3d60f38dfd85349408
>>>>>>> 5ac06eec34d6dd0c1bd26e2d13ac2ddc74513375
		this.puntaje = puntaje;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
<<<<<<< HEAD
	public int getNivel() {
		return nivel;
	}
	public void setNivel(int nivel) {
		this.nivel = nivel;
	}


	public String toString() {
		String msj = "";
		
		msj += "El puntaje es:" + puntaje + " " + "\n";
		msj += "El nombre es:" + nombre + " " + "\n";
		msj += "El nivel es:" + nivel + " " + "\n";
		
		return msj;
		
	}
=======
<<<<<<< HEAD
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
=======


>>>>>>> e7016384fff3e494ae384b3d60f38dfd85349408
	
>>>>>>> 5ac06eec34d6dd0c1bd26e2d13ac2ddc74513375
	
	 
	
}
