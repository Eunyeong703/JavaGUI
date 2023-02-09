package ex04_etc.ex2_combobox;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class ComboExam01 extends Application{

	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub
		HBox hbox = new HBox();
		
		ComboBox<String> cb = new ComboBox<String>();
		
		// 선택 가능한 텍스트 넣기
		cb.getItems().addAll("크라이밍", "서핑", "산악자전거");
		
		// ComboBox 제목 넣기
		cb.setValue("취미");
		
		hbox.getChildren().add(cb);
		
		primaryStage.setScene(new Scene(hbox, 300, 200));
		primaryStage.setTitle("Combo Ex");
		primaryStage.show();
	}
	public static void main(String[] args) {
		launch(args);
	}
}
