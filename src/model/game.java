package model;

import java.util.ArrayList;

public class game {

	private int nivel;
	private int puntaje;
	private ArrayList<Balls> bolas;
	private Score[][] puntajes;
	public game(int nivel, int puntaje) {
		super();
		this.nivel = nivel;
		this.puntaje = puntaje;
		bolas = new ArrayList<Balls>();
		puntajes = new Score[10][10];
	}
	public int getNivel() {
		return nivel;
	}
	public void setNivel(int nivel) {
		this.nivel = nivel;
	}
	public int getPuntaje() {
		return puntaje;
	}
	public void setPuntaje(int puntaje) {
		this.puntaje = puntaje;
	}
	public ArrayList<Balls> getBolas() {
		return bolas;
	}
	public void setBolas(ArrayList<Balls> bolas) {
		this.bolas = bolas;
	}
	public Score[][] getPuntajes() {
		return puntajes;
	}
	public void setPuntajes(Score[][] puntajes) {
		this.puntajes = puntajes;
	}
	
	
	
	
}
