package Controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import Model.List_Of_Request;
import Model.Request;
import View.SystemWindow;

public class Controller implements ActionListener{

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
		// TODO Auto-generated method stub
		if(e.getSource() == view.getApproveBtn()) {
			int index = view.getPTTDirectorView().getReqList().getSelectedValue().getRequestId();
			view.getPTTDirectorView().getReqList().clearSelection();
			approveRequest(index);
			view.getPTTDirectorView().updateModel();
		}
		else if(e.getSource() == view.getRejectBtn()) {
			int index = view.getPTTDirectorView().getReqList().getSelectedValue().getRequestId();
			view.getPTTDirectorView().getReqList().clearSelection();
			rejectRequest(index);
			view.getPTTDirectorView().updateModel();
		}
		view.getPTTDirectorView().updateView();
	}
	
	public void approveRequest(int id) {
		List_Of_Request.getInstance().getRequest(id).requestAccepted();
	}
	
	public void rejectRequest(int id) {
		List_Of_Request.getInstance().getRequest(id).requestRejected();
	}

}
