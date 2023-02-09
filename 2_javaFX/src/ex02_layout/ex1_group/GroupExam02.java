package ex02_layout.ex1_group;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class GroupExam02 extends Application{

	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub
		Group g = new Group();
		
		for(int i=0;i<5;i++) {
			// new Rectangle(x축, y축, 넓이, 높이)
			Rectangle r = new Rectangle(i*20, i*20, 100, 10);
			r.setFill(Color.RED);
			g.getChildren().add(r);
		}
		
		Scene scene = new Scene(g, 300, 200);
		
		primaryStage.setScene(scene);
		primaryStage.setTitle("Group Ex");
		primaryStage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}
}