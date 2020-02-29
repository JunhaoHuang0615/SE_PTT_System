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
	private JLabel subtitle;
	private ArrayList<JPanel> panelArr;

	public InnerPanel(ActionListener controller) {
		
		subtitle = new JLabel();
		panelArr = new ArrayList<JPanel>();
		
		lv = new LoginView();
		cdv = new CourseDirectorView(controller);
		av = new AdminView();
		pdv = new PTTDirectorView();
		
		Color bgColor = new Color(0, 0, 0);
		this.setBackground(bgColor);
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
		this.subtitle.setText("Set Text");
	}
	
	public void showPDV() {
		this.add(pdv,BorderLayout.CENTER);
		this.subtitle.setText("Set Text");
	}
}
