package ex03_control.ex4_radiobutton;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class RadioExam01 extends Application{

	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub
		// CheckBox : 여러개 선택시 사용
		// RadioButton : 한 개 선택시 사용
		
		VBox vbox = new VBox();
		
		RadioButton rb1 = new RadioButton("rb1");
		RadioButton rb2 = new RadioButton("rb2");
		
		// ToggleGroup - 라디오 버튼을 그룹화
		ToggleGroup tg = new ToggleGroup();
		
		// setToggleGroup(그룹 이름);
		rb1.setToggleGroup(tg);
		rb2.setToggleGroup(tg);
		
		rb1.setSelected(true); // 기본 세팅값 설정
		rb2.setSelected(true); // 두 개 이상일 경우 가장 마지막 게 선택됨
		
		vbox.getChildren().addAll(rb1, rb2);
		
		primaryStage.setScene(new Scene(vbox));
		primaryStage.setTitle("Radio Ex");
		primaryStage.show();
	}
	public static void main(String[] args) {
		launch(args);
	}
}
