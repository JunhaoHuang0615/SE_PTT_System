
package View;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.ScrollPane;
import java.awt.event.ActionListener;
import java.util.LinkedHashMap;
import java.util.Map;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

import Model.*;
import Model.Class;

public class CourseDirectorView extends JPanel implements ListSelectionListener{

	private JList<Request> requestList;
	
	private JTextArea textArea;
	
	private DefaultListModel<Request> listModel;
	
	JButton createButton;
	
	JButton saveButton;
	
	JComboBox<Class> classIdBox;
	
	JTextField inputNumOfTEacher;
	
	JComboBox<String> requiredTimeBox;
	
	JComboBox<String> skillBox;
	
	public CourseDirectorView(ActionListener controller) {
		
		Color bgColor = new Color(0, 255, 0);
		this.setBackground(bgColor);
		this.setLayout(new GridLayout(1,3));
		
		//========================================
		//==========Request List Panel============
		//========================================
		
		JPanel requestListJPanel = new JPanel();
		requestListJPanel.setLayout(new GridLayout(2,1));
		listModel = new DefaultListModel<Request>();
		JLabel requestListLa = new JLabel("Request List");
		
		//add element to the listModel
		for (Request request : List_Of_Request.getInstance()) {
			listModel.addElement(request);
		}
		
		// add listModel to the list
		requestList = new JList<Request>(listModel);
		requestList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		requestList.setSelectedIndex(0);
		requestList.addListSelectionListener(this);
		requestList.setVisibleRowCount(5);
		
		JScrollPane scrollPane = new JScrollPane(requestList);
		
		requestListJPanel.add(requestListLa);
		requestListJPanel.add(scrollPane);
		this.add(requestListJPanel);
		
		//========================================
		//==========Request List Panel============
		//========================================
		JPanel detailPan = new JPanel();
		detailPan.setLayout(new GridLayout(2,1));
		textArea = new JTextArea();
		textArea.setEditable(false);
		textArea.setText(requestList.getSelectedValue().showDetails());
		JLabel detailLabel = new JLabel("Request Detail");
		detailPan.add(detailLabel);
		detailPan.add(textArea);
		this.add(detailPan);
		
		
		//========================================
		//==========input and button Panel========
		//========================================
		
		//int classId,int numOfTeacher, String requiredSkill
		JPanel inputPanel = new JPanel();
		inputPanel.setLayout(new GridLayout(5, 2));
		
		JLabel classId = new JLabel("ClassID: ");
		classIdBox = new JComboBox<Class>();
		for (Class classEle : List_Of_Class.getInstance().getClassList()) {
			classIdBox.addItem(classEle);
			
		}
		inputPanel.add(classId);
		inputPanel.add(classIdBox);
		
		JLabel numOfTeacher = new JLabel("Number of Teacher: ");
		inputNumOfTEacher = new JTextField();
		inputNumOfTEacher.requestFocus();
		inputPanel.add(numOfTeacher);
		inputPanel.add(inputNumOfTEacher);
		
		JLabel requiredTime = new JLabel("Required Time: ");
		requiredTimeBox = new JComboBox<String>();
		requiredTimeBox.addItem("Mon.");
		requiredTimeBox.addItem("Tue.");
		requiredTimeBox.addItem("Wed.");
		requiredTimeBox.addItem("Thu.");
		requiredTimeBox.addItem("Fri.");
		requiredTimeBox.addItem("Sat.");
		requiredTimeBox.addItem("Sun.");
		inputPanel.add(requiredTime);
		inputPanel.add(requiredTimeBox);
		
		JLabel requiredSkill = new JLabel("Required skill: ");
		skillBox = new JComboBox<String>();
		skillBox.addItem("Software_Enginnering");
		skillBox.addItem("Advanced_Programing");
		skillBox.addItem("Data_Structure");
		skillBox.addItem("Cycber_Security");
		skillBox.addItem("Internet_Technology");
		skillBox.addItem("Art");
		skillBox.addItem("Science");
		inputPanel.add(requiredSkill);
		inputPanel.add(skillBox);
		
		createButton = new JButton("Create");
		createButton.addActionListener(controller);
		
		saveButton = new JButton("Save");
		saveButton.addActionListener(controller);
		
		inputPanel.add(createButton);
		inputPanel.add(saveButton);
		
		this.add(inputPanel);
		
	}
	
	public void updateView() {
//		listModel.removeAllElements();
		for (Request request : List_Of_Request.getInstance()) {
			listModel.addElement(request);
		}
		
		inputNumOfTEacher.setText("");
		inputNumOfTEacher.requestFocus();
		
	}

	@Override
	public void valueChanged(ListSelectionEvent e) {
		if(e.getValueIsAdjusting()==false){
			if(requestList.getSelectedValue()!=null)
			textArea.setText(requestList.getSelectedValue().showDetails());
			else {
				textArea.setText("");
			}
		}
		
	}

	public JButton getCreateButton() {
		return createButton;
	}
	
	public JButton getSaveButton() {
		return saveButton;
	}
	public Map<String, String> getInformation() {
		Map<String, String> inputMap = new LinkedHashMap<String, String>();
		String classID = "ClassID";
		Class classInstance = (Class)classIdBox.getSelectedItem();
		String classIDValue = ""+classInstance.getClassID();
		inputMap.put(classID, classIDValue);
		
		String numTeacher = "NumTeacher";
		String numTeaVal = inputNumOfTEacher.getText();
		inputMap.put(numTeacher, numTeaVal);
		
		String requiredTime = "RequiredTime";
		String requiredTimeVal = ""+requiredTimeBox.getSelectedItem();
		inputMap.put(requiredTime, requiredTimeVal);
		
		String requiredSkill = "RequiredSkill";
		String requiredSkillVal = "" + skillBox.getSelectedItem();
		inputMap.put(requiredSkill, requiredSkillVal);
		
		return inputMap;
		
	}
	
	
	
	
}

