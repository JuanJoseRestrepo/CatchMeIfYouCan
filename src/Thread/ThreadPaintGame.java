package Thread;


import Controller.MainController;
import javafx.application.Platform;

public class ThreadPaintGame extends Thread{

	private MainController m;
	public ThreadPaintGame( MainController m) {
		super(); 
		this.m = m;
		setDaemon(true);
	}
	
	public void run() {
		
		Runnable win = new Runnable() {

			@Override
			public void run() {
				m.paintBall();
			}
			
			
			
		};
		
		try {
		while(!m.checkFinishGame()) {
			Platform.runLater(win);
			Thread.sleep(2);
		}
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace(); 
		}
	}
	
	
}
