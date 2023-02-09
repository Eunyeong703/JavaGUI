package ex02_layout.ex4_stackpane;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class StackExam01 extends Application{

	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub
		StackPane stack = new StackPane();
		
		stack.getChildren().addAll(
				new Rectangle(100, 100, Color.YELLOW),
				new Label("Go!!")
				);
		
		primaryStage.setScene(new Scene(stack, 300, 200));
		primaryStage.setTitle("Stack Ex");
		primaryStage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}
}