package ex02_layout.ex2_pane;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class PaneExam02 extends Application{

	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub
		Pane pane = new Pane();
		
		for(int i=0;i<5;i++) {
			Rectangle r = new Rectangle(i*20, i*20, 100, 10);
			r.setFill(Color.RED);
			
			pane.getChildren().add(r);
		}
		
		Scene scene = new Scene(pane, 300, 200);
		
		primaryStage.setScene(scene);
		primaryStage.setTitle("Pane Ex");
		primaryStage.show();
	}
	public static void main(String[] args) {
		launch(args);
	}
}
