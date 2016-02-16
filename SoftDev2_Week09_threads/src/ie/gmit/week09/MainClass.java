package ie.gmit.week09;

import javax.swing.JFrame;

public class MainClass {

	public static void main(String[] args) {
		System.out .println("main thread id "+Thread. currentThread().getId());
		JFrame win = new MyJFrame();
		win.setVisible(true);

	}

}
