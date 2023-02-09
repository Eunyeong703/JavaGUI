package ex01_stage;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class StageExam03 extends Application{

	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub

		// 위 아래 좌 우 센터에 레이아웃을 넣을 수 있음.
		// Scene 안에 넣을 layout 생성
		BorderPane root = new BorderPane();
		
		// Scene 생성 - 하나 이상의 레이아웃을 가진 화면
		// Scene scene = new Scene(레이아웃, 넓이, 높이);
		// Stage 자체는 크기를 가질 수 없다.
		// Scene을 통해서 크기를 지정할 수 있다.
		Scene scene = new Scene(root, 300, 200);
		
		// Stage 안에 Scene을 추가해야 화면이 구현된다.
		primaryStage.setScene(scene);
		
		primaryStage.setTitle("Second Stage");
		primaryStage.show();
	}
	
	public static void main(String[] args) {
		launch(args);
	}

}
