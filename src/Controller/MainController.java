package Controller;

import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.canvas.Canvas;
import javafx.scene.control.MenuItem;
import javafx.scene.layout.AnchorPane;
import javafx.scene.shape.Arc;
import model.*;

public class MainController implements Initializable {

	private game juego;
	private Canvas canvas;
	@FXML
	private MenuItem m;
	@FXML
	private MenuItem m1;
	@FXML
	private MenuItem m2;
	@FXML
	private AnchorPane board;
	private Arc bola;
	@Override
	public void initialize(URL location, ResourceBundle resources) {
	
		canvas = new Canvas(512,512);
		juego = new game(0,0);
	}
	
	public void loadGame(ActionEvent e) {
		juego.readGame();
		juego = new game(juego.getNivel(),juego.getPuntaje());
		createBalls(juego.getBolas());
	}
	
	public void createBalls(ArrayList<Balls> m) {
		
		for(int i = 0; i < m.size();i++) {
			
			bola = new Arc();
			
			board.getChildren().add(bola);
		}
		
		
	}
	

}
