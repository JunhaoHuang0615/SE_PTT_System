package Model;

import java.util.ArrayList;

public class Class_Director extends User{


	//================================================
	//============= Attributes========================
	//================================================

	
	//================================================
	//============= Methods ==========================
	//================================================
	
	public Class_Director(String name) {
		super(name);
	}

	//// Want to add teaching request to the request list
	/***
	 * 
	 * @param request the request want to add
	 * @param requestList which list want to add in
	 */
	public void addToList(Request request, List_Of_Request requestList) {
		requestList.addToList(request);
	}
	
	public ArrayList<Request> checkRequestList(List_Of_Request requestList) {
		return requestList.getUndisposedList();
	}
	
	public void creatRequest(int classId,int numOfTeacher, String requiredSkill) {
		
		Request r = SystemFactory.createRequest(numOfTeacher, classId, 0, requiredSkill);
		List_Of_Request.getInstance().addToList(r);
	}
	
	

}
