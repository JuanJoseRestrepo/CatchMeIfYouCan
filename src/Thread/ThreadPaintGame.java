package Thread;


import Controller.MainController;

public class ThreadPaintGame extends Thread{

	private MainController m;
	public ThreadPaintGame( MainController m) {
		super(); 
		this.m = m;
		setDaemon(true);
	}
	
	public void run() {
		try {
		while(!m.checkFinishGame()) {
			m.paintBall();
			Thread.sleep(5);
		}
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace(); 
		}
	}
	
	
}
