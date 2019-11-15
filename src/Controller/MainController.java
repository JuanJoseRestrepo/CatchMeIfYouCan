package Controller;

import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.MenuItem;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Arc;
import model.*;

public class MainController implements Initializable {

	private game juego;
	private game juego1;
	private Canvas canvas;
	@FXML
	private MenuItem m;
	@FXML
	private MenuItem m1;
	@FXML
	private MenuItem m2;
	@FXML
	private AnchorPane board;
	@FXML
	private BorderPane pane;
	
	private Pane pane1;
	private GraphicsContext p;
	
	private Arc bola;
	
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
	
		canvas = new Canvas(512,512);
		juego = new game(0,0);
	}
	
	public void loadGame(ActionEvent e) {
		juego.readGame();
		
		juego1 = new game(juego.getNivel(),juego.getPuntaje());
		System.out.println(juego.getNivel());
		createBalls(juego.getBolas());
	}
	
	public void createBalls(ArrayList<Balls> m) {
		pane1 = new Pane();		
		for(int i = 0; i < m.size();i++) {
			
			bola = new Arc(20, 20, 200, 200, 0, 180);
			pane1.getChildren().add(bola);	
	
		}
		pane.setCenter(pane1);
		pane1.getChildren().add(canvas);
		p = canvas.getGraphicsContext2D();
	}
	

}
