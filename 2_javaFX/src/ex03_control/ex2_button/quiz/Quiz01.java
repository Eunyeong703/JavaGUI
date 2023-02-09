package ex03_control.ex2_button.quiz;

import java.util.Optional;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Quiz01 extends Application{

	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub
		VBox vbox = new VBox(10);
		HBox hbox = new HBox(20);
		
		Button idBtn = new Button("ID");
		Button pwBtn = new Button("PW");
		Button loginBtn = new Button("Login");
		
		hbox.setPadding(new Insets(20));
		
		idBtn.setPrefSize(100, 40);
		pwBtn.setPrefSize(100, 40);
		loginBtn.setPrefSize(60, 90);
		
		loginBtn.setOnAction(e -> {
			// CONFIRMATION : 확인, 취소 필요할 때
			Alert alert = new Alert(AlertType.CONFIRMATION);
			alert.setTitle("경고");
			alert.setHeaderText("로그인 시도");
			alert.setContentText("아직은 로그인할 수 없습니다.");
//			alert.show();
			// showAndWait() : 응답의 결과가 필요한 경우
			Optional<ButtonType> result = alert.showAndWait();
			if(result.get() == ButtonType.OK) {
				System.out.println("확인");
			} else if(result.get() == ButtonType.CANCEL) {
				System.out.println("취소");
			}
		});
		
		vbox.getChildren().addAll(idBtn, pwBtn);
		hbox.getChildren().addAll(vbox, loginBtn);
		
		primaryStage.setScene(new Scene(hbox));
		primaryStage.setTitle("Quiz");
		primaryStage.show();
	}
	public static void main(String[] args) {
		launch(args);
	}
}
