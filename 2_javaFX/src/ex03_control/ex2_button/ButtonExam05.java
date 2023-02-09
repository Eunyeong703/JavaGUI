package ex03_control.ex2_button;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class ButtonExam05 extends Application{

	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub
		BorderPane border = new BorderPane();
		HBox hbox = new HBox(10);
		
		Label lbl = new Label("Values");
		lbl.setFont(new Font("Cambria", 32));
		
		Button btn = new Button("클릭");
		
		// id 값을 지정-control에서 사용되는 객체는 id를 지정할 수 있다.
		btn.setId("홍길동");
		btn.setOnAction(e -> {
			lbl.setText(btn.getId());
		});
		
		hbox.getChildren().add(lbl);
		border.setTop(hbox);
		border.setCenter(btn);
		
		primaryStage.setScene(new Scene(border, 200, 200));
		primaryStage.setTitle("Button Ex");
		primaryStage.show();
	}
	public static void main(String[] args) {
		launch(args);
	}
}
