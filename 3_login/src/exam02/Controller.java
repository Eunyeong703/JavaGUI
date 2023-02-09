package exam02;

import exam02.service.LoginService;
import exam02.service.LoginServiceImpl;
import javafx.scene.Parent;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class Controller {
	private Parent root;
	private LoginService ls;
	
	public Controller() {
		ls = new LoginServiceImpl();
	}
	
	public void setRoot(Parent root) {
		// TODO Auto-generated method stub
		this.root = root;
	}

	// 문제 : 각 버튼을 눌렀을 때 아래의 메세지가 출력 되도록 만들어보세요
	public void loginProc() {
		ls.loginProc(root);
	}
	
	public void cancelProc() {
		ls.cancelProc(root);
	}
	
	public void membershipProc() {
		ls.membershipProc(root);
	}
}