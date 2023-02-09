package ex02_layout.ex3_hbox.quiz;

import java.util.ArrayList;
import java.util.List;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class Quiz01_1 extends Application{
	public Pane getPane(String color, int x, int y) {
		Pane p = new Pane();
		p.setStyle(color);
		p.setPrefSize(x, y);
		return p;
	}
	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub
		VBox root = new VBox();
		
		HBox h1 = new HBox(10);
		HBox h2 = new HBox(10);
		
		h1.getChildren().add(getPane("-fx-background-color:blue;", 200, 200));
		h1.getChildren().add(getPane("-fx-background-color:red;", 200, 200));
		h1.getChildren().add(getPane("-fx-background-color:black;", 400, 200));
	
		h1.setPadding(new Insets(10));
		
		h2.getChildren().add(getPane("-fx-background-color:blue;", 200, 200));
		h2.getChildren().add(getPane("-fx-background-color:red;", 200, 200));
		h2.getChildren().add(getPane("-fx-background-color:black;", 400, 200));
	
		h2.setPadding(new Insets(10));
		
		root.getChildren().addAll(h1, h2);
		
		Scene scene = new Scene(root);
		
		primaryStage.setScene(scene);
		primaryStage.setTitle("Quiz");
		primaryStage.show();
	}
	
	
	public static void main(String[] args) {
		launch(args);
	}
}
