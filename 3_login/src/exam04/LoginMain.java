package exam04;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class LoginMain extends Application{

	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub
		FXMLLoader loader = new FXMLLoader(
				getClass().getResource("login.fxml"));
		
		Parent root = loader.load();
		
		// 문제1 Controller 를 생성하고 root의 객체를 넘겨주고, Controller 권한주기 
		Controller ctrl = loader.getController();
		ctrl.setRoot(root); // 목줄을 쥐어주는 것 
		
		primaryStage.setScene(new Scene(root));
		primaryStage.setTitle("로그인");
		primaryStage.show(); // 로그인창을 띄움 
		
	}

	public static void main(String[] args) {
		launch(args);
	}
}