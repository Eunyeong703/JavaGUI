package ex01_stage.quiz;

import java.util.Map;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Quiz05 extends Application{

	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub
		int stageX=50;
		int stageY=20;
		int stageWidth=100;
		int stageHeight=50;
		
		for(int i=0;i<7;i++) {
			stageX += 25;
			stageY += 10;
			stageWidth += 50;
			stageHeight += 25;
			
			primaryStage.setX(50 + (i * stageX));
			primaryStage.setY(50 + (i * stageY));
			
			Scene scene = new Scene(new Group(), stageWidth, stageHeight);
			primaryStage.setTitle("Quiz");
			primaryStage.setScene(scene);
			primaryStage.show();
			
			Thread.sleep(1000);
		}
	}
	public static void main(String[] args) {
		launch(args);
	}
}
