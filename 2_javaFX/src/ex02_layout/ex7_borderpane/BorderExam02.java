package ex02_layout.ex7_borderpane;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class BorderExam02 extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub
		BorderPane border = new BorderPane();
		
		Pane top = new Pane();
		FlowPane center = new FlowPane();
		VBox left = new VBox();
		HBox right = new HBox();
		
		top.setStyle("-fx-background-color:linear-gradient(to bottom,"
				+ "#BBBBCC 0%, #AAAAAA 100%);");
		top.setPrefSize(640,120);
		
		left.setStyle("-fx-background-color:linear-gradient(to left,"
				+ "#E4F7BA 0%, #6B9900 100%);");
		left.setPrefSize(180, 560);
		
		right.setStyle("-fx-background-color:green;");
		right.setPrefSize(180, 560);
		
		border.setTop(top);
		border.setRight(right);
		border.setLeft(left);
		border.setCenter(center);
		
		primaryStage.setScene(new Scene(border));
		primaryStage.setTitle("Border EX");
		primaryStage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}
}