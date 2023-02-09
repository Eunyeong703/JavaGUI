package ex02_layout.ex2_pane.quiz;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Ellipse;
import javafx.stage.Stage;

public class Quiz extends Application{

	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub
		Group group = new Group();
		Pane pane = new Pane();
		
		pane.setPrefSize(200, 200);
		pane.setStyle("-fx-background-color:yellow;");
		pane.setLayoutX(100);
		pane.setLayoutY(100);
		
		Ellipse el = new Ellipse();
		// setRadiusX(), setRadiusX() : 타원의 넓이, 높이
		el.setRadiusX(50);
		el.setRadiusY(20);
		el.setFill(Color.BLACK);
		// setCenterX(), setCenterY() : 타원의 중심점 
		el.setCenterX(100);
		el.setCenterY(100);
		
		pane.getChildren().add(el);
		
		group.getChildren().add(pane);
		
		Scene scene = new Scene(group, 400, 400, Color.BLUE);
		
		primaryStage.setScene(scene);
		primaryStage.setTitle("Quiz");
		primaryStage.show();
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}