package ex03_control.ex2_button;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class ButtonExam02 extends Application{

	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub
		Pane pane = new Pane();
		Button btn = new Button("클릭");
		
		btn.setPrefSize(120, 40);
		btn.setLayoutX(90);
		btn.setLayoutY(80);
		
		// 버튼 클릭 이벤트 만들기
		btn.setOnAction(new EventHandler<ActionEvent>() {
			
			@Override
			public void handle(ActionEvent event) {
				// TODO Auto-generated method stub
				Alert alert = new Alert(Al
						ertType.WARNING);
				alert.setTitle("경고");
				alert.setHeaderText("버튼 이벤트");
				alert.setContentText("버튼을 클릭했습니다.");
				alert.show();
			}
		});

		pane.getChildren().add(btn);
		
		primaryStage.setScene(new Scene(pane, 300, 200));
		primaryStage.setTitle("Button Ex");
		primaryStage.show();
	}
	public static void main(String[] args) {
		launch(args);
	}
}
