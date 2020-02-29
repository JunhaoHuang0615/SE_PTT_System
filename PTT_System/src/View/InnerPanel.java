
package View;

import java.awt.BorderLayout;
import java.awt.Color;
import java.util.ArrayList;

import javax.swing.JLabel;
import javax.swing.JPanel;

import Controller.Controller;

public class InnerPanel extends JPanel{
	
	private LoginView lv;
	private CourseDirectorView cdv;
	private AdminView av;
	private PTTDirectorView pdv;
	private JLabel subtitle;
	private ArrayList<JPanel> panelArr;
	
	
	public LoginView getLv() {
		return lv;
	}

	public CourseDirectorView getCdv() {
		return cdv;
	}

	public AdminView getAv() {
		return av;
	}

	public PTTDirectorView getPdv() {
		return pdv;
	}

	public JLabel getSubtitle() {
		return subtitle;
	}

	public ArrayList<JPanel> getPanelArr() {
		return panelArr;
	}

	public InnerPanel(Controller controller) {
		
		subtitle = new JLabel();
		panelArr = new ArrayList<JPanel>();
		lv = new LoginView();
		cdv = new CourseDirectorView(controller);
		av = new AdminView();
		pdv = new PTTDirectorView(controller);
		
//		Color bgColor = new Color(0, 0, 0);
//		this.setBackground(bgColor);
		this.setLayout(new BorderLayout());
		
		this.subtitle.setText("Text shows here");
		this.add(subtitle,BorderLayout.NORTH);

	}
	
	public void updateView() {
		
	}
	
	
	public void showLV() {
		this.add(lv,BorderLayout.CENTER);
		this.subtitle.setText("Set Text");
	}
	
	public void showCDV() {
		this.add(cdv,BorderLayout.CENTER);
		this.subtitle.setText("Set Text");
	}
	
	public void showAV() {
		this.add(av,BorderLayout.CENTER);
		this.subtitle.setText("ID / Name / Skill / Time                                      Teacher List     Approved Requests                                                 Hello Admin");
	}
	
	public void showPDV() {
		this.add(pdv,BorderLayout.CENTER);
		this.subtitle.setText("PTT Director!         Welcome!");
	}
}

