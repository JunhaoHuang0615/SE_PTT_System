package Model;

public class PTT_Director extends User{

	
	
	
	//================================================
	//============= Methods ==========================
	//================================================
	
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
