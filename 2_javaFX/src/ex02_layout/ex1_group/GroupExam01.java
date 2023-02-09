package ex02_layout.ex1_group;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class GroupExam01 extends Application{

	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub
		// Group 은 객체(레이아웃, 텍스트, 도형의 객체 등)를 하나로 만들기 위해서 사용
		Group g = new Group();
		
		// JavaFX 도형을 만드는 패키지 : javafx.scene.shape
		// Rectangle : 직사각형
		Rectangle r = new Rectangle();
		
		// 사각형 속성 변경
		// x축
		r.setX(20);
		// y출
		r.setY(20);
		// 넓이
		r.setWidth(100);
		// 높이
		r.setHeight(10);
		// 색상
		r.setFill(Color.RED);
		
		// Group 안에 객체를 추가
		g.getChildren().add(r);
		
		// Scene 안에 Group을 추가
		Scene scene = new Scene(g, 300, 200);
		
		// Stage 안에 Scene 추가
		primaryStage.setScene(scene);
		primaryStage.setTitle("Group Ex");
		primaryStage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}
}