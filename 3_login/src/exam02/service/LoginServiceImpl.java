package exam02.service;

import javafx.scene.Parent;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

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
	public void cancelProc(Parent root) {
		// TODO Auto-generated method stub
		// 문제 : 취소 버튼이 눌리면 입력한 아이디 / 암호 지우기
		TextField id = (TextField) root.lookup("#txtId");
		PasswordField pw = (PasswordField) root.lookup("#txtPw");
		
		//id.setText("");
		//pw.setText("");
		// clear() : 값을 지운다.
		id.clear();
		pw.clear();
		System.out.println("취소 버튼이 눌렸습니다.");
	}

	@Override
	public void membershipProc(Parent root) {
		// TODO Auto-generated method stub
		System.out.println("회원가입 버튼이 눌렸습니다.");
	}

}