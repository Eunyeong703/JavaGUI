package ex02_layout.ex5_anchorpane;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class AnchorExam01 extends Application{

	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub
		AnchorPane an = new AnchorPane();
		
		ListView<String> list = new ListView<String>();
		
		// 객체가 아닌 클래스로 지정
		AnchorPane.setTopAnchor(list, 10.0);
		AnchorPane.setLeftAnchor(list, 10.0);
		AnchorPane.setRightAnchor(list, 60.0);
		AnchorPane.setBottomAnchor(list, 10.0);
		
		Button btn = new Button("Add");
		
		AnchorPane.setTopAnchor(btn, 10.0);
		AnchorPane.setRightAnchor(btn, 10.0);
		
		an.getChildren().addAll(list, btn);
		
		primaryStage.setScene(new Scene(an, 300, 250));
		primaryStage.setTitle("Anchor Ex");
		primaryStage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}
}