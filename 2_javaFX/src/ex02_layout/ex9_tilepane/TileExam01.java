package ex02_layout.ex9_tilepane;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.image.ImageView;
import javafx.scene.layout.TilePane;
import javafx.stage.Stage;

public class TileExam01 extends Application{

	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub
		TilePane tile = new TilePane();
		
		// 객체의 좌우 간격
		tile.setHgap(10);
		// 객체의 위아래 간격
		tile.setVgap(10);
		
		// 첫 화면에 라인에 보이는 수 지정
		tile.setPrefColumns(2);
		
		for(int i=0;i<20;i++) {
			// ImageView : 이미지 화면에 출력
			tile.getChildren().add(new ImageView("/img/tmp.jpg"));
		}
		
		primaryStage.setScene(new Scene(tile));
		primaryStage.setTitle("Tile Ex");
		primaryStage.show();
	}
	public static void main(String[] args) {
		launch(args);
	}
}
