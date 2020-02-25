package Model;

import java.util.ArrayList;

public class Admin extends User {
	

	
public Admin(String name) {
		super(name);
	}

//============================================
//=============== Constructor ================
//============================================
	

	
	public ArrayList<Request> checkRequestList(List_Of_Request requestList) {
		return requestList.getAcceptedList();	
	}
	
	public ArrayList<Teacher> checkTeacherList(List_Of_Teacher teacherList){
		return teacherList.getTeacherList();
	}

	

}
