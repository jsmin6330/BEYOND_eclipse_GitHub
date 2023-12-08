package day15_01_thread.ex3;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.util.Random;

import javax.swing.JFrame;

public class GraphicThread extends JFrame implements Runnable { //frame: window
	
	int num, x, y;
	Color color;
	Random random;
	

	public GraphicThread(int num) {
		this.num = num;
		color = Color.darkGray;
		random = new Random();
		setSize(500, 400); //프레임(화면) 크기 - 너비, 높이  
		setVisible(true);//화면 보여주기
		setLocation(300, 150);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	

	@Override
	public void paint(Graphics g) {
		g.setColor(color);
//		g.fillRect(x, y, 3, 3);
		g.fillOval(x, y, 10, 10);
	}


	@Override
	public void run() {
		Rectangle rect = getBounds(); //둥근 라운드 모서리의 사각형을 그린다.
		
		for(int i = 0; i<num; i++) {
			x = random.nextInt(rect.width); //너비를 벗어나지마
			y = random.nextInt(rect.height); //높이를 벗어나지마
			
			repaint();
			
			try {
				Thread.sleep(100);
			} catch (Exception e) {
				e.printStackTrace();
			}
			
		}//for end
	}
	
	public static void main(String[] args) {
//		GraphicThread gt = new GraphicThread(100);
//		Thread t1 = new Thread(gt);
//		t1.start();
		
		new Thread(new GraphicThread(2000)).start(); //2000개 찍어줘
	}

}
