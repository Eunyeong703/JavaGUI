package ex02_layout.ex1_group;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class GroupExam03 extends Application{

	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub
		Group g = new Group();
		
		// new Circle(반지름, 색상)
		Circle circle = new Circle(50, Color.BLUE);
		
		// relocate(x축, y축) - 시작점
		circle.relocate(20, 20);
		
		g.getChildren().add(circle);
		// new Rectangle(넓이, 높이, 색상)
		Rectangle rect = new Rectangle(100, 100, Color.RED);
		rect.relocate(70, 70);
		
//		g.getChildren().add(rect);
//		g.getChildren().add(circle);
		
//		g.getChildren().addAll(circle, rect);
		
		// 같은 객체를 두번 사용하지 못한다.
//		g.getChildren().addAll(circle, circle);
		
		circle = new Circle(50, Color.GREEN);
		circle.relocate(50, 50);
		
		g.getChildren().add(circle);
		
		Scene scene = new Scene(g, 300, 200);
		
		primaryStage.setScene(scene);
		primaryStage.setTitle("Group Ex");
		primaryStage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}
}