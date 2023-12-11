//package day15_03_innerClass;
//
//import java.awt.Button;
//import java.awt.Frame;
//import java.awt.event.ActionEvent;
//import java.awt.event.ActionListener;
//
//public class InnerMain {
//	
//	// ~~Listener: 인터페이스 기반의 이벤트 처리
//	// ~ : 클래스 기반의 이벤트 처리
//	
//	class EventHandler implements ActionListener{ 
//
//		@Override
//		public void actionPerformed(ActionEvent e) {
//			System.out.println("ActionEvent 발생했습니다.");
//			System.out.println(e.getActionCommand());
//		}
//	}
//	
//	public static void main(String[] args) {
//		Frame frame = new Frame("이벤트 처리 - 이너클래스");//프레임 = 화면
//		Button btn = new Button("push me");
//		
//		EventHandler handler = new InnerMain().new EventHandler();
//		btn.addActionListener(handler); //버튼에 액션 이벤트 추가
//		
//		frame.add(btn); //프레임(윈도우)에 버튼 컴포넌트를 추가
//		frame.setVisible(true);
//		frame.setSize(300, 150);
//	}
//}


package day15_03_innerClass;

import java.awt.Button;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;


public class InnerMain {
	
	public static void main(String[] args) {
		Frame frame = new Frame("이벤트 처리 - 이너클래스");//프레임 = 화면
		Button btn = new Button("push me");
		
		btn.addActionListener(new ActionListener() { //익명(무명) 클래스
			public void actionPerformed(ActionEvent e) {
				System.out.println("ActionEvent 발생했습니다.");
				System.out.println(e.getActionCommand());
				System.out.println(e.getSource());
				System.out.println("이것은 지금 만든 익명 클래스 이벤트 처리");
			}
		}); //버튼에 액션 이벤트 추가

		frame.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}	
		});
		
		frame.add(btn); //프레임(윈도우)에 버튼 컴포넌트를 추가
		frame.setVisible(true);
		frame.setSize(300, 150);
		frame.setLocation(300, 150);
	}
}
