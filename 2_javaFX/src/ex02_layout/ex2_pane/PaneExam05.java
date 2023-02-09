package ex02_layout.ex2_pane;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class PaneExam05 extends Application{

	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub
		Pane root = new Pane();
		
		Pane p1 = new Pane();
		p1.setPrefSize(100, 100);
		p1.setStyle("-fx-background-color:red;");

		Pane p2 = new Pane();
		p2.setPrefSize(200, 200);
		p2.setStyle("-fx-background-color:blue;");
		
		root.getChildren().addAll(p2, p1);
		root.setPrefSize(300, 300);
		root.setStyle("-fx-background-color:pink;");
		
		Group g = new Group();
		g.getChildren().add(root);
		Scene scene = new Scene(g, 400, 400, Color.YELLOW);
		
		primaryStage.setScene(scene);
		primaryStage.setTitle("Pane Ex");
		primaryStage.show();
		
		
	}
	public static void main(String[] args) {
		launch(args);
	}
}
