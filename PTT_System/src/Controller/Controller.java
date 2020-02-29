package Controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Map;

import Model.Class_Director;
import Model.List_Of_Request;
import Model.ModelManager;
import Model.User;
import Model.WriterToFile;
import View.SystemWindow;

public class Controller implements ActionListener{

//	private  Controller instance; 
	private SystemWindow systemWindow;
	private User user;

	public Controller(User user) {
		this.user = user;
	}
	
	public void setSystem(SystemWindow view) {
		this.systemWindow = view;
	}

	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
//		if(e.getSource() == ) {
//			
//		}
		//===========================================================
		//=====================For Class Director event==============
		//===========================================================
		if(e.getSource() == systemWindow.getInnerPanel().getCdv().getCreateButton()) {
			
			Map<String, String> inputInformation = systemWindow.getInnerPanel().getCdv().getInformation();
			
			if(user instanceof Class_Director) {
				user = (Class_Director)user;
				((Class_Director) user).creatRequest(Integer.parseInt(inputInformation.get("ClassID")), 
						Integer.parseInt(inputInformation.get("NumTeacher")), inputInformation.get("RequiredTime"), 
						inputInformation.get("RequiredSkill"));
			}
			
			systemWindow.getInnerPanel().getCdv().updateView();	
		}
		if(e.getSource()==systemWindow.getInnerPanel().getCdv().getSaveButton()) {
			WriterToFile writer = new WriterToFile("Ken.txt");
			writer.writeToFile();
		}
		
		
		//===========================================================
		//=====================PTT director event====================
		//===========================================================
	}
	
	public void approveRequest(int id) {
		List_Of_Request.getInstance().getRequest(id).requestAccepted();

	}

}
