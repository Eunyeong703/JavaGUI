package ex03_control.ex1_label.quiz;

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class Quiz extends Application{
	public void mouse(Label l) {
		l.setOnMouseEntered(new EventHandler<MouseEvent>() {
			@Override
			public void handle(MouseEvent event) {
				// TODO Auto-generated method stub
				l.setScaleX(1.5);
				l.setScaleY(1.5);
			}
		});
		
		l.setOnMouseExited(new EventHandler<MouseEvent>() {
			@Override
			public void handle(MouseEvent event) {
				// TODO Auto-generated method stub
				l.setScaleX(1);
				l.setScaleY(1);
			}
		});
	}
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub
		HBox hbox = new HBox(10);
		
		Label imgLabel = new Label("Search", 
				new ImageView("/img/search.png"));
		Label rotateLabel = new Label("Values");
		Label wrappedLabel = new Label("A Label that needs to be wrapped");
		
		imgLabel.setFont(new Font("Arial", 25));
		imgLabel.setTextFill(Color.SKYBLUE);
		
		rotateLabel.setFont(new Font("Arial", 25));
		rotateLabel.setRotate(-90);
		rotateLabel.setTranslateY(50);
		
		wrappedLabel.setWrapText(true);
		wrappedLabel.setPadding(new Insets(30,0,0,0));
		wrappedLabel.setPrefSize(100, 100);
		
		mouse(imgLabel);
		mouse(rotateLabel);
		mouse(wrappedLabel);
		
		hbox.getChildren().addAll(imgLabel, rotateLabel, wrappedLabel);
		primaryStage.setScene(new Scene(hbox, 400, 200));
		primaryStage.setTitle("Quiz");
		primaryStage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}
}