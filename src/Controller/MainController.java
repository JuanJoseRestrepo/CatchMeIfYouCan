package Controller;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Group;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.MenuItem;
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
		canvas = new Canvas(512,512);
		gt = canvas.getGraphicsContext2D();
		System.out.println(darMayorHeight());
		System.out.println(darMayorWithd());
	}
	
	public void loadGame(ActionEvent e) {
		juego.readGame();
		Group root1 = new Group();
		pane1.getChildren().add(root1);
		juego1 = new game(juego.getNivel(),juego.getPuntaje());
		System.out.println(juego.getNivel());
		createBalls(juego.getBolas());
	}
	
	public void createBalls(ArrayList<Balls> m) {
		
		for(int i = 0; i < m.size();i++) {
			int j = i;
			gt.fillOval(m.get(i).getPosX(), m.get(i).getPosY(),m.get(i).getRadio(), m.get(i).getRadio());
			ThreadGame e = new ThreadGame(m.get(i), this);
			games.add(e);
			canvas.setOnMouseClicked(event -> gt.clearRect(m.get(j).getPosX(), m.get(j).getPosY(), m.get(j).getRadio(), m.get(j).getRadio()));
			
		}
		pane1.getChildren().add(canvas);
	}
	

	public Double darMayorHeight() {
		
		return pane1.getPrefHeight();
		
	}
	
	public Double darMayorWithd() {
	
		return pane1.getPrefWidth();
		
	}
	
}
