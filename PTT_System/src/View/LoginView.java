
package View;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JPanel;

import Controller.Controller;

public class LoginView extends JPanel{
	
	private JButton pttBtn;
	private JButton cdBtn;
	private JButton admBtn;
	private JPanel panel;
	
	public LoginView() {
		
		panel = new JPanel();
		pttBtn = new JButton("PTT Director");
		cdBtn = new JButton("Course Director");
		admBtn = new JButton("Admin");
		
		pttBtn.addActionListener(Controller.getController());
		cdBtn.addActionListener(Controller.getController());
		admBtn.addActionListener(Controller.getController());
		
		
		panel.setLayout(new GridLayout(3,1));
		
		Color bgColor = new Color(255, 255, 255);
		this.setBackground(bgColor);
		this.setLayout(new BorderLayout());
		panel.add(cdBtn);
		panel.add(pttBtn);
		panel.add(admBtn);
		this.add(panel,BorderLayout.CENTER);
	}
	
	public JButton getPttBtn() {
		return pttBtn;
	}

	public JButton getCdBtn() {
		return cdBtn;
	}

	public JButton getAdmBtn() {
		return admBtn;
	}

	public JPanel getPanel() {
		return panel;
	}
	
	public void setDisable() {
		cdBtn.setEnabled(false);
		admBtn.setVisible(false);
		pttBtn.setVisible(false);
		panel.setVisible(false);
		this.setVisible(false);
		this.setVisible(false);
	}
		
	
}

