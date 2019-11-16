package Thread;

import java.util.ArrayList;

import Controller.MainController;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import model.Balls;

public class ThreadPaintGame extends Thread{

	private Balls balls;
	private MainController m;
	private Boolean continueT = true;
	private GraphicsContext e;
	private Canvas canvas;
	public ThreadPaintGame(Balls balls, MainController m) {
		super();
		this.balls = balls;
		this.m = m;
		canvas = new Canvas(m.getPane1().getPrefHeight(),m.getPane1().getPrefWidth());
		e = canvas.getGraphicsContext2D();
	}
	
	public void run() {
		try {
		while(continueT) {
				e.fillOval(balls.getPosX(), balls.getPosY(),balls.getRadio(), balls.getRadio());
				Thread.sleep(balls.getEspera());
			
		
		}
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
}
