package ex02_layout.ex3_hbox;

import java.util.ArrayList;
import java.util.List;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class HboxExam03 extends Application{
	public Pane getPane(String color, int x, int y) {
		Pane p = new Pane();
		p.setStyle(color);
		p.setPrefSize(x, y);
		return p;
	}
	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub
		HBox hbox = new HBox();
		
		List<Pane> pList = new ArrayList<Pane>();
		
		pList.add(getPane("-fx-background-color:blue;", 100, 50));
		pList.add(getPane("-fx-background-color:red;", 200, 150));
		pList.add(getPane("-fx-background-color:green;", 200, 100));
		
		for(Pane p : pList) {
			hbox.getChildren().add(p);
		}
		
		Scene scene = new Scene(hbox);
		
		primaryStage.setScene(scene);
		primaryStage.setTitle("HBox Ex");
		primaryStage.show();
	}
	public static void main(String[] args) {
		launch(args);
	}
}
