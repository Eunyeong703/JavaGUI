package ex02_layout.ex6_flowpane;

import javafx.application.Application;
import javafx.geometry.HPos;
import javafx.geometry.Orientation;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class FlowExam03 extends Application{
	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub
		// Column 출력 방향을 Orientation.VERTICAL을 지정
		// Vertical은 아래로 출력, Horizontal은 오른쪽으로 출력
		FlowPane flow = new FlowPane(Orientation.VERTICAL);
		
		// Column의 위치를 정렬하기 위해 사용
		flow.setColumnHalignment(HPos.RIGHT);
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

