package Controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.util.Map;

import Model.Class_Director;
import Model.List_Of_Request;

import Model.ModelManager;
import Model.User;
import Model.WriterToFile;

import Model.Request;
import View.SystemWindow;

public class Controller implements ActionListener, WindowListener{


	private static Controller instance; 
	private SystemWindow view;
	
	private Controller() {

	}
	
	public static Controller getController() {
		if(instance == null) {
			instance = new Controller();
		}
		return instance;
	}

	
	public void setView(SystemWindow view) {
		this.view = view;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {

//		if(e.getSource() == ) {
//			
//		}
		//===========================================================
		//=====================For Class Director event==============
		//===========================================================
		if(e.getSource() == view.getInnerPanel().getCourseDirectorView().getCreateButton()) {
			
			Map<String, String> inputInformation = view.getInnerPanel().getCourseDirectorView().getInformation();
			
			Class_Director.getInstance().creatRequest(Integer.parseInt(inputInformation.get("ClassID")), 
						Integer.parseInt(inputInformation.get("NumTeacher")), inputInformation.get("RequiredTime"), 
						inputInformation.get("RequiredSkill"));
			
			
			view.getInnerPanel().getCourseDirectorView().updateView();	
		}
		else if(e.getSource()==view.getInnerPanel().getCourseDirectorView().getSaveButton()) {
			WriterToFile writer = new WriterToFile("Ken.txt");
			writer.writeToFile();
		}
		
		
		//===========================================================
		//=====================PTT director event====================
		//===========================================================

		else if(e.getSource() == view.getApproveBtn()) {
			int index = view.getPTTDirectorView().getReqList().getSelectedValue().getRequestId();
			view.getPTTDirectorView().getReqList().clearSelection();
			approveRequest(index);
			view.getPTTDirectorView().updateModel();
			   view.getPTTDirectorView().updateView();
		}
		else if(e.getSource() == view.getRejectBtn()) {
			int index = view.getPTTDirectorView().getReqList().getSelectedValue().getRequestId();
			view.getPTTDirectorView().getReqList().clearSelection();
			rejectRequest(index);
			view.getPTTDirectorView().updateModel();
			   view.getPTTDirectorView().updateView();
		}


		//===========================================================
		//=====================login view event====================
		//===========================================================
		
		else if(e.getSource() == view.getADMBtn()) {
			view.getInnerPanel().setLGVDisable();
			view.getInnerPanel().showAV();
		}
		else if(e.getSource() == view.getCDBtn()) {
			view.getInnerPanel().setLGVDisable();
			view.getInnerPanel().showCDV();
		}
		else if(e.getSource() == view.getPTTDBtn()) {
			view.getInnerPanel().setLGVDisable();
			view.getInnerPanel().showPDV();
		}

	}
	
	public void approveRequest(int id) {
		List_Of_Request.getInstance().getRequest(id).requestAccepted();

	}
	
	public void rejectRequest(int id) {
		List_Of_Request.getInstance().getRequest(id).requestRejected();
	}

	@Override
	public void windowOpened(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowClosing(WindowEvent e) {
		// TODO Auto-generated method stub
		WriterToFile writer = new WriterToFile("Ken.txt");
		writer.writeToFile();
	}

	@Override
	public void windowClosed(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowIconified(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowDeiconified(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowActivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowDeactivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

}
