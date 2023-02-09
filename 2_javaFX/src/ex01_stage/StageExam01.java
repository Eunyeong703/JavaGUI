package ex01_stage;

import javafx.application.Application;
import javafx.stage.Stage;

// javaFX를 사용하기 위해서는 Application 클래스를 상속 받아야 한다.
public class StageExam01 extends Application{
	public static void main(String[] args) throws Exception {
		launch(null);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Start() 메서드");
		primaryStage.show();
		
		Stage ss = new Stage(); // Stage 창을 여러개 띄울 수 있음.
		ss.show();
	}
}
