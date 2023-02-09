package ex03_control.ex3_checkbox;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.CheckBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class CheckExam02 extends Application{

	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub
		VBox vbox = new VBox(10);
		vbox.setPadding(new Insets(10));
		
		CheckBox chk1 = new CheckBox("운동");
		CheckBox chk2 = new CheckBox("음악");
		CheckBox chk3 = new CheckBox("게임");
		
		chk1.setSelected(true);
		
		vbox.getChildren().addAll(chk1, chk2, chk3);
		
		// selectedProperty() : 체크 박스 선택 여부
		System.out.println(chk1.selectedProperty());
		// getText() : 문자열의 값을 출력
		System.out.println(chk1.getText());
		
		
		chk1.selectedProperty().addListener(e -> {
			System.out.println(chk1.getText());
		});
		chk2.selectedProperty().addListener(e -> {
			System.out.println(chk2.getText());
		});
		chk3.selectedProperty().addListener(e -> {
			System.out.println(chk3.getText());
		});
		
		primaryStage.setScene(new Scene(vbox));
		primaryStage.setTitle("Check Ex");
		primaryStage.show();
	}
	public static void main(String[] args) {
		launch(args);
	}
}
