package ex03_control.ex1_label;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class LabelExam05 extends Application{

	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub
		HBox hbox = new HBox(10);
		hbox.setPadding(new Insets(10));
		
		Label lbl = new Label("A Label that needs to be wrapped");
		
		// setWrapText(true) : 문자열이 다 보이도록 한 줄 내림
		// setWrapText(false) : 기본값, 문자열이 보이지 않는 부분은 '...'으로 출력
		lbl.setWrapText(true);
		
		// setFont(new Font(글꼴, 글자 크기))
//		lbl.setFont(new Font("Arial", 20));
		lbl.setFont(new Font("Cambria", 20));
		
		hbox.getChildren().add(lbl);
		hbox.setPrefSize(200, 100);
		
		primaryStage.setScene(new Scene(hbox));
		primaryStage.setTitle("Label Ex");
		primaryStage.show();
	}
	public static void main(String[] args) {
		launch(args);
	}
}
