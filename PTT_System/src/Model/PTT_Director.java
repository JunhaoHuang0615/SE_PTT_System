package Model;

public class PTT_Director extends User{

	public PTT_Director(String name) {
		super(name);
	}


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
