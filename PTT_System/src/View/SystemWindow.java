package View;

import javax.swing.JFrame;

public class SystemWindow extends JFrame{

	private int unitPixel = 20;
	private InnerPanel ip = new InnerPanel();
	
	public SystemWindow() {
		
		this.setTitle("This System");
		this.setSize(40 * unitPixel, 22 * unitPixel);
		this.setLocation(40 * unitPixel, 22 * unitPixel);
		this.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
		
		this.add(ip);
		
		this.setVisible(true);

	}
	
	public InnerPanel getInnerPanel() {
		return ip;
	}
}
