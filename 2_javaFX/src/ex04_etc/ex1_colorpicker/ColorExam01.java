package ex04_etc.ex1_colorpicker;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.ColorPicker;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class ColorExam01 extends Application{

	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub
		Pane p = new Pane();
		
		// ColorPicker : 색상을 선택하게 해주는 객체
		ColorPicker cp = new ColorPicker();
		cp.setPrefSize(100, 100);
		cp.setLayoutX(20);
		cp.setLayoutY(20);
		
		p.getChildren().add(cp);
		
		primaryStage.setScene(new Scene(p, 140, 140));
		primaryStage.setTitle("Color Ex");
		primaryStage.show();
	}
	public static void main(String[] args) {
		launch(args);
	}
}
