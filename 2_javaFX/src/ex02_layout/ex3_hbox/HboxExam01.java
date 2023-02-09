package ex02_layout.ex3_hbox;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class HboxExam01 extends Application{

	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub
		// HBox : 가로로 객체를 채운다.
		 HBox hbox = new HBox();
		
		// VBox : 세로로 객체를 채운다.
		//VBox vbox = new VBox();
		
		// HBox 안의 간격
		 hbox.setSpacing(20);
		//vbox.setSpacing(20);
		
		// Scene 과 HBox 안의 간격
		// Insets(숫자) : 위, 오른쪽, 밑, 왼쪽 모두 숫자만큼 간격이 생긴다.
		// Insets(숫자, 숫자, 숫자, 숫자) : 위, 오른쪽, 아래, 왼쪽 숫자순으로 간격이 생긴다.
		 hbox.setPadding(new Insets(20, 40, 60, 80));
		//vbox.setPadding(new Insets(20));
		
		Pane p1 = new Pane();
		Pane p2 = new Pane();
		
		p1.setStyle("-fx-background-color:blue;");
		p1.setPrefSize(200, 150);
		p2.setStyle("-fx-background-color:red;");
		p2.setPrefSize(200, 150);
		
		hbox.getChildren().addAll(p1, p2);
		//vbox.getChildren().addAll(p1, p2);
		
		 Scene scene = new Scene(hbox, Color.YELLOW);
		//Scene scene = new Scene(vbox, Color.YELLOW);
		
		primaryStage.setScene(scene);
		primaryStage.setTitle("HBox Ex");
		primaryStage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}
}