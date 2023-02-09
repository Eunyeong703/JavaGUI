package exam02;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Frame;
import java.awt.Toolkit;

public class Exam02 extends Frame{
	public Exam02(String title) {
		// 프레임 이름 지정
		super(title);
		// 프레임의 사이즈
		super.setSize(700, 500);
		// 프레임의 속성
		super.setLayout(new BorderLayout());

		// 화면의 크기 계산
		Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
		int xPos = (int)(screen.getWidth()/2 - this.getWidth()/2);
		int yPos = (int)(screen.getHeight()/2 - this.getHeight()/2);
		
		// 화면의 위치 지정
		super.setLocation(xPos, yPos);
		// 사이즈 변경 가능 여부
		super.setResizable(false);
		// 프레임 화면에 보이기 여부
		super.setVisible(true);
	}
	
	public static void main(String[] args) {
		Exam02 e = new Exam02("테스트");
	}
}