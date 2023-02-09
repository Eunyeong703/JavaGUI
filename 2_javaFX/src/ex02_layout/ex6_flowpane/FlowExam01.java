package ex02_layout.ex6_flowpane;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class FlowExam01 extends Application{

	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub
		FlowPane flow = new FlowPane();
		
		for(int i=0;i<5;i++) {
			flow.getChildren().add(new Button("Btn" + (i+1)));
		}
		
		primaryStage.setTitle("Flow Ex");
		primaryStage.setScene(new Scene(flow, 300, 200));
		primaryStage.show();
	}
	public static void main(String[] args) {
		launch(args);
	}
}
