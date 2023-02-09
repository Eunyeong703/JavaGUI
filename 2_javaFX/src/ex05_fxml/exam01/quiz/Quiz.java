package ex05_fxml.exam01.quiz;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Quiz extends Application{

	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub
		FXMLLoader loader = new FXMLLoader(
				getClass().getResource("quiz.fxml"));
		Parent root = loader.load();
		
		primaryStage.setScene(new Scene(root));
		primaryStage.setTitle("Quiz");
		primaryStage.show();
	}
	public static void main(String[] args) {
		launch(args);
	}
}
