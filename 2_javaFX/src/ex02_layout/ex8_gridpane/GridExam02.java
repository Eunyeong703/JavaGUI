package ex02_layout.ex8_gridpane;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class GridExam02 extends Application{

	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub
		GridPane grid = new GridPane();
		
		grid.setPadding(new Insets(20));
		
		grid.setHgap(50);
		grid.setVgap(20);
		
		Button btn1 = new Button("Button1");
		GridPane.setRowIndex(btn1, 0);
		GridPane.setColumnIndex(btn1, 0);
		
		Label lbl = new Label("Label");
		GridPane.setConstraints(lbl, 0, 1);
		
		grid.getChildren().addAll(btn1, lbl);
		
		// add(객체, 열, 행)
		grid.add(new Button("Button2"), 1, 0);
		grid.add(new Button("Button3"), 1, 1);
		
		FlowPane flow = new FlowPane();
		flow.getChildren().add(new Button("Span"));
		flow.setAlignment(Pos.CENTER);
		flow.setStyle("-fx-background-color:black;");
		
		// add(객체, 열, 행, 열병합수, 행병합수)
		grid.add(flow, 0, 2, 2, 1);
		
		primaryStage.setScene(new Scene(grid, 300, 300));
		primaryStage.setTitle("Grid Ex");
		primaryStage.show();
		
	}
	public static void main(String[] args) {
		launch(args);
	}
}
