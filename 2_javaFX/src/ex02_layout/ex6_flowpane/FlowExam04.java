package ex02_layout.ex6_flowpane;

import javafx.application.Application;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.geometry.Orientation;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class FlowExam04 extends Application{
	@Override
	public void start(Stage primaryStage) throws Exception {
		FlowPane flow = new FlowPane(Orientation.VERTICAL);
		
		// padding 값 설정
		flow.setPadding(new Insets(10));
		
		for(int i=0;i<15;i++) {
			flow.getChildren().add(new Button("Btn" + (i*i*i*10)));
		}
		
		primaryStage.setTitle("Flow Ex");
		primaryStage.setScene(new Scene(flow, 300, 200));
		primaryStage.show();
	}
	public static void main(String[] args) {
		launch(args);
	}
}
