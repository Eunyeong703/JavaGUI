package ex02_layout.ex3_hbox.quiz;

import ex02_layout.ex3_hbox.HboxExam01;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Quiz01_2 extends Application{
	public Pane getPane(String color, int x, int y) {
		Pane p = new Pane();
		p.setStyle(color);
		p.setPrefSize(x, y);
		return p;
	}
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub
		HBox root = new HBox();
		
		VBox v1 = new VBox(20);
		VBox v2 = new VBox(20);
		VBox v3 = new VBox(20);
		
		v1.getChildren().add(getPane("-fx-background-color:blue;", 200, 200));
		v1.getChildren().add(getPane("-fx-background-color:blue;", 200, 200));
		v1.setPadding(new Insets(10, 0 , 10, 10));
		
		v2.getChildren().add(getPane("-fx-background-color:red;", 200, 200));
		v2.getChildren().add(getPane("-fx-background-color:red;", 200, 200));
		v2.setPadding(new Insets(10, 0, 10, 10));
		
		v3.getChildren().add(getPane("-fx-background-color:black;", 400, 200));
		v3.getChildren().add(getPane("-fx-background-color:black;", 400, 200));
		v3.setPadding(new Insets(10, 0, 10, 10));
		
		root.getChildren().addAll(v1, v2, v3);
		
		Scene scene = new Scene(root);
		
		primaryStage.setScene(scene);
		primaryStage.setTitle("Quiz");
		primaryStage.show();
		
	}

	public static void main(String[] args) {
		launch(args);
	}
}