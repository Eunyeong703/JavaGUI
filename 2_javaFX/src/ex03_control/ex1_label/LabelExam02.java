package ex03_control.ex1_label;

import java.util.Scanner;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class LabelExam02 extends Application{
	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub
		HBox hbox = new HBox();
		hbox.setPadding(new Insets(10));
		
		// new Label("문자열") : 문자열을 Label 객체에서 출력
		Label lbl = new Label();
		
		System.out.print("Label에 들어갈 문자열 입력 : ");
		Scanner sc = new Scanner(System.in);
		String text = sc.next();
		
		// setText("문자열") : 문자열을 Label에 출력
		lbl.setText(text);
		
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
