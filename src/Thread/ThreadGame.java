package Thread;
import Controller.MainController;
import model.*;

public class ThreadGame extends Thread {

	private Balls balls;
	private MainController m;
	private Boolean continueT;
	
	
	public ThreadGame(Balls balls, MainController m) {
		this.balls = balls;
		this.m = m;
		continueT = true;
	}

	public void moveBall() {
		
		double maxX = m.darMayorWithd();
		double maxY = m.darMayorHeight();
		balls.move(maxX, maxY, balls.getDireccion());	
	}


	@Override
	public void run() {

		while(continueT) {
			try {
				moveBall();
				System.out.println(balls.getDireccion());
				Thread.sleep(balls.getEspera()*100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}

}
