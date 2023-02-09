package exam04.service;

import exam04.Member;
import exam04.dao.DatabaseService;
import exam04.dao.DatabaseServiceImpl;
import javafx.scene.Parent;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.PasswordField;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class MemberServiceImpl implements MemberService{
	CommonService cs;
	DatabaseService ds;
	
	public MemberServiceImpl() {
		// TODO Auto-generated constructor stub
		cs = new CommonServiceImpl();
		ds = new DatabaseServiceImpl();
	}

	@Override
	public void joinMember(Parent membership) {
		// TODO Auto-generated method stub
		// 이름 : txtName, 아이디 : txtId, 암호 : txtPw, 암호확인 : txtPwOk
		// 입력 된 값을 출력해보세요

		String txtFldName[] = {"#txtName", "#txtId", "#txtPw", "#txtPwOk"};
		String columnName[] = {"이름","아이디","암호","암호확인"};
		TextField txtFld[] = new TextField[2];
		PasswordField pwFld[] = new PasswordField[2];

		Member m = new Member();
		
		for(int i=0;i<txtFldName.length;i++) {
			if(i < 2) {
				txtFld[i] = (TextField) membership.lookup(txtFldName[i]);
				if(txtFld[i].getText().isEmpty()) {
					// 에러 표시 - alert 로 실행
					// CommonService 에 errorMsg("제목", "헤드", "콘텐츠");
					// "입력에러", "비어 있는 컬럼", 컬럼명 + "필드가 비어있습니다.");
					cs.errorMsg("입력 에러", "비어 있는 컬럼", columnName[i] + " 필드가 비어 있습니다.");
					txtFld[i].requestFocus();
					return;
				}
			} else if(i<4) {
				pwFld[i-2] = (PasswordField) membership.lookup(txtFldName[i]);
				if(pwFld[i-2].getText().isEmpty()) {
					cs.errorMsg("입력 에러", "비어 있는 컬럼", columnName[i] + " 필드가 비어 있습니다.");
					pwFld[i-2].requestFocus();
					return;
				}
			}
		}
		
		// 암호 와 암호 확인의 값이 같은 때는 암호가 일치한다는 Alert 메시지 출력
		// 같지 않을 때는 암호가 일치하지 않는다는 Alert 메시지 출력		
		if(pwFld[0].getText().equals(pwFld[1].getText())) {
			cs.errorMsg("암호", "암호일치여부", "암호가 일치합니다.");
			m.setName(txtFld[0].getText());
			m.setId(txtFld[1].getText());
			m.setPw(pwFld[0].getText());
		} else {
			cs.errorMsg("암호", "암호일치여부", "암호가 틀립니다.");
			pwFld[0].clear();
			pwFld[1].clear();
			pwFld[0].requestFocus();
			return;
		}

		RadioButton rdoMan = (RadioButton) membership.lookup("#rdoMan");
		RadioButton rdoWoman = (RadioButton) membership.lookup("#rdoWoman");
		
		if(!rdoMan.isSelected() && !rdoWoman.isSelected()) {
			cs.errorMsg("성별", "성별 선택", "성별이 선택되지 않았습니다.");
			// setSelected(true) : 미리 체크 해 주기
			rdoMan.setSelected(true);
			return;
		} else if(rdoMan.isSelected()) {
			m.setGender(true);
		} else if(rdoWoman.isSelected()) {
			m.setGender(false);
		}
		
		ComboBox<String> cmbAge = 
				(ComboBox<String>) membership.lookup("#cmbAge");
		
		// ComboBox.getValue() : 선택된 Text를 가져온다.
		// 20대미만 : 10, 20대 : 20, 30대 : 30, 40대 : 40, 50대 : 50, 
		// 60대이상 : 60 으로 Member 객체에 저장 해 보세요
		if(cmbAge.getValue() == null) {
			cs.errorMsg("나이", "나이대 선택", "나이대가 선택되지 않았습니다.");
			cmbAge.requestFocus();
			return;
		} else if(cmbAge.getValue().equals("20대미만")) {
			m.setAge(10);
		} else if(cmbAge.getValue().equals("20대")) {
			m.setAge(20);
		} else if(cmbAge.getValue().equals("30대")) {
			m.setAge(30);
		} else if(cmbAge.getValue().equals("40대")) {
			m.setAge(40);
		} else if(cmbAge.getValue().equals("50대")) {
			m.setAge(50);
		} else if(cmbAge.getValue().equals("60대이상")) {
			m.setAge(60);
		}
		
		// 음악이 체크 되면 1
		// 스포츠가 체크 되면 2
		// 영화가 체크 되면 4
		// 합계를 Member 객체에 hobby 에 저장해 보세요 
		int hobby = 0;
		
		CheckBox chkMusic = (CheckBox)membership.lookup("#chkMusic");
		CheckBox chkSport = (CheckBox)membership.lookup("#chkSports");
		CheckBox chkMovie = (CheckBox)membership.lookup("#chkMovie");
		
		if(chkMusic.isSelected()){
			hobby += 1;
		}
		if(chkSport.isSelected()) {
			hobby += 2;
		}
		if(chkMovie.isSelected()) {
			hobby += 4;
		}
		m.setHobby(hobby);
		
		if(ds.insert(m)) {
			Stage s = (Stage) membership.getScene().getWindow();
			s.close();
		} else {
			txtFld[0].clear();
			txtFld[1].clear();
			pwFld[0].clear();
			pwFld[1].clear();
			chkMusic.setSelected(false);
			chkSport.setSelected(false);
			chkMovie.setSelected(false);
			txtFld[0].requestFocus();
		}
	}	
}
