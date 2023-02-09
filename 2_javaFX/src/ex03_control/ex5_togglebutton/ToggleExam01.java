package ex03_control.ex5_togglebutton;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.ToggleButton;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class ToggleExam01 extends Application{

	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub
		HBox hbox = new HBox(10);
		
		
		ToggleButton tb1 = new ToggleButton("ToggleBtn1");
		ToggleButton tb2 = new ToggleButton();
		tb2.setText("ToggleBtn2");
		
		hbox.getChildren().addAll(tb1, tb2);
		hbox.setPrefSize(300, 200);
		
		primaryStage.setScene(new Scene(hbox));
		primaryStage.setTitle("Toggle Ex");
		primaryStage.show();
	}
	public static void main(String[] args) {
		launch(args);
	}
}
