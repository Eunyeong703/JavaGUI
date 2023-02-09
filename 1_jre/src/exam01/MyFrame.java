package exam01;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Frame;

// GUI 를 사용하기 위해서는 Frame 클래스를 상속 받아야 한다.
public class MyFrame extends Frame{
	Button bt = new Button("확인");
	
	public MyFrame() {
		// 프레임의 사이즈
		super.setSize(600, 500);
		// 프레임의 속성
		super.setLayout(new BorderLayout());
		// 텍스트 입력 및 버튼 추가
		this.add("South", bt);
	}
}