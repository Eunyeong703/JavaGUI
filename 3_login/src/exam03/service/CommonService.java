package exam03.service;

import javafx.event.ActionEvent;

// 공통된 기능을 가진 메서드 정의
public interface CommonService {
	public void windowClose(ActionEvent event);
	public void errorMsg(String subject, String head, String content);
}