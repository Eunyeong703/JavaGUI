package ex04_etc.ex7_textfield;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class TextExam01 extends Application{

	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub
		HBox h = new HBox(10);
		h.setPadding(new Insets(10));
		
		Label lbl = new Label("입력");
		TextField tf1 = new TextField();
		TextField tf2 = new TextField();
		
		tf1.setPrefSize(200, 40);
		tf1.setAlignment(Pos.BOTTOM_RIGHT);
		
		tf2.setText("값");
		
		tf1.setPromptText("내용을 입력하세요.");
		h.getChildren().addAll(lbl, tf1, tf2);
		h.setPrefSize(300, 200);
		
		primaryStage.setScene(new Scene(h));
		primaryStage.setTitle("Text Ex");
		primaryStage.show();
	}
	public static void main(String[] args) {
		launch(args);
	}
}
