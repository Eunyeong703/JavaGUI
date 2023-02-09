package ex04_etc.ex2_combobox;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class ComboExam03 extends Application{
	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub
		HBox hbox = new HBox(10);
		hbox.setPadding(new Insets(10));
		
		ComboBox<Color> cb = new ComboBox<Color>();
		
		cb.getItems().addAll(Color.RED, Color.BLUE, Color.GREEN);
		
		cb.setPromptText("색상을 고르세요.");
		
		hbox.getChildren().add(cb);
		hbox.setPrefSize(300, 200);
		
		primaryStage.setScene(new Scene(hbox));
		primaryStage.setTitle("Combo Ex");
		primaryStage.show();
	}
	public static void main(String[] args) {
		launch(args);
	}
}
