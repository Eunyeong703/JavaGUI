package ex03_control.ex1_label;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class LabelExam04 extends Application{

	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub
		HBox hbox = new HBox(10);
		hbox.setPadding(new Insets(10));
		
		Image image = new Image
				(getClass().getResourceAsStream("/img/search.png"));
		
		// 생성자를 통한 이미지 추가
		// Label lbl = new Label("Search", new ImageView(image));
		
		Label lbl = new Label("Search");
		
		// setGraphic() : 이미지 추가
		lbl.setGraphic(new ImageView(image));
		
		// setTextFill() : 문자열의 색 변경
		lbl.setTextFill(Color.RED);
		
		hbox.getChildren().add(lbl);
		hbox.setPrefSize(300, 200);
		
		primaryStage.setScene(new Scene(hbox));
		primaryStage.setTitle("Label Ex");
		primaryStage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}
}

