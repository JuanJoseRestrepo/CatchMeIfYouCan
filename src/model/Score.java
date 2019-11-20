package model;

public class Score {

	
	private int puntaje;
	private String nombre;
	private int num;
	public Score(int puntaje, String nombre, int num) {
		super();
		this.puntaje = puntaje;
		this.nombre = nombre;
		this.num = num;
	}
	public int getPuntaje() {
		return puntaje;
	}
	public void setPuntaje(int puntaje) {
		this.puntaje = puntaje;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	
	
	
}
