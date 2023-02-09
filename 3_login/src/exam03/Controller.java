package exam03;

import exam03.service.CommonService;
import exam03.service.CommonServiceImpl;
import exam03.service.LoginService;
import exam03.service.LoginServiceImpl;
import exam03.service.MemberService;
import exam03.service.MemberServiceImpl;
import javafx.event.ActionEvent;
import javafx.scene.Parent;

public class Controller {
	private Parent root;
	private LoginService ls;
	private CommonService cs;
	private Parent member;
	private MemberService ms;
	
	public Controller() {
		ls = new LoginServiceImpl();
		cs = new CommonServiceImpl();
		ms = new MemberServiceImpl();
	}
	
	public void setRoot(Parent root) {
		// TODO Auto-generated method stub
		this.root = root;
	}
	
	public void setMember(Parent member) {
		// TODO Auto-generated method stub
		this.member = member;
	}
	
	public void loginProc() {
		ls.loginProc(root);
	}
	public void cancelProc(ActionEvent event) {
		cs.windowClose(event);
	}
	public void membershipProc() {
		ls.membershipProc(root);
	}
	
	// 문제 : 회원가입창에 회원 가입 버튼을 누르면 MemberServiceImpl 의 joinMember()
	// 메서드가 실행 되도록 해보세요. "회원 가입 버튼이 눌렸습니다." 출력 되게 하세요
	public void joinMember() {
		ms.joinMember(member);
	}


}

