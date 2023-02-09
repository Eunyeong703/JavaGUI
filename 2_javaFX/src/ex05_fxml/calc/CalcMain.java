package ex05_fxml.calc;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class CalcMain extends Application{

	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub
		FXMLLoader loader = new FXMLLoader(
				getClass().getResource("calc.fxml"));
		
		Parent root = loader.load();
		
		// fxml 파일에 Controller를 지정하는 것
		CalcController ctrl = loader.getController();
		// fxml에 대한 정보를 Controller에게 전달하여 사용할 수 있도록 root 정보를 넘긴다.
		ctrl.setRoot(root);
		
		primaryStage.setScene(new Scene(root));
		primaryStage.setTitle("계산기");
		primaryStage.show();
	}
	public static void main(String[] args) {
		launch(args);
	}
}
