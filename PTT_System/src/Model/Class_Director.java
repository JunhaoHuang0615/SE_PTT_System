package Model;

import java.util.ArrayList;

public class Class_Director extends User{


	//================================================
	//============= Attributes========================
	//================================================
	private static Class_Director instance;
	private Class_Director() {
		super("Class_Director");
	}
	
	//================================================
	//============= Constructor========================
	//================================================
	
	public static Class_Director getInstance() {
		if(instance == null) {
			instance = new Class_Director();
		}
		return instance;
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
	
	public void createRequest(int classId,int numOfTeacher, String requiredSkill,String requiredTime) {
		
		Request r = SystemFactory.createRequest(numOfTeacher, classId, 0, requiredSkill,requiredTime);
		List_Of_Request.getInstance().addToList(r);
	}
	
	

}
