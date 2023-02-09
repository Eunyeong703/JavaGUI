package ex04_etc.ex6_textarea;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.TextArea;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class TextAreaExam01 extends Application{

	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub
		Pane pane = new Pane();
		
		TextArea ta = new TextArea();
		
		ta.setPrefSize(200, 150);
		ta.setLayoutX(20);
		ta.setLayoutY(20);
		
		pane.getChildren().add(ta);
		
		primaryStage.setScene(new Scene(pane, 300, 200));
		primaryStage.setTitle("TextArea Ex");
		primaryStage.show();
	}
	public static void main(String[] args) {
		launch(args);
	}
}
