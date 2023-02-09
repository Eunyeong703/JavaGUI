package exam03.service;

import javafx.event.ActionEvent;
import javafx.scene.Parent;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.stage.Stage;

public class CommonServiceImpl implements CommonService{

	@Override
	public void windowClose(ActionEvent event) {
		// TODO Auto-generated method stub
		// 이벤트에서 Parent 가져오기
		Parent p = (Parent) event.getSource();
		// Parent 에서 Stage 가져오기
		Stage s = (Stage) p.getScene().getWindow();
		// Stage 닫기
		s.close();
		// 문제 membershipForm 에서 취소 버튼을 누르면 창이 닫히도록 해보기
	}

	@Override
	public void errorMsg(String subject, String head, String content) {
		// TODO Auto-generated method stub
		Alert alert = new Alert(AlertType.INFORMATION);
		alert.setTitle(subject);
		alert.setHeaderText(head);
		alert.setContentText(content);
		alert.showAndWait();
	}

}