package ex02_layout.ex8_gridpane;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class GridExam01 extends Application{

	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub
		GridPane grid = new GridPane();
		
		Button btn = new Button("Button");
		// setRowIndex(객체, 행)
		// setColumnIndex(객체, 열)
		GridPane.setRowIndex(btn, 0);
		GridPane.setColumnIndex(btn, 0);
		
		Label lbl = new Label("Label");
		GridPane.setRowIndex(lbl, 1);
		GridPane.setColumnIndex(lbl, 1);
		
		Button test = new Button("test");
		// setConstraints(객체, 열, 행)
		GridPane.setConstraints(test, 2, 2);
		
		grid.getChildren().addAll(btn, lbl, test);
		
		primaryStage.setScene(new Scene(grid, 300, 300));
		primaryStage.setTitle("Grid Ex");
		primaryStage.show();
	}
	public static void main(String[] args) {
		launch(args);
	}
}
