package ex02_layout.ex6_flowpane;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class FlowExam02 extends Application{
	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub
		FlowPane flow = new FlowPane();
		
		for(int i=0;i<15;i++) {
			flow.getChildren().add(new Button("Btn" + (i+1)));
		}
		
		// 하단 여백 지정
		flow.setVgap(80);
		
		// 오른쪽 여백 지정
		flow.setHgap(10);
		
		primaryStage.setTitle("Flow Ex");
		primaryStage.setScene(new Scene(flow, 300, 200));
		primaryStage.show();
	}
	public static void main(String[] args) {
		launch(args);
	}
}

