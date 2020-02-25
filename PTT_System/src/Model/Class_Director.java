package Model;

public class Class_Director extends User{
	public Class_Director(String name) {
		super(name);
	}
	//================================================
	//============= Attributes========================
	//================================================
	
	
	//================================================
	//============= Methods ==========================
	//================================================
	
	//// Want to add teaching request to the request list
	/***
	 * 
	 * @param request the request want to add
	 * @param requestList which list want to add in
	 */
	public void addToList(Request request, List_Of_Request requestList) {
		requestList.addToList(request);
	}

}
