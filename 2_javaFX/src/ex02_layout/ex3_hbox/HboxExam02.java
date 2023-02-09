package ex02_layout.ex3_hbox;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.Priority;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class HboxExam02 extends Application{

	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub
		HBox hbox = new HBox();
		
		hbox.setSpacing(10);
		hbox.setPrefSize(30, 70);
		
		VBox vbox = new VBox();
		
		vbox.setSpacing(10);
		vbox.setPrefSize(70, 30);
		
		Pane p1 = new Pane();
		Pane p2 = new Pane();
		
		
		p1.setStyle("-fx-background-color:blue;");
		p1.setPrefSize(200, 150);
		p2.setStyle("-fx-background-color:red;");
		p2.setPrefSize(50, 50);
		
		p1.getChildren().add(p2);
		
		// setHgrow, setVgrow : 수평, 수직에 대한 우선순위를 설정하는 것이다.
		// Priority.ALWAYS : 확장 가능
		// Priority.NEVER : 확장 불가능
		// 이 설정은 객체에 설정하는 것이 아닌 클래스 설정 하는 방식이다.
		HBox.setHgrow(p1, Priority.ALWAYS);
		//HBox.setHgrow(p2, Priority.NEVER);
		
		// hbox.getChildren().add(p1);
		
		VBox.setVgrow(p1, Priority.ALWAYS);
		VBox.setVgrow(p2, Priority.NEVER);
		
		vbox.getChildren().add(p1);
		
		Scene scene = new Scene(vbox);
		
		primaryStage.setScene(scene);
		primaryStage.setTitle("HBox Ex");
		primaryStage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}
}