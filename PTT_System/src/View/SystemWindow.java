
package View;

import javax.swing.JButton;
import javax.swing.JFrame;

import Controller.Controller;

public class SystemWindow extends JFrame{
	
	private int unitPixel = 20;
	private InnerPanel ip;
	
	public SystemWindow() {
		
		this.setTitle("This System");
		this.setSize(40 * unitPixel, 22 * unitPixel);
		this.setLocation(40 * unitPixel, 22 * unitPixel);
		this.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
		ip = new InnerPanel();
		this.addWindowListener(Controller.getController());
		this.add(ip);
		
		this.setVisible(true);

	}
	
	public InnerPanel getInnerPanel() {
		return ip;
	}
	
	public JButton getApproveBtn() {
		return ip.getPTTDirectorView().getRightPanel().getP3().getApproveButton();
	}
	
	public JButton getPTTDBtn() {
		return ip.getLoginView().getPttBtn();
	}
	public JButton getCDBtn() {
		return ip.getLoginView().getCdBtn();
	}
	public JButton getADMBtn() {
		return ip.getLoginView().getAdmBtn();
	}
	
	public int getSelectedIndex() {
		return ip.getPTTDirectorView().getReqList().getSelectedIndex();
	}
	
	public PTTDirectorView getPTTDirectorView() {
		return ip.getPTTDirectorView();
	}
	
	public JButton getRejectBtn() {
		return ip.getPTTDirectorView().getRightPanel().getP3().getRejectButton();
	}
}

