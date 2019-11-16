package model;

public class Balls {

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
	
	public void move(double maxX, double maxY,String direction) {
		double advance = 10;
		double radius = radio/2;
		switch(direction) {
			case "ABAJO":
				if(posY+advance+radius>maxY) {
					direction = "ARRIBA";
					posY = (int) (maxY-radius);
				}else {
					posY = (int) (posY+advance);					
				}
				break;
			case "DERECHA":
				if(posX+advance+radius>maxX) {
					direction = "IZQUIERDA";
					posX = (int) (maxX-radius);
				}else {
					posX = (int) (posX+advance);					
				}
				break;
			case "ARRIBA":
				if(posY-advance-radius<0) {
					direction = "ABAJO";
					posY = (int) radius;
				}else {
					posY = (int) (posY-advance);			
				}
				break;
			case "IZQUIERDA":
				if(posX-advance-radius<0) {
					direction = "DERECHA";
					posX = (int) radius;
				}else {
					posX = (int) (posX-advance);			
				}
				break;
			}
		}

	
}
