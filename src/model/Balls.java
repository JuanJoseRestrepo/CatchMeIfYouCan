package model;

import com.sun.javafx.scene.traversal.Direction;

public class Balls {

private enum Direction{Derecha, Izquierda,Arriba,Abajo};
	private int radio;
	private int posX;
	private int posY;
	private int espera;
	private String direccion;
	private int robetes;
	private boolean stop;
	
	
	public Balls(int radio, int posX, int posY, int espera, String direccion, int robetes, boolean stop) {
		super();
		this.radio = radio;
		this.posX = posX;
		this.posY = posY;
		this.espera = espera;
		this.direccion = direccion;
		this.robetes = robetes;
		this.stop = stop;
	}
	public int getRadio() {
		return radio;
	}
	public void setRadio(int radio) {
		this.radio = radio;
	}
	public int getPosX() {
		return posX;
	}
	public void setPosX(int posX) {
		this.posX = posX;
	}
	public int getPosY() {
		return posY;
	}
	public void setPosY(int posY) {
		this.posY = posY;
	}
	public int getEspera() {
		return espera;
	}
	public void setEspera(int espera) {
		this.espera = espera;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public int getRobetes() {
		return robetes;
	}
	public void setRobetes(int robetes) {
		this.robetes = robetes;
	}
	public boolean isStop() {
		return stop;
	}
	public void setStop(boolean stop) {
		this.stop = stop;
	}
	
	public Double distance(Balls m) {
    	double pow1 = Math.pow((posX - m.getPosX()), 2);
    	double pow2 = Math.pow((posY - m.getPosY()), 2);
    	pow1 = pow1 + pow2;
		return Math.sqrt(pow1);
	}
	
}
