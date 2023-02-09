package ex02_layout.ex4_stackpane;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class StackExam03 extends Application{

	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub
		StackPane stack = new StackPane();
		
		Rectangle rect = new Rectangle(100, 100, Color.YELLOW);
		Label lbl = new Label("Go!!");
		
		// setMargin() : 바깥 여백 지정
		// margin : 바깥 여백, padding : 안쪽 여백
		// 객체가 아닌 클래스로 지정
		StackPane.setMargin(rect, new Insets(100,10,10,10));
		StackPane.setMargin(lbl, new Insets(100, 10, 10, 10));
		
		stack.getChildren().addAll(rect, lbl);
		primaryStage.setScene(new Scene(stack, 300, 250));
		primaryStage.setTitle("Stack Ex");
		primaryStage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}
}