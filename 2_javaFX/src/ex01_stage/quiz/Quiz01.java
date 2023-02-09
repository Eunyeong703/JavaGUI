package ex01_stage.quiz;

import java.awt.Dimension;
import java.awt.Toolkit;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class Quiz01 extends Application{

	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub
		BorderPane root = new BorderPane();
		Scene scene = new Scene(root, 300, 200);
		
		Toolkit tk = Toolkit.getDefaultToolkit();
		Dimension screen = tk.getScreenSize();

		primaryStage.setScene(scene);
		primaryStage.setTitle("Stage");
		primaryStage.show();
		
		Thread.sleep(2000);
		primaryStage.hide();
		
		int x = (int)(screen.getWidth()/2 - 150);
		int y = (int)(screen.getHeight()/2 - 100);
		
		Thread.sleep(2000);
		primaryStage.setX(x);
		primaryStage.setY(y);
		
		primaryStage.show();
		
	}
	public static void main(String[] args) {
		launch(args);
	}
}
