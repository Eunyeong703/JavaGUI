package ex01_stage;

import javafx.application.Application;
import javafx.stage.Stage;

public class StageExam02 extends Application{

	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub
		
		// 타이틀 지정
		primaryStage.setTitle("First Stage");
		
		// 창 띄우기
		primaryStage.show();
		
		System.out.println(primaryStage.getTitle());
	}
	
	public static void main(String[] args) {
		launch(args);
	}

}
