package ex03_control.ex3_checkbox;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.CheckBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class CheckExam01 extends Application{

	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub
		VBox vbox = new VBox();
		
		CheckBox chk1 = new CheckBox("chk1");
		CheckBox chk2 = new CheckBox("chk2");
		
		// 출력시 기본값을 미리 체크할 수 있다.
		chk1.setSelected(true);
		chk2.setSelected(true);
		
		vbox.getChildren().addAll(chk1, chk2);
		
		primaryStage.setScene(new Scene(vbox));
		primaryStage.setTitle("Check Ex");
		primaryStage.show();
	}
	public static void main(String[] args) {
		launch(args);
	}
}
