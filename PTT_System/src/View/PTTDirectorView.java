package View;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.ListSelectionModel;
import javax.swing.ScrollPaneConstants;

import Model.Request;

public class PTTDirectorView extends JPanel{
	
	private JList reqList;
	private RightPanel rightPanel;
	private String[] reqs = {"aa","bb","cc","dd","ee","ff","gg","gg","gg","gg","gg","gg","gg","gg","gg","gg","gg","gg","gg","gg","gg","gg","gg"};
	private JScrollPane scrollPane;
	
	public class Panel2 extends JPanel{
		
		private JList approvedReqList;
		private JLabel reqDetial;
		
		public Panel2() {
			approvedReqList = new JList();
			reqDetial = new JLabel();
			
			reqDetial.setText("where request detials showed");
			
			this.setLayout(new GridLayout(1,2));
			
			this.add(reqDetial);
			this.add(approvedReqList);
			
		}
	}
	
	public class Panel3 extends JPanel{
		private JButton btn1;
		private JButton btn2;
		
		public Panel3() {
			
			btn1 = new JButton("Approve");
			btn2 = new JButton("Refuse");
			
			this.setLayout(new GridLayout(2,1));
			
			this.add(btn1);
			this.add(btn2);
		}
	}
	
	public class RightPanel extends JPanel{
		private Panel2 p2;
		private Panel3 p3;
		
		public RightPanel() {
			
			p2 = new Panel2();
			p3 = new Panel3();
			
			this.setLayout(new GridLayout(2,1));
			
			this.add(p2);
			this.add(p3);
		}
	}

	public PTTDirectorView() {
		
		
		reqList = new JList(reqs);
		rightPanel = new RightPanel();
		
		reqList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		scrollPane = new JScrollPane(reqList, ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS,
                ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED);

		//reqList.setPreferredSize(new Dimension(200,100));
		
		//Color bgColor = new Color(0, 255, 255);
		//this.setBackground(bgColor);
		this.setLayout(new GridLayout(1,2));
		
		
		this.add(scrollPane);
		this.add(rightPanel);
		
		
	}
	
	public void updateView() {
		
	}
	
}
