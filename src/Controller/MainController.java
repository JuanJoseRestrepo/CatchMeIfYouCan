package Controller;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Group;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.MenuItem;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Arc;
import model.*;
import Thread.*;

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
	private BorderPane pane;
	@FXML
	private Pane pane1;
	
	private List<ThreadGame> games;
	private GraphicsContext gt;
	
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
	
		juego = new game(0,0);
		games = new ArrayList<ThreadGame>();
		canvas = new Canvas(pane1.getPrefHeight(),pane1.getPrefWidth());
		gt = canvas.getGraphicsContext2D();
		pane1.getChildren().add(canvas);
		System.out.println(darMayorHeight());
		System.out.println(darMayorWithd());
	}
	
	public void loadGame(ActionEvent e) {
		juego.readGame(); 
		pane1.getChildren().clear();
		juego1 = new game(juego.getNivel(),juego.getPuntaje());
		System.out.println(juego.getNivel());
		createBalls(juego.getBolas());
	}
	
	public void createBalls(ArrayList<Balls> m) {
		
		for(int i = 0; i < m.size();i++) {
			ThreadGame e = new ThreadGame(m.get(i), this);
			games.add(e);
			e.start();			
		}
		
		for(int j = 0; j < m.size();j++) {
			ThreadPaintGame e1 = new ThreadPaintGame(m.get(j),this);
			e1.start();
		}
		
		
	}
	
	public game getJuego() {
		return juego;
	}

	public void setJuego(game juego) {
		this.juego = juego;
	}

	public game getJuego1() {
		return juego1;
	}

	public void setJuego1(game juego1) {
		this.juego1 = juego1;
	}

	public Canvas getCanvas() {
		return canvas;
	}

	public void setCanvas(Canvas canvas) {
		this.canvas = canvas;
	}

	public Pane getPane1() {
		return pane1;
	}

	public void setPane1(Pane pane1) {
		this.pane1 = pane1;
	}

	public GraphicsContext getGt() {
		return gt;
	}

	public void setGt(GraphicsContext gt) {
		this.gt = gt;
	}

	public void checkFinishGame() {
		ArrayList<Balls> bolas1 = juego.getBolas();
		int j = 0;
		for(int i = 0; i < bolas1.size();i++) {
			if(bolas1.get(i).isStop() == true) {
				j++;
			}	
		}
		
		if(j == bolas1.size()) {
			finishGame();
		}
		
	}
	
	public void finishGame() {
		
		
	}

	public Double darMayorHeight() {
		
		return pane1.getPrefHeight();
		
	}
	
	public Double darMayorWithd() {
	
		return pane1.getPrefWidth();
		
	}
	
}
