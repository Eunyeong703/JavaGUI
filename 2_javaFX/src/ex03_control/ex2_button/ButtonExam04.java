package ex03_control.ex2_button;

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.effect.DropShadow;
import javafx.scene.input.MouseEvent;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class ButtonExam04 extends Application{

	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub
		Pane pane = new Pane();
		Button btn = new Button("클릭");
		
		btn.setPrefSize(120, 40);
		btn.setLayoutX(20);
		btn.setLayoutY(20);
		
		btn.setOnAction(e -> {
			Alert alert = new Alert(AlertType.INFORMATION);
			alert.setTitle("경고");
			alert.setHeaderText("버튼 이벤트");
			alert.setContentText("버튼을 클릭했습니다.");
			alert.show();
		});
		
		// 버튼 스타일 추가
		btn.setStyle("-fx-font:22 arial; -fx-base:#B5E7C9;");
		
		// 그림자 객체 생성
		DropShadow shadow = new DropShadow();
		
//		btn.addEventHandler(MouseEvent.MOUSE_ENTERED, new EventHandler<MouseEvent>() {
//			@Override
//			public void handle(MouseEvent event) {
//				// TODO Auto-generated method stub
//				// setEffect() : 그림자 설정
//				btn.setEffect(shadow);
//			}
//		});
//		
//		btn.addEventHandler(MouseEvent.MOUSE_EXITED, new EventHandler<MouseEvent>() {
//			@Override
//			public void handle(MouseEvent event) {
//				// TODO Auto-generated method stub
//				btn.setEffect(null);
//			}
//		});

//		btn.setOnMouseEntered(new EventHandler<MouseEvent>() {
//			@Override
//			public void handle(MouseEvent event) {
//				// TODO Auto-generated method stub
//				btn.setEffect(shadow);
//			}
//		});
//		
//		btn.setOnMouseExited(new EventHandler<MouseEvent>() {
//			@Override
//			public void handle(MouseEvent event) {
//				// TODO Auto-generated method stub
//				btn.setEffect(null);
//			}
//		});
		
		btn.addEventHandler(MouseEvent.MOUSE_ENTERED, e -> {
			btn.setEffect(shadow);
		});
		btn.addEventHandler(MouseEvent.MOUSE_EXITED, e -> {
			btn.setEffect(null);
		});
		
		pane.getChildren().add(btn);
		
		primaryStage.setScene(new Scene(pane, 160, 80));
		primaryStage.setTitle("Button Ex");
		primaryStage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}
}