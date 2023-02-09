package ex02_layout.ex2_pane;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class PaneExam04 extends Application{

	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub
		Group g = new Group();
		Pane p1 = new Pane();
		Pane p2 = new Pane();
		
		Circle c = new Circle(50, Color.BLUE);
		c.relocate(20, 20);
		
		Rectangle r = new Rectangle(100, 100, Color.RED);
		r.relocate(70, 70);
		
		p1.setStyle("-fx-background-color:black;");
		p1.setPrefSize(200, 200);
		
		p1.getChildren().addAll(c,r);
		
		p2.setStyle("-fx-background-color:yellow;");
		p2.setPrefSize(250, 250);
		// setLaysoutX(), setLayoutY() : x축과 y축의 시작점
		p2.setLayoutX(230);
		
		g.getChildren().addAll(p1, p2);
		
		Scene scene = new Scene(g, 500, 500, Color.BLUE);
		
		primaryStage.setScene(scene);
		primaryStage.setTitle("Pane Ex");
		primaryStage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}
}