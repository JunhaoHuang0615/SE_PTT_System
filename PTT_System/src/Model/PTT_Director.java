package Model;

import java.util.ArrayList;

public class PTT_Director extends User{


	//================================================
	//============= Methods ==========================
	//================================================
	
	
	public PTT_Director(String name) {
		super(name);
	}

	public ArrayList<Request> checkRequirement(List_Of_Request requestList) {
		return requestList.getUndisposedList();
	}
	
	public ArrayList<Request> checkApproved(List_Of_Request requestList){
		return requestList.getAcceptedList();
	}
	
	//Want to accept a request
	/***
	 * 
	 * @param acceptedRequest the request want to accepted
	 */
	public void acceptRequest(Request acceptedRequest) {
		acceptedRequest.requestAccepted();
	}
	
	//Want to reject a request
	/***
	 * 
	 * @param acceptedRequest the request want to accepted
	 */
	public void rejectRequest(Request rejectedRequest) {
		rejectedRequest.requestRejected();
	}
	
}
