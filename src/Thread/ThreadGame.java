package Thread;
import Controller.MainController;
import model.*;

public class ThreadGame extends Thread {

	private Balls balls;
	private MainController m;

	
	
	public ThreadGame(Balls balls, MainController m) {
		this.balls = balls;
		this.m = m;
		
	}



	@Override
	public void run() {
		while(balls.isStop() == false) {
			
		}
		
	}

}
