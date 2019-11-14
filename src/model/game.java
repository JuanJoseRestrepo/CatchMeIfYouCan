package model;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;

public class game implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int nivel;
	private int puntaje;
	private ArrayList<Balls> bolas;
	private ArrayList<Score> puntajes;
	public game(int nivel, int puntaje) {
		super();
		this.nivel = nivel;
		this.puntaje = puntaje;
		bolas = new ArrayList<Balls>();
		puntajes =new ArrayList<Score>();
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
	public ArrayList<Score> getPuntajes() {
		return puntajes;
	}
	public void setPuntajes(ArrayList<Score> puntajes) {
		this.puntajes = puntajes;
	}
	
	public void readGame() {
		File fl = new File("files\\Juego.txt");
		try {
			FileReader fr = new FileReader(fl);
			BufferedReader br = new BufferedReader(fr);
			br.readLine();
			int a = Integer.parseInt(br.readLine()); 
			game gamenew = new game(a,0);
			br.readLine();
			String a1 = br.readLine();
			while(a1 != null) {
				String[] b = a1.split(",");
				int radio = Integer.parseInt(b[0]);
				int posX = Integer.parseInt(b[1]);
				int posY = Integer.parseInt(b[2]);
				int espera = Integer.parseInt(b[3]);
				String direccion = b[4];
				int rebotes = Integer.parseInt(b[5]);
				String stopped = b[6];
				if(stopped.equalsIgnoreCase("false")) {
					Balls m = new Balls(radio,posX,posY,espera,direccion,rebotes,false);
					bolas.add(m);
				}else {
					Balls m1 = new Balls(radio,posX,posY,espera,direccion,rebotes,true);
					bolas.add(m1);
				}
				a1 = br.readLine();
			}
			br.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
	}
	
	public void serializableGame() {
		File fl = new File("files/");
		
		try {
			FileOutputStream  fos = new FileOutputStream(fl);
			ObjectOutputStream  oos = new ObjectOutputStream(fos);
			
			oos.writeObject(puntajes);
			oos.close();
			
		}catch(IOException e) {
			e.getCause();
		}
		
	}
	
	public void deserializableGame() {
		File fl = new File("files/");
		ArrayList<Score> score1;
		try {
			FileInputStream fls = new FileInputStream(fl);
			ObjectInputStream ois = new ObjectInputStream(fls);
			 score1 = (ArrayList<Score>) ois.readObject();
			 setPuntajes(score1);
			 ois.close();		
		}catch(IOException e) {
			
		}catch(ClassNotFoundException e) {
			
		}
		
	}
	
	public void startGame() {
		
		for(int i = 0; i < bolas.size();i++) {
			
		}
		
	}
	
}
