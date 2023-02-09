package ex02_layout.ex7_borderpane;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class BorderExam01 extends Application
{

	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub
		BorderPane border = new BorderPane();
		
		// 객체에 설정
		border.setTop(new Button("Top"));
		border.setLeft(new Button("Left"));
		border.setCenter(new Button("Center"));
		border.setRight(new Button("Right"));
		border.setBottom(new Button("Bottom"));
		
		primaryStage.setScene(new Scene(border, 300, 300));
		primaryStage.setTitle("Border Ex");
		primaryStage.show();
	}
	public static void main(String[] args) {
		launch(args);
	}
}
