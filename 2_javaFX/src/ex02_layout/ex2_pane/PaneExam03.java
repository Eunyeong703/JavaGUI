package ex02_layout.ex2_pane;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class PaneExam03 extends Application{

	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub
		Pane pane = new Pane();
		
		Circle c = new Circle(50, Color.BLUE);
		c.relocate(20, 20);
		
		Rectangle r = new Rectangle(100, 100, Color.RED);
		r.relocate(70, 70);
		
		// setStyle() : 화면을 꾸며주는 효과
		pane.setStyle("-fx-background-color:black;");
		
		// setPrefSize(넓이, 높이)
		pane.setPrefSize(200, 200);
		pane.getChildren().addAll(c, r);
		
		Group group = new Group();
		group.getChildren().add(pane);
		Scene scene = new Scene(group, 500, 500, Color.YELLOW);
		
		primaryStage.setScene(scene);
		primaryStage.setTitle("Pane Ex");
		primaryStage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}
}