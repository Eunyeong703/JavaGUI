package exam01;

import javafx.scene.Parent;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class Controller {
	private Parent root;
	
	public void setRoot(Parent root) {
		// TODO Auto-generated method stub
		this.root = root;
	}

	// 문제 : 각 버튼을 눌렀을 때 아래의 메시지가 출력되도록 만들기
	public void loginProc() {
		// 문제 : 아이디, 패스워드가 입력되면 입력된 값 출력
		// 아이디는 textField로 가져옴.
		TextField id = (TextField) root.lookup("#txtId");
		PasswordField pw = (PasswordField) root.lookup("#txtPw");
		
		System.out.println("아이디 : " + id.getText());
		System.out.println("암호 : " + pw.getText());
		System.out.println("로그인 버튼이 눌렸습니다.");
	}
	
	public void cancelProc() {
		// 문제 : 취소 버튼이 눌리면 아이디, 암호 지우기
		TextField id = (TextField) root.lookup("#txtId");
		PasswordField pw = (PasswordField) root.lookup("#txtPw");
		
		// id.setText("");
		// pw.setText("");
		// clear() : 값을 지운다.
		id.clear();
		pw.clear();
		System.out.println("취소 버튼이 눌렸습니다.");
	}
	
	public void membershipProc() {
		System.out.println("회원가입 버튼이 눌렸습니다.");
	}
}
