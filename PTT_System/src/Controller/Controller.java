package Controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import Model.List_Of_Request;

public class Controller implements ActionListener{

	private static Controller instance; 
	private Controller() {
		
	}
	
	public static Controller getController() {
		if(instance == null) {
			instance = new Controller();
		}
		return instance;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
//		if(e.getSource() == ) {
//			
//		}
	}
	
	public void approveRequest(int id) {
		List_Of_Request.getInstance().getRequest(id).requestAccepted();
	}

}
