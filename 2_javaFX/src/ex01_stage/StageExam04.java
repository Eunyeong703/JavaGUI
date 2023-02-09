package ex01_stage;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class StageExam04 extends Application{

	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub
		BorderPane root = new BorderPane();
		Scene scene = new Scene(root, 300, 200);
		
		primaryStage.setScene(scene);
		primaryStage.setTitle("Main Stage");
		
		primaryStage.show();
		
		// 2초간 멈춤
		Thread.sleep(2000);
		
		// 창 최소화
		primaryStage.setIconified(true);
		
		Thread.sleep(2000);
		
		// 창 복원
		primaryStage.setIconified(false);
	}
	
	public static void main(String[] args) {
		launch(args);
	}

}
