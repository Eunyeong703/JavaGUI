package ex01_stage.quiz;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class Quiz02 extends Application{

	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub
		BorderPane root = new BorderPane();

		primaryStage.setScene(new Scene(root, 500, 200));
		primaryStage.setTitle("Quiz01");
		primaryStage.show();
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
