package Model;

import java.util.ArrayList;

public class Admin extends User {
	

	
	

//============================================
//=============== Constructor ================
//============================================
	
	private static Admin instance;
	private Admin() {
		super("Administrator");
	}
	
	public static Admin getInstance() {
		if(instance == null) {
			instance = new Admin();
		}
		return instance;
	}
	
	public ArrayList<Request> checkRequestList(List_Of_Request requestList) {
		return requestList.getAcceptedList();	
	}
	
	public ArrayList<Teacher> checkTeacherList(List_Of_Teacher teacherList){
		return teacherList.getTeacherList();
	}

	


}
