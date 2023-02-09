package ex02_layout.ex4_stackpane;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class StackExam02 extends Application{

	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub
		StackPane stack = new StackPane();
		
		Rectangle rect = new Rectangle(100, 100, Color.YELLOW);
		Label lbl = new Label("Go!!");
		
		// setAlignment(객체, 위치);
		// 객체가 아닌 클래스로 지정
		StackPane.setAlignment(rect, Pos.TOP_CENTER);
		
		stack.getChildren().addAll(rect, lbl);
		primaryStage.setScene(new Scene(stack, 300, 250));
		primaryStage.setTitle("Stack Ex");
		primaryStage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}
}