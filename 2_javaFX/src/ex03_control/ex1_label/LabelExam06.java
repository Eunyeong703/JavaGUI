package ex03_control.ex1_label;

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class LabelExam06 extends Application{

	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub
		Pane pane = new Pane();
		
		final Label lbl = new Label("Values");
		lbl.setFont(new Font("Cambria", 32));
		
		// setRotate() : 문자열의 각도 지정
		lbl.setRotate(45);
		
		// setTranslateX, setTranslateY : Label의 위치 변경
		lbl.setTranslateX(50);
		lbl.setTranslateY(50);
		// lbl.setTranslateZ(50);
		
		lbl.setOnMouseEntered(new EventHandler<MouseEvent>() {

			@Override
			public void handle(MouseEvent event) {
				// TODO Auto-generated method stub
				// setScaleX, setScaleY : 배율로 크기를 변경
				lbl.setScaleX(1.5);
				lbl.setScaleY(1.5);
			}
		});
		
		lbl.setOnMouseExited(new EventHandler<MouseEvent>() {

			@Override
			public void handle(MouseEvent event) {
				// TODO Auto-generated method stub
				// setScaleX, setScaleY : 배율로 크기를 변경
				lbl.setScaleX(1);
				lbl.setScaleY(1);
			}
		});
		
		pane.getChildren().add(lbl);
		pane.setPrefSize(300, 200);
		
		primaryStage.setScene(new Scene(pane));
		primaryStage.setTitle("Label Ex");
		primaryStage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}
}