package ex01_stage;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class StageExam06 extends application{

	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub
		
		// Text 설정
		// new Text(x축, y축, 출력내용);
		Text text = new Text(40, 100, "Hello");
		
		// 폰트 설정
		// new Font(글자크기)
		text.setFont(new Font(40));
		
		Scene scene = new Scene(new Group(text));
		
		primaryStage.setTitle("Stage");
		primaryStage.setScene(scene);
		primaryStage.show();
	}
	
	public static void main(String[] args) {
		launch(args);
	}

}
