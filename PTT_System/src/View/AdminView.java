package View;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import javax.swing.DefaultListModel;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.ListSelectionModel;
import javax.swing.ScrollPaneConstants;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

import Model.List_Of_Request;
import Model.List_Of_Teacher;
import Model.Request;
import Model.Teacher;


public class AdminView extends JPanel implements ListSelectionListener{
	
	private JList<Teacher> teacherList;
	private DataModel teacherArr;
	private JScrollPane teacherScrollPane;
	private RightPanel rightPanel;
	
	
	public class DataModel extends DefaultListModel{
		
		private int flag;
		
		public DataModel(int flag) {
			
			this.flag = flag;
			modelInit(this.flag);
			
		}
		
		public void modelInit(int flag) {
			if (flag == 0) {
				for(Teacher t : List_Of_Teacher.getInstance().getTeacherList()) {
					this.addElement(t);
				}
			}
			if (flag == 1) {
				for(Request r : List_Of_Request.getInstance().getAcceptedList()) {
					this.addElement(r);
				}
			}
		}
		
	
	}
	
	public class RightPanel extends JPanel{
		
		private JList<Request> approvedReqList;
		private JLabel reqDetial;
		private DataModel approevdArr;
		private JScrollPane approvedScrollpane;
		
		public RightPanel() {
			
			approevdArr = new DataModel(1);
			approvedReqList = new JList<Request>(approevdArr);
			reqDetial = new JLabel();
			reqDetial.setHorizontalAlignment(JLabel.CENTER);
			reqDetial.setText("");
			approvedReqList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
			
			approvedScrollpane = new JScrollPane(approvedReqList, ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS,ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED);
			
			
			this.setLayout(new GridLayout(2,1));
			
			this.add(approvedScrollpane);
			this.add(reqDetial);
		}
		
		public JList<Request> getApprovedReqList() {
			return approvedReqList;
		}

		public JLabel getReqDetial() {
			return reqDetial;
		}
		
	}
	
	

	public AdminView() {
		
		teacherArr = new DataModel(0);
		teacherList = new JList<Teacher>(teacherArr);
		rightPanel = new RightPanel();
		
		teacherList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		teacherScrollPane = new JScrollPane(teacherList, ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS, ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		rightPanel.getApprovedReqList().addListSelectionListener(this);
		
//		Color bgColor = new Color(0, 0, 255);
//		this.setBackground(bgColor);
		this.setLayout(new GridLayout(1,2));
		
		this.add(teacherScrollPane);
		this.add(rightPanel);
		
	}
	
	public RightPanel getRightPanel() {
		return rightPanel;
	}

	@Override
	public void valueChanged(ListSelectionEvent e) {
		// TODO Auto-generated method stub
		if(!e.getValueIsAdjusting()) {
			this.getRightPanel().getReqDetial().setText(this.getRightPanel().getApprovedReqList().getSelectedValue().showUPDetails());
		}
		else {
			this.getRightPanel().getReqDetial().setText("");
		}
		
	}
	
}
