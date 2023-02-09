package ex02_layout.ex2_pane;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.layout.Priority;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class PaneExam01 extends Application{

	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub
		Group g = new Group();
		Pane p = new Pane();
		
		VBox.setVgrow(g, Priority.NEVER);
		VBox.setVgrow(p, Priority.NEVER);
		
		
		Rectangle r1 = new Rectangle(100, 100, Color.BLUE);
		r1.relocate(100, 100);
		Rectangle r2 = new Rectangle(100, 100, Color.BLUE);
		r2.relocate(100, 100);
		Rectangle r3 = new Rectangle(100, 100, Color.RED);
		r3.relocate(200, 200);
		Rectangle r4 = new Rectangle(100, 100, Color.RED);
		r4.relocate(200, 200);
		
		g.getChildren().addAll(r1, r3);
		p.getChildren().addAll(r2, r4);
		
		VBox vbox = new VBox(g, p);
		
		Scene scene = new Scene(vbox, 1000, 500);
		
		primaryStage.setScene(scene);
		primaryStage.setTitle("Pane Ex");
		primaryStage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}
}