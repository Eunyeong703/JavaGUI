package ex03_control.ex2_button;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class ButtonExam03 extends Application{

	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub
		VBox vbox = new VBox();
		Pane pane = new Pane();
		Pane lblPane = new Pane();
		Button btn = new Button("클릭");
		Label lbl = new Label("버튼을 클릭하세요");
		
		btn.setPrefSize(120, 40);
		btn.setLayoutX(20);
		btn.setLayoutY(20);
		
		pane.getChildren().add(btn);
		
		lbl.setLayoutY(20);
		lbl.setPrefWidth(160);
		lbl.setAlignment(Pos.CENTER);
		
		lblPane.getChildren().add(lbl);
		
//		btn.setOnAction(new EventHandler<ActionEvent>() {
//			
//			@Override
//			public void handle(ActionEvent event) {
//				// TODO Auto-generated method stub
//				lbl.setText("버튼이 클릭되었습니다.");
//			}
//		});
			
		
		// 람다식
		btn.setOnAction(event -> {
			lbl.setText("람다식으로 변경");
		});
		
		vbox.getChildren().addAll(pane, lblPane);
		
		primaryStage.setScene(new Scene(vbox, 160, 120));
		primaryStage.setTitle("Button Ex");
		primaryStage.show();
		
	}
	public static void main(String[] args) {
		launch(args);
	}
}
