package ex02_layout.ex1_group.quiz;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class Quiz01 extends Application{

	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub
		Group g = new Group();
		
		Rectangle r = new Rectangle();
		r.setX(50);
		r.setY(50);
		r.setWidth(200);
		r.setHeight(200);
		r.setFill(Color.RED);
		
		Circle c = new Circle(75, Color.BLUE);
		c.relocate(75, 75);
		
		g.getChildren().addAll(r, c);
		
		Scene scene = new Scene(g, 300, 300);
		
		primaryStage.setScene(scene);
		primaryStage.setTitle("Quiz");
		primaryStage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}
}