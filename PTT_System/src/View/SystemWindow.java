
package View;

import javax.swing.JFrame;

import Controller.Controller;

public class SystemWindow extends JFrame{
	
	private int unitPixel = 20;
	private InnerPanel ip;
	
	public SystemWindow(Controller controller) {
		
		this.setTitle("This System");
		this.setSize(40 * unitPixel, 22 * unitPixel);
		this.setLocation(40 * unitPixel, 22 * unitPixel);
		this.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
		ip = new InnerPanel(controller);
		
		this.add(ip);
		
		this.setVisible(true);

	}
	
	public InnerPanel getInnerPanel() {
		return ip;
	}
}

