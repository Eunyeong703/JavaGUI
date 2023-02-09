package ex04_etc.ex4_html;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.web.HTMLEditor;
import javafx.stage.Stage;

public class HtmlExam01 extends Application{

	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub
		Pane p = new Pane();
		
		HTMLEditor he = new HTMLEditor();
		
		p.getChildren().add(he);
		
		primaryStage.setScene(new Scene(p));
		primaryStage.setTitle("HTML Ex");
		primaryStage.show();
	}
	public static void main(String[] args) {
		launch(args);
	}
}
