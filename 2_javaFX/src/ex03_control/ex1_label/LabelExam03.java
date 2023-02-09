package ex03_control.ex1_label;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class LabelExam03 extends Application{

	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub
		HBox hbox = new HBox(10);
		hbox.setPadding(new Insets(10));
		
		// new Label("문자열") : 문자열을 Label 객체에서 출력
		Label lbl = new Label();
		
		lbl.setText("SetText");
		
		// 크기 지정
		lbl.setPrefSize(200, 100);
		
		// 스타일 지정
		lbl.setStyle("-fx-background-color:yellow;");
		
		// 문자열의 위치 지정
		lbl.setAlignment(Pos.CENTER);
		hbox.getChildren().add(lbl);
		hbox.setPrefSize(300, 200);
		
		primaryStage.setScene(new Scene(hbox));
		primaryStage.setTitle("Label Ex");
		primaryStage.show();
	}
	public static void main(String[] args) {
		launch(args);
	}
}
