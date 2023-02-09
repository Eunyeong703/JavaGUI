package ex03_control.ex2_button;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class ButtonExam01 extends Application{

	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub
		Pane pane = new Pane();
		
//		Button btn = new Button("버튼");
		Button btn = new Button();
//		btn.setText("버튼");
		
		btn.setGraphic(new ImageView("/img/SmileReRe.png"));
		
//		btn.setPrefWidth(120);
//		btn.setPrefHeight(40);
		btn.setPrefSize(120, 40);
		
		btn.setLayoutX(90);
		btn.setLayoutY(80);
		
		pane.getChildren().add(btn);
		
		primaryStage.setScene(new Scene(pane));
		primaryStage.setTitle("Button Ex");
		primaryStage.show();
	}
	public static void main(String[] args) {
		launch(args);
	}
}
