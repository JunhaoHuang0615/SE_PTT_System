package View;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.MouseAdapter;
import java.util.ArrayList;

import javax.swing.BorderFactory;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.ListSelectionModel;
import javax.swing.ScrollPaneConstants;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

import Controller.Controller;
import Model.List_Of_Request;
import Model.Request;

public class PTTDirectorView extends JPanel implements ListSelectionListener {
	
	private JList<Request> reqList;
	private RightPanel rightPanel;
	private String[] reqs = {"aa","bb","cc","dd","ee","ff","gg","gg","gg","gg","gg","gg","gg","gg","gg","gg","gg","gg","gg","gg","gg","gg","gg"};
	private JScrollPane scrollPane;
	private DataModel reqArr;
	
	public class Panel2 extends JPanel{
		
		private JList approvedReqList;
		private JLabel reqDetial;
		private DataModel aprvdReqArr;
		private JScrollPane approvedScrollPane;
		
		public Panel2() {
			
			aprvdReqArr = new DataModel(1);
			approvedReqList = new JList(aprvdReqArr);
			reqDetial = new JLabel();
			
			reqDetial.setText("where request detials showed");
			reqList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
			approvedScrollPane = new JScrollPane(approvedReqList, ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS,
	                ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED);

			
			this.setLayout(new GridLayout(1,2));
			
			this.add(reqDetial);
			this.add(approvedScrollPane);
			
		}
		
		public JLabel getDetialLabel() {
			return reqDetial;
		}
	}
	
	public class DataModel extends DefaultListModel{
		
		ArrayList<Request> arr = new ArrayList<Request>();
		private int flag;
		
		public DataModel(int flag) {
			
			this.flag = flag;
			modelInit(flag);
	
		}
		
		public void modelInit(int flag) {
			if(flag == 0) {
			    for(Request r : List_Of_Request.getInstance().getUndisposedList()) {
			    	arr.add(r);
			}
			}
			else if (flag == 1) {
				for(Request r : List_Of_Request.getInstance().getAcceptedList()) {
					arr.add(r);
				}
			}
			for(Request r : arr) {
				addElement(r);
			}
		}
		
		public Request get(int index) {
			return arr.get(index);
		}
	}
	
	
	public class Panel3 extends JPanel {
		
		private JButton btn1;
		private JButton btn2;
		
		public Panel3() {
			
			btn1 = new JButton("Approve");
			btn2 = new JButton("Refuse");
			
			btn1.addActionListener(Controller.getController());
			btn2.addActionListener(Controller.getController());
			
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
		
		public JLabel getDetialLabel() {
			return p2.getDetialLabel();
		}
	}
	

	public PTTDirectorView() {
		
		reqArr = new DataModel(0);
		reqList = new JList(reqArr);
		rightPanel = new RightPanel();
		
		reqList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		scrollPane = new JScrollPane(reqList, ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS,
                ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		
		reqList.addListSelectionListener(this);
		reqList.setBorder(BorderFactory.createTitledBorder("Unapproved Requests:"));

		//reqList.setPreferredSize(new Dimension(200,100));
		
		//Color bgColor = new Color(0, 255, 255);
		//this.setBackground(bgColor);
		this.setLayout(new GridLayout(1,2));
		
		
		this.add(scrollPane);
		this.add(rightPanel);
		
		
	}
	
	public void updateView() {
		
	}

	@Override
	public void valueChanged(ListSelectionEvent e) {
		// TODO Auto-generated method stub
		if(!e.getValueIsAdjusting()) {
			rightPanel.getDetialLabel().setText(reqList.getSelectedValue().showUPDetails());
		}
	}
	
}
