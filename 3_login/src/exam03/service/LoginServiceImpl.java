package exam03.service;

import exam03.Controller;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class LoginServiceImpl implements LoginService{

	@Override
	public void loginProc(Parent root) {
		// TODO Auto-generated method stub
		// 문제 : 아이디 / 패스워드가 입력 되면 입력된 값 출력
		TextField id = (TextField) root.lookup("#txtId");
		PasswordField pw = (PasswordField) root.lookup("#txtPw");
		
		System.out.println("아이디 : " + id.getText());
		System.out.println("암호 : " + pw.getText());
		System.out.println("로그인 버튼이 눌렸습니다.");
	}

	@Override
	public void membershipProc(Parent root) {
		// TODO Auto-generated method stub
		
		// 기존 창 + 새로운 창으로 열기
		Stage membershipForm = new Stage();
		
		FXMLLoader loader = new FXMLLoader(
				getClass().getResource("../membershipForm.fxml"));
		
		
		// 기존 창을 새창으로 바꾸기
//		Stage membershipForm = (Stage) root.getScene().getWindow();
//		FXMLLoader loader = new FXMLLoader(
//				getClass().getResource("../../membershipForm.fxml"));
//		
		Parent member = null;
		try {
			member = loader.load();
			
			membershipForm.setScene(new Scene(member));
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		Controller ctrl = loader.getController();
		ctrl.setMember(member);
		
		ComboBox<String> cmbAge = 
				(ComboBox<String>) member.lookup("#cmbAge");
		
		cmbAge.getItems().addAll("20대 미만", "20대", "30대", 
				"40대", "50대", "60대이상");
		
		membershipForm.setTitle("회원가입창");
		membershipForm.show();
		
	}

}