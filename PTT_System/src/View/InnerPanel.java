package View;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class InnerPanel extends JPanel{
	
	private LoginView lv;
	private CourseDirectorView cdv;
	private AdminView av;
	private PTTDirectorView pdv;
	private LoginView lgv;
	private JLabel subtitle;
	private ArrayList<JPanel> panelArr;

	public InnerPanel() {
		
		subtitle = new JLabel();
		panelArr = new ArrayList<JPanel>();
		
		lgv = new LoginView();
		cdv = new CourseDirectorView();
		av = new AdminView();
		pdv = new PTTDirectorView();
		
//		Color bgColor = new Color(0, 0, 0);
//		this.setBackground(bgColor);
		this.setLayout(new BorderLayout());
		
		this.subtitle.setText("Text shows here");
		this.add(subtitle,BorderLayout.NORTH);

		
		
	}
	
	public PTTDirectorView getPTTDirectorView() {
		return pdv;
	}
	
	public CourseDirectorView getCourseDirectorView() {
		return cdv;
	}
	
	public LoginView getLoginView() {
		return lgv;
	}
	
	public void setLGVDisable() {
		lgv.setDisable();
	}

	public void showLGV() {
		
		this.add(lgv,BorderLayout.CENTER);
		this.subtitle.setText("<html>User Welcome!</html>");
	}
	
	public void showCDV() {
		//this.lgv.setDisable();
		this.add(cdv,BorderLayout.CENTER);
		this.subtitle.setText("CourseDirector Welcome!");
		
	}
	
	
	public void showAV() {
		//this.lgv.setDisable();
		this.add(av,BorderLayout.CENTER);
		this.subtitle.setText("ID / Name / Skill / Time "
				+ "                                     Teacher List     Approved Requests     "
				+ "                                            Hello Admin");
		
	}
	
	public void showPDV() {
		//this.lgv.setDisable();
		this.add(pdv,BorderLayout.CENTER);
		this.subtitle.setText("PTT Director!         Welcome!");
		
	}
}

